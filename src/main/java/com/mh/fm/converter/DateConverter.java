package com.mh.fm.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {

    String Date_a = "yyyy-MM-dd";
    String Date_TIME_a = "yyyy-MM-dd HH:mm:sss";
    String Date_b = "yyyy/MM/dd";
    String Date_TIME_b = "yyyy/MM/dd HH:mm:sss";

    //  String转Date
    public Date convert(String s) {
        if (s == null || s.trim().equals("")) return null;

        SimpleDateFormat sdf;
        try {
            sdf = new SimpleDateFormat(Date_a);
            return sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            sdf = new SimpleDateFormat(Date_TIME_a);
            return sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            sdf = new SimpleDateFormat(Date_b);
            return sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            sdf = new SimpleDateFormat(Date_TIME_b);
            return sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }


}
