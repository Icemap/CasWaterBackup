package com.cas.water.app.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.cas.water.app.pojo.VistaInfo;

@MapperScan
public interface VistaInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VistaInfo record);

    int insertSelective(VistaInfo record);

    VistaInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VistaInfo record);

    int updateByPrimaryKey(VistaInfo record);
}