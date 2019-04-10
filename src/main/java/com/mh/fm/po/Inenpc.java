package com.mh.fm.po;

public class Inenpc {
    private Integer inenpcid;

    private String inenpcname;

    private String inenpcaddress;

    public Integer getInenpcid() {
        return inenpcid;
    }

    public void setInenpcid(Integer inenpcid) {
        this.inenpcid = inenpcid;
    }

    public String getInenpcname() {
        return inenpcname;
    }

    public void setInenpcname(String inenpcname) {
        this.inenpcname = inenpcname == null ? null : inenpcname.trim();
    }

    public String getInenpcaddress() {
        return inenpcaddress;
    }

    public void setInenpcaddress(String inenpcaddress) {
        this.inenpcaddress = inenpcaddress == null ? null : inenpcaddress.trim();
    }
}