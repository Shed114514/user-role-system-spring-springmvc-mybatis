package com.shed.service;

import com.shed.domain.Role;
import com.shed.domain.User;

import java.util.List;

public interface RoleService {

    boolean add(Role role);

    boolean removeByRid(Integer rid);

    boolean updateByRid(Role role);

    List<Role> findAll();
}
