package com.mh.fm.po;

import java.util.Date;

public class Pptpc {
    private Integer pptpcid;

    private String pptpcname;

    private String pptpcaddress;

    private String pptpcuuidname;

    private Date pptpcuploadtime;

    private Integer userid;

    public Integer getPptpcid() {
        return pptpcid;
    }

    public void setPptpcid(Integer pptpcid) {
        this.pptpcid = pptpcid;
    }

    public String getPptpcname() {
        return pptpcname;
    }

    public void setPptpcname(String pptpcname) {
        this.pptpcname = pptpcname == null ? null : pptpcname.trim();
    }

    public String getPptpcaddress() {
        return pptpcaddress;
    }

    public void setPptpcaddress(String pptpcaddress) {
        this.pptpcaddress = pptpcaddress == null ? null : pptpcaddress.trim();
    }

    public String getPptpcuuidname() {
        return pptpcuuidname;
    }

    public void setPptpcuuidname(String pptpcuuidname) {
        this.pptpcuuidname = pptpcuuidname == null ? null : pptpcuuidname.trim();
    }

    public Date getPptpcuploadtime() {
        return pptpcuploadtime;
    }

    public void setPptpcuploadtime(Date pptpcuploadtime) {
        this.pptpcuploadtime = pptpcuploadtime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}