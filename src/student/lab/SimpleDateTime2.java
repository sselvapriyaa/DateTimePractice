/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Gladwin
 */
public class SimpleDateTime2 {
    public static void main(String[] args) throws ParseException {
        // Create Simple date formatter
        String format = "M/d/yy h:mm:ss a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        // Current date and time
        Calendar date1 = Calendar.getInstance();
        System.out.println("Current: " + sdf.format(date1.getTime()));
        
        //Add 30 days
        date1.add(Calendar.DATE, -30);
        System.out.println("30 days prior: " + sdf.format(date1.getTime()));
        
        //Turn String into Date
        String dateString = "1/1/16 0:00:00 am";
        Date date2 = sdf.parse(dateString);
        sdf.format(date2);
        
    }
}
