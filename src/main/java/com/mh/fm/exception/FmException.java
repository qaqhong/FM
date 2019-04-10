package com.mh.fm.exception;

public class FmException extends Exception{
    //异常信息
    public String message;

    public FmException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
