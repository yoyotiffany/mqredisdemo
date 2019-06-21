package com.mqredisdemo.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mqredisdemo.demo.entity.User;
import com.mqredisdemo.demo.vo.UserVO;

import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 * </p>
 *
 * @author yq
 * @since 2019-06-20
 */
public interface IUserService extends IService<User> {
    public List<User> queryUserList();
    public void crud();
    public UserVO dbcx(String pname);
}
