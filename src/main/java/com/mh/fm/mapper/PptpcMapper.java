package com.mh.fm.mapper;

import com.mh.fm.po.Pptpc;
import com.mh.fm.po.PptpcExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PptpcMapper {
    int countByExample(PptpcExample example);

    int deleteByExample(PptpcExample example);

    int deleteByPrimaryKey(Integer pptpcid);

    int insert(Pptpc record);

    int insertSelective(Pptpc record);

    List<Pptpc> selectByExample(PptpcExample example);

    Pptpc selectByPrimaryKey(Integer pptpcid);

    int updateByExampleSelective(@Param("record") Pptpc record, @Param("example") PptpcExample example);

    int updateByExample(@Param("record") Pptpc record, @Param("example") PptpcExample example);

    int updateByPrimaryKeySelective(Pptpc record);

    int updateByPrimaryKey(Pptpc record);
}