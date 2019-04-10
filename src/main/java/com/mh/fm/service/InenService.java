package com.mh.fm.service;

import com.mh.fm.po.Inenpc;
import com.mh.fm.po.Inenphone;

import java.util.List;

public interface InenService {
    public List<Inenpc> selectInenpc(Inenpc Inenpc);

    public boolean insertInenpc(Inenpc Inenpc);

    public boolean updateInenpc(Inenpc Inenpc);

    public Inenpc getInenpcId(Inenpc Inenpc);

    public boolean deleteInenpc(Inenpc Inenpc);

    public List<Inenphone> selectInenphone(Inenphone Inenphone);

    public boolean insertInenphone(Inenphone Inenphone);

    public boolean updateInenphone(Inenphone Inenphone);

    public Inenphone getInenphoneId(Inenphone Inenphone);

    public boolean deleteInenphone(Inenphone Inenphone);
}
