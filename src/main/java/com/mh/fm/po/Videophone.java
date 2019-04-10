package com.mh.fm.po;

public class Videophone {
    private Integer videophoneid;

    private String videophonename;

    private String videophoneaddress;

    public Integer getVideophoneid() {
        return videophoneid;
    }

    public void setVideophoneid(Integer videophoneid) {
        this.videophoneid = videophoneid;
    }

    public String getVideophonename() {
        return videophonename;
    }

    public void setVideophonename(String videophonename) {
        this.videophonename = videophonename == null ? null : videophonename.trim();
    }

    public String getVideophoneaddress() {
        return videophoneaddress;
    }

    public void setVideophoneaddress(String videophoneaddress) {
        this.videophoneaddress = videophoneaddress == null ? null : videophoneaddress.trim();
    }
}