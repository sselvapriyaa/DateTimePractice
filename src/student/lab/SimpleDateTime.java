/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author Gladwin
 */
public class SimpleDateTime{
    public static void main(String[] args){
    // Old Way (Pre-JDK8)
   
    
    // Not international
    Date date1= new Date();
        System.out.println(date1);
        
        // Get Date/Time Long Integer value
        long dateTimeValue=date1.getTime();
        System.out.println("Date Time Value is" +dateTimeValue);
        
        //International
        Calendar date3 =Calendar.getInstance();
        System.out.println(date3);
        
        //Bad pratice - Don't do this!
        date3.set(2020, 2,22);
        System.out.println("Bad practice:" +date3);
        //Good practice - Do this!
        
        
        // New way (JDK 8+)
        //Internlational
        LocalDateTime date2 =LocalDateTime.now();
        System.out.println(date2);
        
        //Date only (No Time)
        LocalDate date4 =LocalDate.now();
        System.out.println(date4);
        
}
}

