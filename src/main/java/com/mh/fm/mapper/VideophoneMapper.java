package com.mh.fm.mapper;

import com.mh.fm.po.Videophone;
import com.mh.fm.po.VideophoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideophoneMapper {
    int countByExample(VideophoneExample example);

    int deleteByExample(VideophoneExample example);

    int deleteByPrimaryKey(Integer videophoneid);

    int insert(Videophone record);

    int insertSelective(Videophone record);

    List<Videophone> selectByExample(VideophoneExample example);

    Videophone selectByPrimaryKey(Integer videophoneid);

    int updateByExampleSelective(@Param("record") Videophone record, @Param("example") VideophoneExample example);

    int updateByExample(@Param("record") Videophone record, @Param("example") VideophoneExample example);

    int updateByPrimaryKeySelective(Videophone record);

    int updateByPrimaryKey(Videophone record);
}