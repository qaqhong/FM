package com.mh.fm.po;

public class Tablephone {
    private Integer tablephoneid;

    private String tablephonename;

    private String tablephoneaddress;

    public Integer getTablephoneid() {
        return tablephoneid;
    }

    public void setTablephoneid(Integer tablephoneid) {
        this.tablephoneid = tablephoneid;
    }

    public String getTablephonename() {
        return tablephonename;
    }

    public void setTablephonename(String tablephonename) {
        this.tablephonename = tablephonename == null ? null : tablephonename.trim();
    }

    public String getTablephoneaddress() {
        return tablephoneaddress;
    }

    public void setTablephoneaddress(String tablephoneaddress) {
        this.tablephoneaddress = tablephoneaddress == null ? null : tablephoneaddress.trim();
    }
}