package com.mh.fm.po;

public class Docupc {
    private Integer docupcid;

    private String docupcname;

    private String docupcaddress;

    public Integer getDocupcid() {
        return docupcid;
    }

    public void setDocupcid(Integer docupcid) {
        this.docupcid = docupcid;
    }

    public String getDocupcname() {
        return docupcname;
    }

    public void setDocupcname(String docupcname) {
        this.docupcname = docupcname == null ? null : docupcname.trim();
    }

    public String getDocupcaddress() {
        return docupcaddress;
    }

    public void setDocupcaddress(String docupcaddress) {
        this.docupcaddress = docupcaddress == null ? null : docupcaddress.trim();
    }
}