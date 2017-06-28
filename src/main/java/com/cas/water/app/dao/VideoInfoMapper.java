package com.cas.water.app.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.cas.water.app.pojo.VideoInfo;

@MapperScan
public interface VideoInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VideoInfo record);

    int insertSelective(VideoInfo record);

    VideoInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VideoInfo record);

    int updateByPrimaryKey(VideoInfo record);
}