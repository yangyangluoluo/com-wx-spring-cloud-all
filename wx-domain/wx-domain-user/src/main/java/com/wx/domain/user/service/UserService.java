package com.wx.domain.user.service;

import com.wx.domain.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/5
 * @time: 下午1:10
 * @description : 对外提供的服务的接口
 */
public interface UserService {

     /**
     * lijianguo
     * 2018/8/5 - 下午5:26
     * 获取用户的详细信息
     */
    @RequestMapping(value = "/user/userDetail", method = RequestMethod.GET)
    User getUserDetail(@RequestParam("userId") Long userId);

     /**
     * lijianguo
     * 2018/8/6 - 下午5:36
     * 通过用户名字来查询用户的详细信息
     */
    @RequestMapping(value = "/user/findUserByName", method = RequestMethod.GET)
    User findUserByName(@RequestParam("userName") String userName);





}
