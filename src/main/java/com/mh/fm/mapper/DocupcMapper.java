package com.mh.fm.mapper;

import com.mh.fm.po.Docupc;
import com.mh.fm.po.DocupcExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocupcMapper {
    int countByExample(DocupcExample example);

    int deleteByExample(DocupcExample example);

    int deleteByPrimaryKey(Integer docupcid);

    int insert(Docupc record);

    int insertSelective(Docupc record);

    List<Docupc> selectByExample(DocupcExample example);

    Docupc selectByPrimaryKey(Integer docupcid);

    int updateByExampleSelective(@Param("record") Docupc record, @Param("example") DocupcExample example);

    int updateByExample(@Param("record") Docupc record, @Param("example") DocupcExample example);

    int updateByPrimaryKeySelective(Docupc record);

    int updateByPrimaryKey(Docupc record);
}