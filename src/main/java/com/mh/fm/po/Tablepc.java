package com.mh.fm.po;

public class Tablepc {
    private Integer tablepcid;

    private String tablepcname;

    private String tablepcaddress;

    public Integer getTablepcid() {
        return tablepcid;
    }

    public void setTablepcid(Integer tablepcid) {
        this.tablepcid = tablepcid;
    }

    public String getTablepcname() {
        return tablepcname;
    }

    public void setTablepcname(String tablepcname) {
        this.tablepcname = tablepcname == null ? null : tablepcname.trim();
    }

    public String getTablepcaddress() {
        return tablepcaddress;
    }

    public void setTablepcaddress(String tablepcaddress) {
        this.tablepcaddress = tablepcaddress == null ? null : tablepcaddress.trim();
    }
}