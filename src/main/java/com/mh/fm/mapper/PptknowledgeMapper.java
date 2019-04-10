package com.mh.fm.mapper;

import com.mh.fm.po.Pptknowledge;
import com.mh.fm.po.PptknowledgeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PptknowledgeMapper {
    int countByExample(PptknowledgeExample example);

    int deleteByExample(PptknowledgeExample example);

    int deleteByPrimaryKey(Integer pptknowledgeid);

    int insert(Pptknowledge record);

    int insertSelective(Pptknowledge record);

    List<Pptknowledge> selectByExample(PptknowledgeExample example);

    Pptknowledge selectByPrimaryKey(Integer pptknowledgeid);

    int updateByExampleSelective(@Param("record") Pptknowledge record, @Param("example") PptknowledgeExample example);

    int updateByExample(@Param("record") Pptknowledge record, @Param("example") PptknowledgeExample example);

    int updateByPrimaryKeySelective(Pptknowledge record);

    int updateByPrimaryKey(Pptknowledge record);
}