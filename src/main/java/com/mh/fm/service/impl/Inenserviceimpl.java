package com.mh.fm.service.impl;

import com.mh.fm.mapper.InenpcMapper;
import com.mh.fm.mapper.InenphoneMapper;
import com.mh.fm.po.*;
import com.mh.fm.service.InenService;
import com.mh.fm.util.MarkUstils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Inenserviceimpl implements InenService {

    @Autowired
    InenpcMapper InenpcMapper;
    @Autowired
    InenphoneMapper InenphoneMapper;

    public List<Inenpc> selectInenpc(Inenpc Inenpc) {
        InenpcExample InenpcExample = new InenpcExample();
        InenpcExample.setOrderByClause("Inenpcname asc");
        InenpcExample.setDistinct(false);
        InenpcExample.Criteria criteria = InenpcExample.createCriteria();

        if(Inenpc != null){
            criteria.andInenpcnameLike("%"+Inenpc.getInenpcname()+"%");
        }

        return InenpcMapper.selectByExample(InenpcExample);
    }

    public boolean insertInenpc(Inenpc Inenpc) {
        int x = 0;
        if(Inenpc != null){
            x = InenpcMapper.insertSelective(Inenpc);
        }
        if (x > 0) return true;

        return false;
    }

    public boolean updateInenpc(Inenpc Inenpc) {
        int x = InenpcMapper.updateByPrimaryKeySelective(Inenpc);

        if (x > 0) return true;

        return false;
    }

    public Inenpc getInenpcId(Inenpc Inenpc) {

        return InenpcMapper.selectByPrimaryKey(Inenpc.getInenpcid());
    }

    public boolean deleteInenpc(Inenpc Inenpc) {
        if (InenpcMapper.deleteByPrimaryKey(Inenpc.getInenpcid()) > 0)
            return true;
        else
            return false;
    }

    public List<Inenphone> selectInenphone(Inenphone Inenphone) {
        InenphoneExample InenphoneExample = new InenphoneExample();
        InenphoneExample.setOrderByClause("Inenphonename asc");
        InenphoneExample.setDistinct(false);
        InenphoneExample.Criteria criteria = InenphoneExample.createCriteria();

        if(Inenphone != null){
            criteria.andInenphonenameLike("%"+Inenphone.getInenphonename()+"%");
        }

        return InenphoneMapper.selectByExample(InenphoneExample);
    }

    public boolean insertInenphone(Inenphone Inenphone) {
        int x = 0;
        if(Inenphone != null){
            x = InenphoneMapper.insertSelective(Inenphone);
        }
        if (x > 0) return true;

        return false;

    }

    public boolean updateInenphone(Inenphone Inenphone) {
        int x = InenphoneMapper.updateByPrimaryKeySelective(Inenphone);

        if (x > 0) return true;

        return false;
    }

    public Inenphone getInenphoneId(Inenphone Inenphone) {
        return InenphoneMapper.selectByPrimaryKey(Inenphone.getInenphoneid());
    }

    public boolean deleteInenphone(Inenphone Inenphone) {
        if (InenphoneMapper.deleteByPrimaryKey(Inenphone.getInenphoneid()) > 0)
            return true;
        else
            return false;
    }
}
