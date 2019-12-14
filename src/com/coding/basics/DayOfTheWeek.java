package com.coding.basics;

/*
Question 3:
Given a date, determine the day of the week (Monday, . . . , Sunday) on that day.
(e.g. 9 August 2010—the launch date of the first edition of this book—is a Monday.)
 */

import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfTheWeek {

    public static void main(String[] args) {
        String[] days = new String[]{"", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        Calendar cal = new GregorianCalendar(1988, 9, 21); //21st Oct 1988
        System.out.println(days[cal.get(Calendar.DAY_OF_WEEK)]);

    }
}
