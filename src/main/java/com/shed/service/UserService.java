package com.shed.service;

import com.shed.domain.User;

import java.util.List;

public interface UserService {

    boolean add(User user);

    boolean removeByUid(Integer uid);

    boolean updateByUid(User user);

    List<User> findAll();

    User loginWithUidAndPassword(Integer uid, String password);

    boolean addRoleToUser(Integer uid, Integer[] rids);
}
