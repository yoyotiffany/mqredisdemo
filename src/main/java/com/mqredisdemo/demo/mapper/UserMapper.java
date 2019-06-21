package com.mqredisdemo.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mqredisdemo.demo.entity.User;
import com.mqredisdemo.demo.entity.UserInfo;
import com.mqredisdemo.demo.vo.UserVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yq
 * @since 2019-06-20
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("select a.id id,a.userid userid,a.truename truename,a.addr addr,b.pname pname from user_info a,user b where a.userid=b.id and b.pname=#{pname}")
    public UserVO getUserInfo(String pname);
}
