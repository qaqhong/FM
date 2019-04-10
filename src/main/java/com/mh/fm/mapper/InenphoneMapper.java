package com.mh.fm.mapper;

import com.mh.fm.po.Inenphone;
import com.mh.fm.po.InenphoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InenphoneMapper {
    int countByExample(InenphoneExample example);

    int deleteByExample(InenphoneExample example);

    int deleteByPrimaryKey(Integer inenphoneid);

    int insert(Inenphone record);

    int insertSelective(Inenphone record);

    List<Inenphone> selectByExample(InenphoneExample example);

    Inenphone selectByPrimaryKey(Integer inenphoneid);

    int updateByExampleSelective(@Param("record") Inenphone record, @Param("example") InenphoneExample example);

    int updateByExample(@Param("record") Inenphone record, @Param("example") InenphoneExample example);

    int updateByPrimaryKeySelective(Inenphone record);

    int updateByPrimaryKey(Inenphone record);
}