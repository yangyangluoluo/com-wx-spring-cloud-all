package com.wx.service.user.serviceimpl;

import com.wx.domain.user.Role;
import com.wx.domain.user.service.RoleService;
import com.wx.service.configuration.DS;
import com.wx.service.user.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/6
 * @time: 上午10:49
 * @description : 角色的实现
 */
@RestController
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleMapper roleMapper;

    @Override
    @RequestMapping(value = "/role/detail", method = RequestMethod.GET)
    public Role getRoleDetail(@RequestParam("roleId")Long roleId) {

        Role r = roleMapper.getRoleDetail(roleId);
        return r;
    }
}
