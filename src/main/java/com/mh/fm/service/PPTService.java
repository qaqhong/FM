package com.mh.fm.service;

import com.mh.fm.po.Pptknowledge;
import com.mh.fm.po.Pptpc;
import com.mh.fm.po.Pptphone;

import java.util.List;

public interface PPTService {
    public List<Pptpc> selectPptpc ();

    public boolean insertPptpc (Pptpc  Pptpc );

    public boolean updatePptpc (Pptpc  Pptpc );

    public Pptpc  getPptpcId(int  id );

    public boolean deletePptpc (Pptpc  Pptpc );

    public List<Pptphone> selectPptphone();

    public boolean insertPptphone(Pptphone Pptphone);

    public boolean updatePptphone(Pptphone Pptphone);

    public Pptphone getPptphoneId(int  id);

    public boolean deletePptphone(Pptphone Pptphone);

    public List<Pptknowledge> selectPptknowledge();

    public boolean insertPptknowledge(Pptknowledge Pptknowledge);

    public boolean updatePptknowledge(Pptknowledge Pptknowledge);

    public Pptknowledge getPptknowledgeId(int  id);

    public boolean deletePptknowledge(Pptknowledge Pptknowledge);

}
