package com.wx.domain.user;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/6
 * @time: 上午10:42
 * @description : 角色的描述
 */
public class Role implements Serializable {

    /** 角色Id */
    private Integer roleId;

    /** 角色名字 */
    private String roleName;

    /** 角色备注 */
    private String remark;

    /** 角色的状态 1 启用 0 禁用 */
    private Integer status;

    /** 创建的日期 */
    private String createTime;

    /** 更新的日期 */
    private String updateTime;

    /** 创建的用户的Id */
    private Integer createUserId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
