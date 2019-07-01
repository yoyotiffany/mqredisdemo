package com.mqredisdemo.demo.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mqredisdemo.demo.entity.User;
import com.mqredisdemo.demo.mapper.UserMapper;
import com.mqredisdemo.demo.service.IUserService;
import com.mqredisdemo.demo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yq
 * @since 2019-06-20
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    IUserService iUserService;

    //    @RequestMapping("/add")
//    @ResponseBody
//    public int add(){
//        User user=new User();
//        user.setPname("自动生成");
//        userMapper.insert(user);
//        return user.getId();
//    }
//
    @RequestMapping("/get")
    @ResponseBody
    public UserVO getByParam() {

        return    iUserService.dbcx("yq");

    }

    @RequestMapping("/crud")
    @ResponseBody
    public void crud() {
        iUserService.crud();
    }
}

