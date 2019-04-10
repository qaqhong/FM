package com.mh.fm.service.impl;

import com.mh.fm.mapper.SourcecodepcMapper;
import com.mh.fm.mapper.SourcecodephoneMapper;
import com.mh.fm.po.*;
import com.mh.fm.service.SourcecodeService;
import com.mh.fm.util.MarkUstils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sourcecodeserviceimpl implements SourcecodeService {

    @Autowired
    SourcecodepcMapper SourcecodepcMapper;
    @Autowired
    SourcecodephoneMapper SourcecodephoneMapper;

    public List<Sourcecodepc> selectSourcecodepc(Sourcecodepc Sourcecodepc) {
        SourcecodepcExample SourcecodepcExample = new SourcecodepcExample();
        SourcecodepcExample.setOrderByClause("Sourcecodepcname asc");
        SourcecodepcExample.setDistinct(false);
        SourcecodepcExample.Criteria criteria = SourcecodepcExample.createCriteria();

        if(Sourcecodepc != null){
            criteria.andSourcecodepcnameLike("%"+Sourcecodepc.getSourcecodepcname()+"%");
        }

        return SourcecodepcMapper.selectByExample(SourcecodepcExample);
    }

    public boolean insertSourcecodepc(Sourcecodepc Sourcecodepc) {
        int x = 0;
        if(Sourcecodepc != null){
            x = SourcecodepcMapper.insertSelective(Sourcecodepc);
        }
        if (x > 0) return true;

        return false;
    }

    public boolean updateSourcecodepc(Sourcecodepc Sourcecodepc) {
        int x = SourcecodepcMapper.updateByPrimaryKeySelective(Sourcecodepc);

        if (x > 0) return true;

        return false;
    }

    public Sourcecodepc getSourcecodepcId(Sourcecodepc Sourcecodepc) {

        return SourcecodepcMapper.selectByPrimaryKey(Sourcecodepc.getSourcecodepcid());
    }

    public boolean deleteSourcecodepc(Sourcecodepc Sourcecodepc) {
        if (SourcecodepcMapper.deleteByPrimaryKey(Sourcecodepc.getSourcecodepcid()) > 0)
            return true;
        else
            return false;
    }

    public List<Sourcecodephone> selectSourcecodephone(Sourcecodephone Sourcecodephone) {
        SourcecodephoneExample SourcecodephoneExample = new SourcecodephoneExample();
        SourcecodephoneExample.setOrderByClause("Sourcecodephonename asc");
        SourcecodephoneExample.setDistinct(false);
        SourcecodephoneExample.Criteria criteria = SourcecodephoneExample.createCriteria();

        if(Sourcecodephone != null){
            criteria.andSourcecodephonenameLike("%"+Sourcecodephone.getSourcecodephonename()+"%");
        }

        return SourcecodephoneMapper.selectByExample(SourcecodephoneExample);
    }

    public boolean insertSourcecodephone(Sourcecodephone Sourcecodephone) {
        int x = 0;
        if(Sourcecodephone != null){
            x = SourcecodephoneMapper.insertSelective(Sourcecodephone);
        }
        if (x > 0) return true;

        return false;

    }

    public boolean updateSourcecodephone(Sourcecodephone Sourcecodephone) {
        int x = SourcecodephoneMapper.updateByPrimaryKeySelective(Sourcecodephone);

        if (x > 0) return true;

        return false;
    }

    public Sourcecodephone getSourcecodephoneId(Sourcecodephone Sourcecodephone) {
        return SourcecodephoneMapper.selectByPrimaryKey(Sourcecodephone.getSourcecodephoneid());
    }

    public boolean deleteSourcecodephone(Sourcecodephone Sourcecodephone) {
        if (SourcecodephoneMapper.deleteByPrimaryKey(Sourcecodephone.getSourcecodephoneid()) > 0)
            return true;
        else
            return false;
    }
}
