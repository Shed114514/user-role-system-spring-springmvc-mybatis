package com.shed.service.impl;

import com.shed.domain.Role;
import com.shed.domain.User;
import com.shed.mapper.RoleMapper;
import com.shed.mapper.UserMapper;
import com.shed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public boolean add(User user) {
        userMapper.insert(user);
        return true;
    }

    @Override
    public boolean removeByUid(Integer uid) {
        userMapper.deleteRelationByUid(uid);
        userMapper.deleteByPrimaryKey(uid);
        return true;
    }

    @Override
    public boolean updateByUid(User user) {
        userMapper.updateByPrimaryKeySelective(user);
        return true;
    }

    @Override
    public List<User> findAll() {
        List<User> userList = userMapper.selectAll();
        for (User user : userList){
            List<Role> roles = roleMapper.selectRoleByUid(user.getUid());
            user.setRoles(roles);
        }
        return userList ;
    }

    @Override
    public User loginWithUidAndPassword(Integer uid, String password) {
        return userMapper.selectUidAndPassword(uid,password);
    }

    @Override
    public boolean addRoleToUser(Integer uid, Integer[] rids) {
        for (Integer rid : rids){
            userMapper.insertUidAndRid(uid,rid);
        }
        return true;
    }
}
