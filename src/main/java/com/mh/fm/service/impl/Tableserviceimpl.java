package com.mh.fm.service.impl;

import com.mh.fm.mapper.TablepcMapper;
import com.mh.fm.mapper.TablephoneMapper;
import com.mh.fm.po.*;
import com.mh.fm.service.TableService;
import com.mh.fm.util.MarkUstils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Tableserviceimpl implements TableService {

    @Autowired
    TablepcMapper TablepcMapper;
    @Autowired
    TablephoneMapper TablephoneMapper;

    public List<Tablepc> selectTablepc(Tablepc Tablepc) {
        TablepcExample TablepcExample = new TablepcExample();
        TablepcExample.setOrderByClause("Tablepcname asc");
        TablepcExample.setDistinct(false);
        TablepcExample.Criteria criteria = TablepcExample.createCriteria();

        if(Tablepc != null){
            criteria.andTablepcnameLike("%"+Tablepc.getTablepcname()+"%");
        }

        return TablepcMapper.selectByExample(TablepcExample);
    }

    public boolean insertTablepc(Tablepc Tablepc) {
        int x = 0;
        if(Tablepc != null){
            x = TablepcMapper.insertSelective(Tablepc);
        }
        if (x > 0) return true;

        return false;
    }

    public boolean updateTablepc(Tablepc Tablepc) {
        int x = TablepcMapper.updateByPrimaryKeySelective(Tablepc);

        if (x > 0) return true;

        return false;
    }

    public Tablepc getTablepcId(Tablepc Tablepc) {

        return TablepcMapper.selectByPrimaryKey(Tablepc.getTablepcid());
    }

    public boolean deleteTablepc(Tablepc Tablepc) {
        if (TablepcMapper.deleteByPrimaryKey(Tablepc.getTablepcid()) > 0)
            return true;
        else
            return false;
    }

    public List<Tablephone> selectTablephone(Tablephone Tablephone) {
        TablephoneExample TablephoneExample = new TablephoneExample();
        TablephoneExample.setOrderByClause("Tablephonename asc");
        TablephoneExample.setDistinct(false);
        TablephoneExample.Criteria criteria = TablephoneExample.createCriteria();

        if(Tablephone != null){
            criteria.andTablephonenameLike("%"+Tablephone.getTablephonename()+"%");
        }

        return TablephoneMapper.selectByExample(TablephoneExample);
    }

    public boolean insertTablephone(Tablephone Tablephone) {
        int x = 0;
        if(Tablephone != null){
            x = TablephoneMapper.insertSelective(Tablephone);
        }
        if (x > 0) return true;

        return false;

    }

    public boolean updateTablephone(Tablephone Tablephone) {
        int x = TablephoneMapper.updateByPrimaryKeySelective(Tablephone);

        if (x > 0) return true;

        return false;
    }

    public Tablephone getTablephoneId(Tablephone Tablephone) {
        return TablephoneMapper.selectByPrimaryKey(Tablephone.getTablephoneid());
    }

    public boolean deleteTablephone(Tablephone Tablephone) {
        if (TablephoneMapper.deleteByPrimaryKey(Tablephone.getTablephoneid()) > 0)
            return true;
        else
            return false;
    }
}
