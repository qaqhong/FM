package com.mh.fm.mapper;

import com.mh.fm.po.Pptphone;
import com.mh.fm.po.PptphoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PptphoneMapper {
    int countByExample(PptphoneExample example);

    int deleteByExample(PptphoneExample example);

    int deleteByPrimaryKey(Integer pptphoneid);

    int insert(Pptphone record);

    int insertSelective(Pptphone record);

    List<Pptphone> selectByExample(PptphoneExample example);

    Pptphone selectByPrimaryKey(Integer pptphoneid);

    int updateByExampleSelective(@Param("record") Pptphone record, @Param("example") PptphoneExample example);

    int updateByExample(@Param("record") Pptphone record, @Param("example") PptphoneExample example);

    int updateByPrimaryKeySelective(Pptphone record);

    int updateByPrimaryKey(Pptphone record);
}