package com.mh.fm.service.impl;

import com.mh.fm.mapper.DocupcMapper;
import com.mh.fm.mapper.DocuphoneMapper;
import com.mh.fm.po.*;
import com.mh.fm.service.DocuService;
import com.mh.fm.util.MarkUstils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Docuserviceimpl implements DocuService {

    @Autowired
    DocupcMapper docupcMapper;
    @Autowired
    DocuphoneMapper docuphoneMapper;

    public List<Docupc> selectDocuPC(Docupc DocuPC) {
        DocupcExample docupcExample = new DocupcExample();
        docupcExample.setOrderByClause("DocuPCname asc");
        docupcExample.setDistinct(false);
        DocupcExample.Criteria criteria = docupcExample.createCriteria();

        if(DocuPC != null){
            criteria.andDocupcnameLike("%"+DocuPC.getDocupcname()+"%");
        }

        return docupcMapper.selectByExample(docupcExample);
    }

    public boolean insertDocuPC(Docupc DocuPC) {
        int x = 0;
        if(DocuPC != null){
            x = docupcMapper.insertSelective(DocuPC);
        }
        if (x > 0) return true;

        return false;
    }

    public boolean updateDocuPC(Docupc DocuPC) {
        int x = docupcMapper.updateByPrimaryKeySelective(DocuPC);

        if (x > 0) return true;

        return false;
    }

    public Docupc getDocuPCId(Docupc DocuPC) {

        return docupcMapper.selectByPrimaryKey(DocuPC.getDocupcid());
    }

    public boolean deleteDocuPC(Docupc DocuPC) {
        if (docupcMapper.deleteByPrimaryKey(DocuPC.getDocupcid()) > 0)
            return true;
        else
            return false;
    }

    public List<Docuphone> selectDocuPhone(Docuphone DocuPhone) {
        DocuphoneExample docuphoneExample = new DocuphoneExample();
        docuphoneExample.setOrderByClause("Docuphonename asc");
        docuphoneExample.setDistinct(false);
        DocuphoneExample.Criteria criteria = docuphoneExample.createCriteria();

        if(DocuPhone != null){
            criteria.andDocuphonenameLike("%"+DocuPhone.getDocuphonename()+"%");
        }

        return docuphoneMapper.selectByExample(docuphoneExample);
    }

    public boolean insertDocuPhone(Docuphone DocuPhone) {
        int x = 0;
        if(DocuPhone != null){
            x = docuphoneMapper.insertSelective(DocuPhone);
        }
        if (x > 0) return true;

        return false;

    }

    public boolean updateDocuPhone(Docuphone DocuPhone) {
        int x = docuphoneMapper.updateByPrimaryKeySelective(DocuPhone);

        if (x > 0) return true;

        return false;
    }

    public Docuphone getDocuPhoneId(Docuphone DocuPhone) {
        return docuphoneMapper.selectByPrimaryKey(DocuPhone.getDocuphoneid());
    }

    public boolean deleteDocuPhone(Docuphone DocuPhone) {
        if (docuphoneMapper.deleteByPrimaryKey(DocuPhone.getDocuphoneid()) > 0)
            return true;
        else
            return false;
    }
}
