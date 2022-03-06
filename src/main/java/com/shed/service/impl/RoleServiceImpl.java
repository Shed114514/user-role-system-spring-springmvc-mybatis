package com.shed.service.impl;

import com.shed.domain.Role;
import com.shed.mapper.RoleMapper;
import com.shed.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public boolean add(Role role) {
        roleMapper.insertSelective(role);
        return true;
    }

    @Override
    public boolean removeByRid(Integer rid) {
        roleMapper.deleteByPrimaryKey(rid);
        return true;
    }

    @Override
    public boolean updateByRid(Role role) {
        roleMapper.updateByPrimaryKeySelective(role);
        return true;
    }

    @Override
    public List<Role> findAll() {
        return roleMapper.selectAll();
    }
}
