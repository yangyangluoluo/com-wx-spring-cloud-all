package com.wx.service.user.mapper;

import com.wx.domain.user.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/6
 * @time: 上午10:51
 * @description : 角色的mapper
 */
@Mapper
public interface RoleMapper {


     /**
     * lijianguo
     * 2018/8/6 - 上午10:54
     * 角色的详情
     */
    Role getRoleDetail(Long roleId);

}
