package com.mh.fm.po;

public class Videopckn {
    private Integer videopcknid;

    private String videopcknname;

    private String videopcknaddress;

    public Integer getVideopcknid() {
        return videopcknid;
    }

    public void setVideopcknid(Integer videopcknid) {
        this.videopcknid = videopcknid;
    }

    public String getVideopcknname() {
        return videopcknname;
    }

    public void setVideopcknname(String videopcknname) {
        this.videopcknname = videopcknname == null ? null : videopcknname.trim();
    }

    public String getVideopcknaddress() {
        return videopcknaddress;
    }

    public void setVideopcknaddress(String videopcknaddress) {
        this.videopcknaddress = videopcknaddress == null ? null : videopcknaddress.trim();
    }
}