package com.anil.practice;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by This1 on 26/08/2015.
 */
public class DatePgm1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
        System.out.println(gc.getTime());
        gc.add(GregorianCalendar.DATE, 1);

        System.out.println(gc.getTime());
        Date d2 = gc.getTime();

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));


        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ld = LocalDate.of(2009, 1, 28);
        System.out.println(ld);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.YYYY");

        System.out.println(dtf.format(ld));


    }
}
