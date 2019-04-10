package com.mh.fm.mapper;

import com.mh.fm.po.Inenpc;
import com.mh.fm.po.InenpcExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InenpcMapper {
    int countByExample(InenpcExample example);

    int deleteByExample(InenpcExample example);

    int deleteByPrimaryKey(Integer inenpcid);

    int insert(Inenpc record);

    int insertSelective(Inenpc record);

    List<Inenpc> selectByExample(InenpcExample example);

    Inenpc selectByPrimaryKey(Integer inenpcid);

    int updateByExampleSelective(@Param("record") Inenpc record, @Param("example") InenpcExample example);

    int updateByExample(@Param("record") Inenpc record, @Param("example") InenpcExample example);

    int updateByPrimaryKeySelective(Inenpc record);

    int updateByPrimaryKey(Inenpc record);
}