package com.mh.fm.mapper;

import com.mh.fm.po.Videopcfm;
import com.mh.fm.po.VideopcfmExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideopcfmMapper {
    int countByExample(VideopcfmExample example);

    int deleteByExample(VideopcfmExample example);

    int deleteByPrimaryKey(Integer videopcfmid);

    int insert(Videopcfm record);

    int insertSelective(Videopcfm record);

    List<Videopcfm> selectByExample(VideopcfmExample example);

    Videopcfm selectByPrimaryKey(Integer videopcfmid);

    int updateByExampleSelective(@Param("record") Videopcfm record, @Param("example") VideopcfmExample example);

    int updateByExample(@Param("record") Videopcfm record, @Param("example") VideopcfmExample example);

    int updateByPrimaryKeySelective(Videopcfm record);

    int updateByPrimaryKey(Videopcfm record);
}