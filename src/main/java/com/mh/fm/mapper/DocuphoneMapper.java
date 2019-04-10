package com.mh.fm.mapper;

import com.mh.fm.po.Docuphone;
import com.mh.fm.po.DocuphoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocuphoneMapper {
    int countByExample(DocuphoneExample example);

    int deleteByExample(DocuphoneExample example);

    int deleteByPrimaryKey(Integer docuphoneid);

    int insert(Docuphone record);

    int insertSelective(Docuphone record);

    List<Docuphone> selectByExample(DocuphoneExample example);

    Docuphone selectByPrimaryKey(Integer docuphoneid);

    int updateByExampleSelective(@Param("record") Docuphone record, @Param("example") DocuphoneExample example);

    int updateByExample(@Param("record") Docuphone record, @Param("example") DocuphoneExample example);

    int updateByPrimaryKeySelective(Docuphone record);

    int updateByPrimaryKey(Docuphone record);
}