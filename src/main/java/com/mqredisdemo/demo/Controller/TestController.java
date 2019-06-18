package com.mqredisdemo.demo.Controller;

import com.mqredisdemo.demo.Common.MD5Util;
import com.mqredisdemo.demo.Common.Result;
import com.mqredisdemo.demo.Entity.User;
import com.mqredisdemo.demo.Entity.UserExample;
import com.mqredisdemo.demo.Service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public String test() {
        return "register";
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public Result getAllUser() {
        UserExample example = new UserExample();
        List<User> list = userService.selectByExample(example);
        Result result = new Result();
        result.setRows(list);
        result.setTotal(list.size());
        return result;
    }

    @RequestMapping("/register")
    public void register(User user) {
String newpwd=user.getPwd();
user.setPwd(MD5Util.encodePwd(newpwd));
        userService.insert(user);
    }

}
