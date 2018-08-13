package com.wx.domain.user;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/2
 * @time: 下午4:52
 * @description : 用户的领域模型
 */
public class User implements Serializable {

    /** 用户的Id */
    private Integer UserId;

    /** 用户的名称 */
    private String loginName;

    /** 用户的密码 */
    private String loginPass;

    /** 用户的状态 */
    private Integer status;

    /** 创建的日期 */
    private String createTime;

    /** 更新的日期 */
    private String updateTime;

    /** 创建的用户的Id */
    private Integer createUserId;

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }
}
