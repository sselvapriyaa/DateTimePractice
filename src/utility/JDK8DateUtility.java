package utility;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.time.Period ;
import java.time.temporal.ChronoUnit;

/**
 * Managing and using dates and times, using the new Java Date/Time API ( JDK
 * 8). Fields are provided for choice of units to be returned from date/time
 * difference calculations.
 *
 * @author Gladwin
 */
public class JDK8DateUtility {
    public static void main(String[] args) {
        JDK8DateUtility jdk8 = new JDK8DateUtility();
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        jdk8.DateFormat();
        String date1 = jdk8.DateFormat();
        System.out.println(date1);
        System.out.println(jdk8.StringToDate("1986-04-08 12:30"));
        //System.out.println(jdk8.DateDifference());
        //String dateDiff =jdk8.DifferenceBetweenTwoDates();
        //System.out.println(dateDiff);
        String dateDifference  =jdk8.DifferenceBetweenTwoDates();
        System.out.println(dateDifference );
        
    }
    
    /**
     * Return a formatted String representing a date and time.
     * Example:2016-03-30T00:21:24.787
     *
     * @param dateTime - is a LocalDateTime object
     * @return a dateTime formatted according to LocalDateTime object
     *
     * @author Gladwin
     */
    public LocalDateTime StringToDate(String date1) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(date1, formatter);
        return dateTime;
    }

    /**
     * The format(DateTimeFormatter) method converts a temporal-based object to
     * a string representation using the specified format. The following code
     * converts an instance of LocalDateTime using the format "MMM d yyyy hh:mm
     * a". This pattern includes the hour, minutes, and a.m. and p.m.
     * components.
     *
     * @return date1
     */
    public String DateFormat() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");
        String date1 = date.format(format);
        return date1;
    }

//    /**
//     * Difference between two dates, resulting in hours plus leftover minutes.
//     * So, e.g., 90 minutes is 1 hours and 30 minutes
//     *
//     */
//    public String DateDifference() {
//        LocalDateTime date = LocalDateTime.now();
//        LocalDateTime startDate = LocalDateTime.now();
//        LocalDateTime curDate = LocalDateTime.now();
//        LocalDateTime endDate2 = curDate.with(TemporalAdjusters.lastDayOfMonth()).minusMinutes(500);
//        Duration diff = Duration.between(startDate, endDate2);
//        Duration diff2 = Duration.between(startDate, endDate2);
//        long hrs = diff2.toHours();
//        long min = diff2.toMinutes() % 60;
//        String Answer = "Hours: " + hrs + ", Minutes: " + min;
//        return Answer;
//    }
//    public Period CalculateDateDifference(){
//        LocalDate today = LocalDate.now();
//        int month = today.getMonthValue();
//       LocalDate date2 = LocalDate.of(2014, Month.MARCH, 14);
//      Period date3 = Period.between(today, date2); 
//      return date3;
//          }
//    
    
    /** This method uses java.time.temporal.ChronoUnit to know the difference in days/months/years
     * 
     * @return dateDiff
//     */
//    public String DifferenceBetweenTwoDates()
//{
//     LocalDate endDate = LocalDate.of(1980, Month.JULY, 4);
//     LocalDate currentDate = LocalDate.now();
//     long Days = ChronoUnit.DAYS.between(endDate, currentDate);
//     long Months = ChronoUnit.MONTHS.between(endDate, currentDate);
//     long Years = ChronoUnit.YEARS.between(endDate, currentDate);
//     String dateDiff = "Days: " + Days + ", Months: " + Months + ",Years :" + Years;
//     return dateDiff;
//    
//}
    
    
    /** This method uses ChronoUnit know the difference in days/months/years and 
     * to know the difference in smaller time units e.g. milliseconds, minutes etc.
     * 
     * 
     * @return dateDuration
     */
    public String DifferenceBetweenTwoDates()
 {
     LocalDateTime dateTime = LocalDateTime.of(1988, 7, 4, 0, 0);
     LocalDateTime dateTime2 = LocalDateTime.now();
     long Nano = ChronoUnit.NANOS.between(dateTime, dateTime2);
     long Seconds = ChronoUnit.SECONDS.between(dateTime, dateTime2);
     long Milli = ChronoUnit.MILLIS.between(dateTime, dateTime2);
     long Minutes = ChronoUnit.MINUTES.between(dateTime, dateTime2);
     long Hours = ChronoUnit.HOURS.between(dateTime, dateTime2);
     long Days = ChronoUnit.DAYS.between(dateTime, dateTime2);
     long Months = ChronoUnit.MONTHS.between(dateTime, dateTime2);
     long Years = ChronoUnit.YEARS.between(dateTime, dateTime2);
     String dateDifference = "Nano: " + Nano + ", Seconds: " + Seconds 
              + ",Milli :" + Milli +",Minutes:" +Minutes +" ,Hours:" + Hours
             + ",Days:" +Days +",Months:"+Months +",Years" +Years;
     return dateDifference;
    
 }
}


    



