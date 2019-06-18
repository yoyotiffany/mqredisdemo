package com.mqredisdemo.demo.Service.Imp;

import com.mqredisdemo.demo.Entity.User;
import com.mqredisdemo.demo.Entity.UserExample;
import com.mqredisdemo.demo.Mapper.UserMapper;
import com.mqredisdemo.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService {


    @Autowired
    UserMapper userMapper;
    @Override
    public int countByExample(UserExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UserExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        return userMapper.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(User record, UserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(User record, UserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }
}
