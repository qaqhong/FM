package com.mh.fm.mapper;

import com.mh.fm.po.Sourcecodepc;
import com.mh.fm.po.SourcecodepcExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SourcecodepcMapper {
    int countByExample(SourcecodepcExample example);

    int deleteByExample(SourcecodepcExample example);

    int deleteByPrimaryKey(Integer sourcecodepcid);

    int insert(Sourcecodepc record);

    int insertSelective(Sourcecodepc record);

    List<Sourcecodepc> selectByExample(SourcecodepcExample example);

    Sourcecodepc selectByPrimaryKey(Integer sourcecodepcid);

    int updateByExampleSelective(@Param("record") Sourcecodepc record, @Param("example") SourcecodepcExample example);

    int updateByExample(@Param("record") Sourcecodepc record, @Param("example") SourcecodepcExample example);

    int updateByPrimaryKeySelective(Sourcecodepc record);

    int updateByPrimaryKey(Sourcecodepc record);
}