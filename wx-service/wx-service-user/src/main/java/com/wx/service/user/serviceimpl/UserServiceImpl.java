package com.wx.service.user.serviceimpl;

import com.wx.domain.user.User;
import com.wx.domain.user.service.UserService;
import com.wx.service.configuration.DS;
import com.wx.service.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/5
 * @time: 下午1:07
 * @description : 用户的服务
 */
@RestController
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    @RequestMapping(value  = "/user/userDetail",method = RequestMethod.GET)
    public User getUserDetail(Long userId) {
        User user = userMapper.findByUserId(userId);
        return user;
    }

    @Override
    @RequestMapping(value = "/user/findUserByName", method = RequestMethod.GET)
    public User findUserByName(String userName) {
        User user = userMapper.findUserByName(userName);
        return user;
    }

    @RequestMapping(value  = "/user/userDetail2",method = RequestMethod.GET)
    @DS("secondDataSource")
    public User getUserDetail2(Long userId) {
        User user = userMapper.findByUserId(userId);
        return user;
    }


}



