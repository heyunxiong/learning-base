package com.sean.hyx2023.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Author: Sean He
 * Date: 2023/3/13
 */
public class MyDate {
    public static void main(String[] args) throws ParseException {
        String dateString = "2023-03-06 " ;
        String dateFormat = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat, Locale.ENGLISH);
        Date date = sdf.parse(dateString);
        System.out.println(date);

        String dateFormat2= "dd-MMM-yyyy";
        SimpleDateFormat sdf2 = new SimpleDateFormat(dateFormat2, Locale.ENGLISH);
        System.out.println(sdf2.format(date));
    }
}
