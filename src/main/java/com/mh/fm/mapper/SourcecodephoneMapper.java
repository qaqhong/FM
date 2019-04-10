package com.mh.fm.mapper;

import com.mh.fm.po.Sourcecodephone;
import com.mh.fm.po.SourcecodephoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SourcecodephoneMapper {
    int countByExample(SourcecodephoneExample example);

    int deleteByExample(SourcecodephoneExample example);

    int deleteByPrimaryKey(Integer sourcecodephoneid);

    int insert(Sourcecodephone record);

    int insertSelective(Sourcecodephone record);

    List<Sourcecodephone> selectByExample(SourcecodephoneExample example);

    Sourcecodephone selectByPrimaryKey(Integer sourcecodephoneid);

    int updateByExampleSelective(@Param("record") Sourcecodephone record, @Param("example") SourcecodephoneExample example);

    int updateByExample(@Param("record") Sourcecodephone record, @Param("example") SourcecodephoneExample example);

    int updateByPrimaryKeySelective(Sourcecodephone record);

    int updateByPrimaryKey(Sourcecodephone record);
}