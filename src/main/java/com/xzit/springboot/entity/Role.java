package com.xzit.springboot.entity;

import java.io.Serializable;

public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer roleId;
    private String roleName;
    private Integer useState;
    private Integer roleType;
    private String description;

    //构造方法
    public Role() {
    }
    public Role(Integer roleId, String roleName, Integer useState, Integer roleType, String description) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.useState = useState;
        this.roleType = roleType;
        this.description = description;
    }

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

    public Integer getUseState() {
        return useState;
    }

    public void setUseState(Integer useState) {
        this.useState = useState;
    }

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", useState=" + useState +
                ", roleType=" + roleType +
                ", description='" + description + '\'' +
                '}';
    }
}
