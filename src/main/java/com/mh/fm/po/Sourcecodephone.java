package com.mh.fm.po;

public class Sourcecodephone {
    private Integer sourcecodephoneid;

    private String sourcecodephonename;

    private String sourcecodephoneaddress;

    public Integer getSourcecodephoneid() {
        return sourcecodephoneid;
    }

    public void setSourcecodephoneid(Integer sourcecodephoneid) {
        this.sourcecodephoneid = sourcecodephoneid;
    }

    public String getSourcecodephonename() {
        return sourcecodephonename;
    }

    public void setSourcecodephonename(String sourcecodephonename) {
        this.sourcecodephonename = sourcecodephonename == null ? null : sourcecodephonename.trim();
    }

    public String getSourcecodephoneaddress() {
        return sourcecodephoneaddress;
    }

    public void setSourcecodephoneaddress(String sourcecodephoneaddress) {
        this.sourcecodephoneaddress = sourcecodephoneaddress == null ? null : sourcecodephoneaddress.trim();
    }
}