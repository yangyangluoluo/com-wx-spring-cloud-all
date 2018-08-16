package com.wx.controller.authority.hystrix;

import com.wx.controller.authority.service.user.UserRemote;
import com.wx.domain.user.User;
import com.wx.infrastruct.hystrix.RemoteHystrix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/6
 * @time: 下午3:52
 * @description : 用户的熔断器
 */
@Component
public class UserRemoteHystrix extends RemoteHystrix implements UserRemote{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public User getUserDetail(Long userId)  {
        handHystrix("getUserDetail");
        return null;
    }

    @Override
    public User findUserByName(String userName) {
        logger.error("=======================服务熔断==========================================");
        return null;
    }
}
