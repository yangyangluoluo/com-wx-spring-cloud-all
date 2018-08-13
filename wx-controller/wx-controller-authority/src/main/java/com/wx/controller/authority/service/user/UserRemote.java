package com.wx.controller.authority.service.user;

import com.wx.controller.authority.hystrix.UserRemoteHystrix;
import com.wx.domain.user.service.UserService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/6
 * @time: 下午3:13
 * @description : 用户的模块
 */
@FeignClient(value = "wx-service-user",fallback = UserRemoteHystrix.class)
public interface UserRemote extends UserService{
}
