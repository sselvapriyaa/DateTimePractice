/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 *
 * @author Gladwin
 */
public class Challenges {

    public static void main(String[] args) {

        // #1 Find the last business day numerical value (e.g., 31) of the month given a known
        // value for the last business day String value of the week (e.g., "Thursday")
        LocalDate today2 = LocalDate.now();
        LocalDate lastBusDay
                = today2.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
        System.out.println(lastBusDay.getDayOfMonth());

        // #2 Find the difference between two dates, resulting in hours plus 
        // leftover minutes. So, e.g., 90 minutes is 1 hours and 30 minutes
        //LocalDateTime startDate=;
        LocalDateTime startDate = LocalDateTime.now();

        LocalDateTime curDate = LocalDateTime.now();
//         LocalDateTime startDate;
        LocalDateTime endDate2 = curDate.with(TemporalAdjusters.lastDayOfMonth()).minusMinutes(500);

//        Duration diff = Duration.between(startDate, endDate);
        Duration diff2 = Duration.between(startDate, endDate2);
        long hrs = diff2.toHours();
        long min = diff2.toMinutes() % 60;
        System.out.println("Hours: " + hrs + ", Minutes: " + min);

        // #3 Based on the current, local date and time, calculate the current
        // date and time right now in Berlin, Germany
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd  hh:mm a");

        ZonedDateTime local = ZonedDateTime.now();
        local = local.withZoneSameInstant(ZoneId.of("Europe/Berlin"));

        System.out.println(local.format(fmt));

        // #4 Calculate a due date that is 15 days from now
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dueDate = now.plusDays(15);
        System.out.println(dueDate);

        // #5 On what year will the next leap year happen?
        int year = LocalDate.now().getYear();
        while (!Year.isLeap(year)) {
            year++;
        }
        System.out.println("The next leap year is: " + year);

    }
}
