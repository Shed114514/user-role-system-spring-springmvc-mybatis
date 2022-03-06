package com.shed.util.base;

import com.shed.domain.User;

import java.util.List;

public interface BaseMapper<VO,PK> {

    int insert(VO vo);

    int insertSelective(VO vo);

    int deleteByPrimaryKey(PK primaryKey);

    int updateByPrimaryKeySelective(VO vo);

    List<VO> selectAll();
}
