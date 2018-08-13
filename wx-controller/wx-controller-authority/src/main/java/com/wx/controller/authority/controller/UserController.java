package com.wx.controller.authority.controller;

import com.wx.controller.authority.service.user.UserRemote;
import com.wx.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/6
 * @time: 下午2:39
 * @description : 用户的控制器
 */
@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    private UserRemote userRemote;


    @Autowired
    private ValueOperations<String,Object> valueOperations;

    @RequestMapping(value = "/user/userDetail", method = RequestMethod.GET)
//    @Cacheable(cacheNames = "userDetail",key = "#userId",cacheManager = "WxCacheManager")
    public User getUserDetail(Long userId) {

        String key = "AA";
        String value = "BB";


        User u = userRemote.getUserDetail(userId);
        u =  new User();
        u.setLoginName("AAAAAAA");
        u.setLoginPass("BBBBBBB");

        Object theV = valueOperations.get(key);

        valueOperations.set(key,value);



        return u;
    }



}
