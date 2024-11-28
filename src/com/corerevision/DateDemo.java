package com.corerevision;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {


        //from date to string
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm a MM/dd/yyyy");
        System.out.println(sdf);
        String format = sdf.format(d);
        System.out.println(format);

        //from String to date
        String s = "2024-11-01";
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("2" + sdf);
        Date date = sdf.parse(s);
        System.out.println(date);


    }
}
