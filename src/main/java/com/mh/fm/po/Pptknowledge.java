package com.mh.fm.po;

public class Pptknowledge {
    private Integer pptknowledgeid;

    private String pptknowledgename;

    private String pptknowledgeaddress;

    public Integer getPptknowledgeid() {
        return pptknowledgeid;
    }

    public void setPptknowledgeid(Integer pptknowledgeid) {
        this.pptknowledgeid = pptknowledgeid;
    }

    public String getPptknowledgename() {
        return pptknowledgename;
    }

    public void setPptknowledgename(String pptknowledgename) {
        this.pptknowledgename = pptknowledgename == null ? null : pptknowledgename.trim();
    }

    public String getPptknowledgeaddress() {
        return pptknowledgeaddress;
    }

    public void setPptknowledgeaddress(String pptknowledgeaddress) {
        this.pptknowledgeaddress = pptknowledgeaddress == null ? null : pptknowledgeaddress.trim();
    }
}