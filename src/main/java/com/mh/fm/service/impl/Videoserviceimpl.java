package com.mh.fm.service.impl;

import com.mh.fm.mapper.VideopcfmMapper;
import com.mh.fm.mapper.VideopcknMapper;
import com.mh.fm.mapper.VideophoneMapper;
import com.mh.fm.po.*;
import com.mh.fm.service.VideoService;
import com.mh.fm.util.MarkUstils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Videoserviceimpl implements VideoService {

    @Autowired
    VideopcknMapper VideopcknMapper;
    @Autowired
    VideophoneMapper VideophoneMapper;
    @Autowired
    VideopcfmMapper VideopcfmMapper;

    public List<Videopckn> selectVideopckn(Videopckn Videopckn) {
        VideopcknExample VideopcknExample = new VideopcknExample();
        VideopcknExample.setOrderByClause("Videopcknname asc");
        VideopcknExample.setDistinct(false);
        VideopcknExample.Criteria criteria = VideopcknExample.createCriteria();

        if(Videopckn != null){
            criteria.andVideopcknnameLike("%"+Videopckn.getVideopcknname()+"%");
        }

        return VideopcknMapper.selectByExample(VideopcknExample);
    }

    public boolean insertVideopckn(Videopckn Videopckn) {
        int x = 0;
        if(Videopckn != null){
            x = VideopcknMapper.insertSelective(Videopckn);
        }
        if (x > 0) return true;

        return false;
    }

    public boolean updateVideopckn(Videopckn Videopckn) {
        int x = VideopcknMapper.updateByPrimaryKeySelective(Videopckn);

        if (x > 0) return true;

        return false;
    }

    public Videopckn getVideopcknId(Videopckn Videopckn) {

        return VideopcknMapper.selectByPrimaryKey(Videopckn.getVideopcknid());
    }

    public boolean deleteVideopckn(Videopckn Videopckn) {
        if (VideopcknMapper.deleteByPrimaryKey(Videopckn.getVideopcknid()) > 0)
            return true;
        else
            return false;
    }

    public List<Videophone> selectVideophone(Videophone Videophone) {
        VideophoneExample VideophoneExample = new VideophoneExample();
        VideophoneExample.setOrderByClause("Videophonename asc");
        VideophoneExample.setDistinct(false);
        VideophoneExample.Criteria criteria = VideophoneExample.createCriteria();

        if(Videophone != null){
            criteria.andVideophonenameLike("%"+Videophone.getVideophonename()+"%");
        }

        return VideophoneMapper.selectByExample(VideophoneExample);
    }

    public boolean insertVideophone(Videophone Videophone) {
        int x = 0;
        if(Videophone != null){
            x = VideophoneMapper.insertSelective(Videophone);
        }
        if (x > 0) return true;

        return false;

    }

    public boolean updateVideophone(Videophone Videophone) {
        int x = VideophoneMapper.updateByPrimaryKeySelective(Videophone);

        if (x > 0) return true;

        return false;
    }

    public Videophone getVideophoneId(Videophone Videophone) {
        return VideophoneMapper.selectByPrimaryKey(Videophone.getVideophoneid());
    }

    public boolean deleteVideophone(Videophone Videophone) {
        if (VideophoneMapper.deleteByPrimaryKey(Videophone.getVideophoneid()) > 0)
            return true;
        else
            return false;
    }

    public List<Videopcfm> selectVideopcfm(Videopcfm Videopcfm) {
        VideopcfmExample VideopcfmExample = new VideopcfmExample();
        VideopcfmExample.setOrderByClause("Videopcfmname asc");
        VideopcfmExample.setDistinct(false);
        VideopcfmExample.Criteria criteria = VideopcfmExample.createCriteria();

        if(Videopcfm != null){
            criteria.andVideopcfmnameLike("%"+Videopcfm.getVideopcfmname()+"%");
        }

        return VideopcfmMapper.selectByExample(VideopcfmExample);
    }

    public boolean insertVideopcfm(Videopcfm Videopcfm) {
        int x = 0;
        if(Videopcfm != null){
            x = VideopcfmMapper.insertSelective(Videopcfm);
        }
        if (x > 0) return true;

        return false;
    }

    public boolean updateVideopcfm(Videopcfm Videopcfm) {
        int x = VideopcfmMapper.updateByPrimaryKeySelective(Videopcfm);

        if (x > 0) return true;

        return false;
    }

    public Videopcfm getVideopcfmId(Videopcfm Videopcfm) {

        return VideopcfmMapper.selectByPrimaryKey(Videopcfm.getVideopcfmid());
    }

    public boolean deleteVideopcfm(Videopcfm Videopcfm) {
        if (VideopcfmMapper.deleteByPrimaryKey(Videopcfm.getVideopcfmid()) > 0)
            return true;
        else
            return false;
    }

}
