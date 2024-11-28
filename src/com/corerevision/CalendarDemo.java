package com.corerevision;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarDemo {

    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        System.out.println(c.getFirstDayOfWeek());

        System.out.println((Calendar.getInstance(Locale.CHINA)));
        System.out.println(c.get(Calendar.YEAR));

    }
}
