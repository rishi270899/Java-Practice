package datesAndCalendars;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatesAndCalendar {


    public static void main(String[] args){
//        Date today = new Date();
//        System.out.println(today);
//        displayCurrentDate();
        displaySetDate();
    }

    public  static void displayCurrentDate(){
        Calendar cal = Calendar.getInstance();
        System.out.println("Calender date");
//        System.out.println(cal);
        System.out.println(cal.getTime());
        Date date = new Date();
        System.out.println("Date object date");
        System.out.println(date);
        cal.setTime(date);
        System.out.println(cal.getTime());
    }

    public static void displaySetDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2026,02, 02);
        Date date = calendar.getTime();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String FD = sdf.format(date);
        System.out.println(FD);
    }
}
