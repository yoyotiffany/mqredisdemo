package com.mqredisdemo.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//@RequestMapping("/user")
public class TestController {
//    @Autowired
//    RedisTemplate<String,String> redisTemplate;
//    @Autowired
//    UserService userService;
//
//    @RequestMapping("/test")
//    public String test() {
//        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
//        opsForValue.set("y","qian");
//        //opsForValue.set("a","add",5, TimeUnit.SECONDS);
//        System.out.println("11"+opsForValue.get("a"));
//
//        return "register";
//    }
//
//
//
////    @RequestMapping("/getAllUser")
////    @ResponseBody
////    public Result getAllUser() {
////
////        List<User> list = userService.selectByExample(example);
////        Result result = new Result();
////        result.setRows(list);
////        result.setTotal(list.size());
////        return result;
////    }
//
//    @RequestMapping("/register")
//    public String register(User user) {
//        String newpwd = user.getPwd();
//        user.setPwd(MD5Util.encodePwd(newpwd));
//        userService.insert(user);
//        return "login";
//    }
//
//    @RequestMapping("/login")
//    public String login(User user) {
//        UserExample example = new UserExample();
//          example.createCriteria().andPnameEqualTo(user.getPname());
//        List<User> list=    userService.selectByExample(example);
//        MD5Util.isRightPwd(user.getPwd(),list.get(0).getPname());
//      if ( MD5Util.isRightPwd(user.getPwd(),list.get(0).getPwd())){
//          return "index";
//      }
//      return "error";
//    }
//



}
