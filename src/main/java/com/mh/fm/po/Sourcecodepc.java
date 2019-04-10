package com.mh.fm.po;

public class Sourcecodepc {
    private Integer sourcecodepcid;

    private String sourcecodepcname;

    private String sourcecodepcaddress;

    public Integer getSourcecodepcid() {
        return sourcecodepcid;
    }

    public void setSourcecodepcid(Integer sourcecodepcid) {
        this.sourcecodepcid = sourcecodepcid;
    }

    public String getSourcecodepcname() {
        return sourcecodepcname;
    }

    public void setSourcecodepcname(String sourcecodepcname) {
        this.sourcecodepcname = sourcecodepcname == null ? null : sourcecodepcname.trim();
    }

    public String getSourcecodepcaddress() {
        return sourcecodepcaddress;
    }

    public void setSourcecodepcaddress(String sourcecodepcaddress) {
        this.sourcecodepcaddress = sourcecodepcaddress == null ? null : sourcecodepcaddress.trim();
    }
}