//package test;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeConversion{


    public static void update(String Country, DateFormat dateFormat){
        //updating the timezone
        dateFormat.setTimeZone(TimeZone.getTimeZone(Country));
    }

    public static void timeConversionByCountry(String Country, Calendar calendar, DateFormat dateFormat, Date date){
      //  update(Country, dateFormat);
        TimeZone zone = TimeZone.getTimeZone(Country);

       // System.out.println(TimeZone.getTimeZone(Country));
        System.out.println(zone.getOffset(Calendar.ZONE_OFFSET));
        System.out.println("Time in "+Country+" : ");
        System.out.println(dateFormat.format(date));
        return ;
    }

    public static void main(String[]args){
        // getting calendar instance
        Calendar calendar = Calendar.getInstance();
        // getting date and time
        Date date = calendar.getTime();
        // getting dateformat
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy  hh:mm:ss  Z");

        Scanner sc = new Scanner(System.in);
        String choice;

        do{
            System.out.println("Enter the Name of Country :");
            String country = sc.nextLine();

            // Function call
            timeConversionByCountry(country, calendar, dateFormat, date);

            System.out.println("Do you want time for another country ?     (y/n)");
            choice = sc.next();
            sc.nextLine();
        }while(choice.equals("y"));
        sc.close();
    }
}


