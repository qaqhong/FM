package com.mh.fm.po;

import java.util.Date;

public class Pptphone {
    private Integer pptphoneid;

    private String pptphonename;

    private String pptphoneaddress;

    private String pptphoneuuidname;

    private Date pptphoneuploadtime;

    public Integer getPptphoneid() {
        return pptphoneid;
    }

    public void setPptphoneid(Integer pptphoneid) {
        this.pptphoneid = pptphoneid;
    }

    public String getPptphonename() {
        return pptphonename;
    }

    public void setPptphonename(String pptphonename) {
        this.pptphonename = pptphonename == null ? null : pptphonename.trim();
    }

    public String getPptphoneaddress() {
        return pptphoneaddress;
    }

    public void setPptphoneaddress(String pptphoneaddress) {
        this.pptphoneaddress = pptphoneaddress == null ? null : pptphoneaddress.trim();
    }

    public String getPptphoneuuidname() {
        return pptphoneuuidname;
    }

    public void setPptphoneuuidname(String pptphoneuuidname) {
        this.pptphoneuuidname = pptphoneuuidname == null ? null : pptphoneuuidname.trim();
    }

    public Date getPptphoneuploadtime() {
        return pptphoneuploadtime;
    }

    public void setPptphoneuploadtime(Date pptphoneuploadtime) {
        this.pptphoneuploadtime = pptphoneuploadtime;
    }
}