/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;


import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Singleton utility class to simplify managing and using dates and times, 
 * using the new Java Date/Time API ( JDK 8). Fields are
 * provided for choice of units to be returned from date/time difference
 * calculations.
  * @author Gladwin
 * (<a href="mailto:selvapriyaphd@gmail.com">selvapriyaphd@gmail.com</a>)
 * @version 1.02
 * @since jdk 8
 */
/**Return a formatted String representing a date but no time information.
 * Example:2016-03-11 CDT
 * @param date - is a LocalDate object
 * @return a date formatted according to Local Date object
 *
 * @author Gladwin
 */
public class DateUtilities {
     public String toString(Date date) throws IllegalArgumentException {
        if (date == null) {
            throw new IllegalArgumentException("Error: date argument cannot be null");
        }
        DateFormat df = DateFormat.getDateInstance();
        return df.format(date);
    }
}
