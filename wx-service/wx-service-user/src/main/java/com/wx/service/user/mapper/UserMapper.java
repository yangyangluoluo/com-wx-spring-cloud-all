package com.wx.service.user.mapper;

import com.wx.domain.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/5
 * @time: 下午6:46
 * @description : 用户的描述
 */
@Mapper
public interface UserMapper {

     /**
     * lijianguo
     * 2018/8/6 - 上午9:26
     * 获取用户的详细信息
     */
    User findByUserId(Long userId);

    /**
     * lijianguo
     * 2018/8/6 - 下午5:36
     * 通过用户名字来查询用户的详细信息
     */
    User findUserByName(@Param("userName") String userName);
}



