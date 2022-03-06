package com.shed.mapper;

import com.shed.domain.Role;
import com.shed.domain.User;
import com.shed.util.base.BaseMapper;

import java.util.List;

public interface UserMapper extends BaseMapper<User,Integer> {

    User selectUidAndPassword(Integer uid, String password);

    int insertUidAndRid(Integer uid, Integer rid);

    int deleteRelationByUid(Integer uid);

}
