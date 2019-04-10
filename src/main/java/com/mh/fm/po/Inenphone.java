package com.mh.fm.po;

public class Inenphone {
    private Integer inenphoneid;

    private String inenphonename;

    private String inenphoneaddress;

    public Integer getInenphoneid() {
        return inenphoneid;
    }

    public void setInenphoneid(Integer inenphoneid) {
        this.inenphoneid = inenphoneid;
    }

    public String getInenphonename() {
        return inenphonename;
    }

    public void setInenphonename(String inenphonename) {
        this.inenphonename = inenphonename == null ? null : inenphonename.trim();
    }

    public String getInenphoneaddress() {
        return inenphoneaddress;
    }

    public void setInenphoneaddress(String inenphoneaddress) {
        this.inenphoneaddress = inenphoneaddress == null ? null : inenphoneaddress.trim();
    }
}