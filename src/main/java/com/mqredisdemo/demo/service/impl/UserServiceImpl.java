package com.mqredisdemo.demo.service.impl;



import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mqredisdemo.demo.entity.User;
import com.mqredisdemo.demo.mapper.UserMapper;
import com.mqredisdemo.demo.service.IUserService;
import com.mqredisdemo.demo.vo.UserVO;
import org.apache.velocity.util.ArrayListWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yq
 * @since 2019-06-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 分页查询
     * @return
     */
    public List<User> queryUserList(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("*");
//                .ge("age", 12)
//                .isNotNull("email");
//        Page<User> page = new Page<>(1, 10);
//        IPage<User> userListPage = userMapper.selectPage(page, queryWrapper);
//                //userService.page(new Page<User>(1, 5), new QueryWrapper<User>());
//

 return userMapper.selectList(queryWrapper);

    }

    public UserVO dbcx(String pname){

     return    userMapper.getUserInfo(pname);
    }
    /**
     * 增删改查
     */

    public void crud(){
      int a=  userMapper.deleteById(1);
        System.out.println("success delete!!!1"+a);
        Map<String, Object> map=new HashMap<>();
        map.put("pname","123");
        int b=userMapper.deleteByMap(map);
        System.out.println("按MAP条件删除"+b);

        int c=userMapper.delete(new QueryWrapper<User>().isNull("pwd"));
        System.out.println("按条件构造器删除"+c);
        List<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(9);
        int d=userMapper.deleteBatchIds(list);
        System.out.println("批量删除"+d);
    }
}
