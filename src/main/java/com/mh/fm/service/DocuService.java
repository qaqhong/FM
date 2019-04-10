package com.mh.fm.service;

import com.mh.fm.po.Docupc;
import com.mh.fm.po.Docuphone;

import java.util.List;

public interface DocuService {

    public List<Docupc> selectDocuPC(Docupc DocuPC);

    public boolean insertDocuPC(Docupc DocuPC);

    public boolean updateDocuPC(Docupc DocuPC);

    public Docupc getDocuPCId(Docupc DocuPC);

    public boolean deleteDocuPC(Docupc DocuPC);

    public List<Docuphone> selectDocuPhone(Docuphone DocuPhone);

    public boolean insertDocuPhone(Docuphone DocuPhone);

    public boolean updateDocuPhone(Docuphone DocuPhone);

    public Docuphone getDocuPhoneId(Docuphone DocuPhone);

    public boolean deleteDocuPhone(Docuphone DocuPhone);
}
