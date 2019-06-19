package com.mqredisdemo.demo.Controller;

import com.mqredisdemo.demo.Common.MD5Util;
import com.mqredisdemo.demo.Entity.User;
import com.mqredisdemo.demo.Entity.UserExample;
import com.mqredisdemo.demo.Service.UserService;

import com.sun.tools.internal.ws.processor.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class TestController {
    @Autowired
    RedisTemplate<String,String> redisTemplate;
    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public String test() {
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        opsForValue.set("y","qian");
        System.out.println("11"+opsForValue.get("y"));

        return "register";
    }



//    @RequestMapping("/getAllUser")
//    @ResponseBody
//    public Result getAllUser() {
//
//        List<User> list = userService.selectByExample(example);
//        Result result = new Result();
//        result.setRows(list);
//        result.setTotal(list.size());
//        return result;
//    }

    @RequestMapping("/register")
    public String register(User user) {
        String newpwd = user.getPwd();
        user.setPwd(MD5Util.encodePwd(newpwd));
        userService.insert(user);
        return "login";
    }

    @RequestMapping("/login")
    public String login(User user) {
        UserExample example = new UserExample();
          example.createCriteria().andPnameEqualTo(user.getPname());
        List<User> list=    userService.selectByExample(example);
        MD5Util.isRightPwd(user.getPwd(),list.get(0).getPname());
      if ( MD5Util.isRightPwd(user.getPwd(),list.get(0).getPwd())){
          return "index";
      }
      return "error";
    }




}
