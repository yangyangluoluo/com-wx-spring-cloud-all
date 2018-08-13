package com.wx.domain.user.service;

import com.wx.domain.user.Role;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/6
 * @time: 上午10:45
 * @description : 角色的描述
 */
@FeignClient("service-user")
public interface RoleService {

     /**
     * lijianguo
     * 2018/8/6 - 上午10:48
     * 获取角色的详情
     */
    @RequestMapping(value = "/role/roleDetail", method = RequestMethod.GET)
    Role getRoleDetail(@RequestParam("roleId") Long roleId);


}
