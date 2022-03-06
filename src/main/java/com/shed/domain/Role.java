package com.shed.domain;

public class Role {
    private Integer rid;
    private String roleName;
    private String roleDesc;

    public Role() {}

    public Role(Integer rid, String roleName, String roleDesc) {
        this.rid = rid;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                '}';
    }
}
