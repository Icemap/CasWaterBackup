package com.cas.water.app.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.cas.water.app.pojo.RiverInfo;

@MapperScan
public interface RiverInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RiverInfo record);

    int insertSelective(RiverInfo record);

    RiverInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RiverInfo record);

    int updateByPrimaryKey(RiverInfo record);
}