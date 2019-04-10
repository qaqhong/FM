package com.mh.fm.po;

public class Docuphone {
    private Integer docuphoneid;

    private String docuphonename;

    private String docuphoneaddress;

    public Integer getDocuphoneid() {
        return docuphoneid;
    }

    public void setDocuphoneid(Integer docuphoneid) {
        this.docuphoneid = docuphoneid;
    }

    public String getDocuphonename() {
        return docuphonename;
    }

    public void setDocuphonename(String docuphonename) {
        this.docuphonename = docuphonename == null ? null : docuphonename.trim();
    }

    public String getDocuphoneaddress() {
        return docuphoneaddress;
    }

    public void setDocuphoneaddress(String docuphoneaddress) {
        this.docuphoneaddress = docuphoneaddress == null ? null : docuphoneaddress.trim();
    }
}