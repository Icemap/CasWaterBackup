package com.cas.water.app.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.cas.water.app.pojo.VideoExtraInfo;

@MapperScan
public interface VideoExtraInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VideoExtraInfo record);

    int insertSelective(VideoExtraInfo record);

    VideoExtraInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VideoExtraInfo record);

    int updateByPrimaryKey(VideoExtraInfo record);
}