package com.stackroute.pe3;
import java.text.*;
import java.util.*;

public class MyDate {
    public boolean startDate() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        String s1 = df.format(c.getTime());
        if (s1.equals("Mon 18/02/2019"))
            return true;
        else
            return false;

    }

    public boolean endDate() {
        Calendar c = Calendar.getInstance();
        String s2 = "";
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        c.add(Calendar.DATE, 6);
        s2 = (df.format(c.getTime()));
        if (s2.equals("Sun 24/02/2019"))
            return true;
        else
            return false;

    }
}
