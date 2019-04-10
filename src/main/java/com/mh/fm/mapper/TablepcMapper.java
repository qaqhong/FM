package com.mh.fm.mapper;

import com.mh.fm.po.Tablepc;
import com.mh.fm.po.TablepcExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TablepcMapper {
    int countByExample(TablepcExample example);

    int deleteByExample(TablepcExample example);

    int deleteByPrimaryKey(Integer tablepcid);

    int insert(Tablepc record);

    int insertSelective(Tablepc record);

    List<Tablepc> selectByExample(TablepcExample example);

    Tablepc selectByPrimaryKey(Integer tablepcid);

    int updateByExampleSelective(@Param("record") Tablepc record, @Param("example") TablepcExample example);

    int updateByExample(@Param("record") Tablepc record, @Param("example") TablepcExample example);

    int updateByPrimaryKeySelective(Tablepc record);

    int updateByPrimaryKey(Tablepc record);
}