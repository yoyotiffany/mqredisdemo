package com.mqredisdemo.demo.service.impl;

import com.mqredisdemo.demo.entity.UserInfo;
import com.mqredisdemo.demo.mapper.UserInfoMapper;
import com.mqredisdemo.demo.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yq
 * @since 2019-06-21
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
