package com.mh.fm.mapper;

import com.mh.fm.po.Tablephone;
import com.mh.fm.po.TablephoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TablephoneMapper {
    int countByExample(TablephoneExample example);

    int deleteByExample(TablephoneExample example);

    int deleteByPrimaryKey(Integer tablephoneid);

    int insert(Tablephone record);

    int insertSelective(Tablephone record);

    List<Tablephone> selectByExample(TablephoneExample example);

    Tablephone selectByPrimaryKey(Integer tablephoneid);

    int updateByExampleSelective(@Param("record") Tablephone record, @Param("example") TablephoneExample example);

    int updateByExample(@Param("record") Tablephone record, @Param("example") TablephoneExample example);

    int updateByPrimaryKeySelective(Tablephone record);

    int updateByPrimaryKey(Tablephone record);
}