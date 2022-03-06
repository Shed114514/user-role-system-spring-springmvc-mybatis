package com.shed.mapper;

import com.shed.domain.Role;
import com.shed.util.base.BaseMapper;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role,Integer> {

    List<Role> selectRoleByUid(Integer uid);

}
