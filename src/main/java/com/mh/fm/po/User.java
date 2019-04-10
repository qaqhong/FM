package com.mh.fm.po;

public class User {
    private Integer userid;

    private String username;

    private String userpassword;

    private String userrole;

    private String usermark;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole == null ? null : userrole.trim();
    }

    public String getUsermark() {
        return usermark;
    }

    public void setUsermark(String usermark) {
        this.usermark = usermark == null ? null : usermark.trim();
    }

    public String toString() {
        return "User{"+"userid="+userid+"username="+username+"userpassword="+userpassword+"userrole="+userrole+"usermark="+usermark +
                '}';
    }
}