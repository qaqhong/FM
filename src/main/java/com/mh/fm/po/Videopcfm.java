package com.mh.fm.po;

public class Videopcfm {
    private Integer videopcfmid;

    private String videopcfmname;

    private String videopcfmaddress;

    public Integer getVideopcfmid() {
        return videopcfmid;
    }

    public void setVideopcfmid(Integer videopcfmid) {
        this.videopcfmid = videopcfmid;
    }

    public String getVideopcfmname() {
        return videopcfmname;
    }

    public void setVideopcfmname(String videopcfmname) {
        this.videopcfmname = videopcfmname == null ? null : videopcfmname.trim();
    }

    public String getVideopcfmaddress() {
        return videopcfmaddress;
    }

    public void setVideopcfmaddress(String videopcfmaddress) {
        this.videopcfmaddress = videopcfmaddress == null ? null : videopcfmaddress.trim();
    }
}