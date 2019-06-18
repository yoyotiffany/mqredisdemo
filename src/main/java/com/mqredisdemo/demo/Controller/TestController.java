package com.mqredisdemo.demo.Controller;

import com.mqredisdemo.demo.Common.Result;
import com.mqredisdemo.demo.Entity.User;
import com.mqredisdemo.demo.Entity.UserExample;
import com.mqredisdemo.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    UserService userService;
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "success";
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public Result getAllUser(){
        UserExample example=new UserExample();
        List<User> list=userService.selectByExample(example);
        Result result=new Result();
        result.setRows(list);
        result.setTotal(list.size());
        return result;
    }
}
