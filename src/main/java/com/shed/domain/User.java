package com.shed.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class User {
    private Integer uid;
    private String password;
    private String username;
    private Date birthday;

    // 用于查询当前用户所拥有的角色
    private List<Role> roles;

    public User() {}

    public User(Integer uid, String password, String username, Date birthday) {
        this.uid = uid;
        this.password = password;
        this.username = username;
        this.birthday = birthday;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", birthday=" + new SimpleDateFormat("yyyy-MM-dd").format(birthday) +
                '}';
    }

}
