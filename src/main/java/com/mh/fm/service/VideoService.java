package com.mh.fm.service;

import com.mh.fm.po.Videopcfm;
import com.mh.fm.po.Videopckn;
import com.mh.fm.po.Videophone;

import java.util.List;

public interface VideoService {
    public List<Videopcfm> selectVideopcfm(Videopcfm Videopcfm);

    public boolean insertVideopcfm(Videopcfm Videopcfm);

    public boolean updateVideopcfm(Videopcfm Videopcfm);

    public Videopcfm getVideopcfmId(Videopcfm Videopcfm);

    public boolean deleteVideopcfm(Videopcfm Videopcfm);

    public List<Videophone> selectVideophone(Videophone Videophone);

    public boolean insertVideophone(Videophone Videophone);

    public boolean updateVideophone(Videophone Videophone);

    public Videophone getVideophoneId(Videophone Videophone);

    public boolean deleteVideophone(Videophone Videophone);

    public List<Videopckn> selectVideopckn(Videopckn Videopckn);

    public boolean insertVideopckn(Videopckn Videopckn);

    public boolean updateVideopckn(Videopckn Videopckn);

    public Videopckn getVideopcknId(Videopckn Videopckn);

    public boolean deleteVideopckn(Videopckn Videopckn);
}
