package com.mh.fm.service;

import com.mh.fm.po.Tablepc;
import com.mh.fm.po.Tablephone;

import java.util.List;

public interface TableService {
    public boolean insertTablepc(Tablepc Tablepc);

    public boolean updateTablepc(Tablepc Tablepc);

    public Tablepc getTablepcId(Tablepc Tablepc);

    public boolean deleteTablepc(Tablepc Tablepc);

    public List<Tablephone> selectTablephone(Tablephone Tablephone);

    public boolean insertTablephone(Tablephone Tablephone);

    public boolean updateTablephone(Tablephone Tablephone);

    public Tablephone getTablephoneId(Tablephone Tablephone);

    public boolean deleteTablephone(Tablephone Tablephone);
}
