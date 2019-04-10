package com.mh.fm.service.impl;

import com.mh.fm.mapper.PptknowledgeMapper;
import com.mh.fm.mapper.PptpcMapper;
import com.mh.fm.mapper.PptphoneMapper;
import com.mh.fm.po.*;
import com.mh.fm.service.PPTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PPTserviceimpl implements PPTService {

    @Autowired
    PptpcMapper PptpcMapper;
    @Autowired
    PptphoneMapper PptphoneMapper;
    @Autowired
    PptknowledgeMapper pptknowledgeMapper;

    public List<Pptpc> selectPptpc() {
        PptpcExample PptpcExample = new PptpcExample();
        PptpcExample.setOrderByClause("Pptpcname asc");
        PptpcExample.setDistinct(false);
        PptpcExample.Criteria criteria = PptpcExample.createCriteria();
        return PptpcMapper.selectByExample(PptpcExample);
    }

    public boolean insertPptpc(Pptpc Pptpc) {
        int x = 0;
        if(Pptpc != null){
            x = PptpcMapper.insertSelective(Pptpc);
        }
        if (x > 0) return true;

        return false;
    }

    public boolean updatePptpc(Pptpc Pptpc) {
        int x = PptpcMapper.updateByPrimaryKeySelective(Pptpc);

        if (x > 0) return true;

        return false;
    }

    public Pptpc getPptpcId(int id) {

        return PptpcMapper.selectByPrimaryKey(id);
    }

    public boolean deletePptpc(Pptpc Pptpc) {
        if (PptpcMapper.deleteByPrimaryKey(Pptpc.getPptpcid()) > 0)
            return true;
        else
            return false;
    }

    public List<Pptphone> selectPptphone() {
        PptphoneExample PptphoneExample = new PptphoneExample();
        PptphoneExample.setOrderByClause("Pptphonename asc");
        PptphoneExample.setDistinct(false);
        PptphoneExample.Criteria criteria = PptphoneExample.createCriteria();
        return PptphoneMapper.selectByExample(PptphoneExample);
    }

    public boolean insertPptphone(Pptphone Pptphone) {
        int x = 0;
        if(Pptphone != null){
            x = PptphoneMapper.insertSelective(Pptphone);
        }
        if (x > 0) return true;

        return false;

    }

    public boolean updatePptphone(Pptphone Pptphone) {
        int x = PptphoneMapper.updateByPrimaryKeySelective(Pptphone);

        if (x > 0) return true;

        return false;
    }

    public Pptphone getPptphoneId(int id) {
        return PptphoneMapper.selectByPrimaryKey(id);
    }

    public boolean deletePptphone(Pptphone Pptphone) {
        if (PptphoneMapper.deleteByPrimaryKey(Pptphone.getPptphoneid()) > 0)
            return true;
        else
            return false;
    }

    public List<Pptknowledge> selectPptknowledge() {
        PptknowledgeExample pptknowledgeExample = new PptknowledgeExample();
        pptknowledgeExample.setOrderByClause("Pptknowledgename asc");
        pptknowledgeExample.setDistinct(false);
        PptknowledgeExample.Criteria criteria = pptknowledgeExample.createCriteria();

        return pptknowledgeMapper.selectByExample(pptknowledgeExample);
    }

    public boolean insertPptknowledge(Pptknowledge Pptknowledge) {
        int x = 0;
        if(Pptknowledge != null){
            x = pptknowledgeMapper.insertSelective(Pptknowledge);
        }
        if (x > 0) return true;

        return false;
    }

    public boolean updatePptknowledge(Pptknowledge Pptknowledge) {
        int x = pptknowledgeMapper.updateByPrimaryKeySelective(Pptknowledge);

        if (x > 0) return true;

        return false;
    }

    public Pptknowledge getPptknowledgeId(int id) {
        return pptknowledgeMapper.selectByPrimaryKey(id);
    }

    public boolean deletePptknowledge(Pptknowledge Pptknowledge) {
        if (pptknowledgeMapper.deleteByPrimaryKey(Pptknowledge.getPptknowledgeid()) > 0)
            return true;
        else
            return false;
    }

}
