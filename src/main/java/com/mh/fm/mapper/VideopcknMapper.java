package com.mh.fm.mapper;

import com.mh.fm.po.Videopckn;
import com.mh.fm.po.VideopcknExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideopcknMapper {
    int countByExample(VideopcknExample example);

    int deleteByExample(VideopcknExample example);

    int deleteByPrimaryKey(Integer videopcknid);

    int insert(Videopckn record);

    int insertSelective(Videopckn record);

    List<Videopckn> selectByExample(VideopcknExample example);

    Videopckn selectByPrimaryKey(Integer videopcknid);

    int updateByExampleSelective(@Param("record") Videopckn record, @Param("example") VideopcknExample example);

    int updateByExample(@Param("record") Videopckn record, @Param("example") VideopcknExample example);

    int updateByPrimaryKeySelective(Videopckn record);

    int updateByPrimaryKey(Videopckn record);
}