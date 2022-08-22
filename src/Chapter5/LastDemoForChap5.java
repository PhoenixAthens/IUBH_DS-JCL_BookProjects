package Unit_5;
import java.util.*;
import java.text.*;
public class LastDemoForChap5 {
    public static void main(String...args){
        Date d1=new Date();
        System.out.println("DATE: "+d1);
        Date d2=new Date(192,0,28,18,06,12);

        System.out.println("Date: "+d2);
        SimpleDateFormat sdf=new SimpleDateFormat(/*"EEE, dd 'th' 'of' MMMM, YYY 'at' hh:mm:ss:SS a G"*/);
        //sdf.applyPattern();// here the error in pattern was causing issues with date, it causes the same problem with
        //calendar as well.
        String dated=sdf.format(d2);
        System.out.println("FORMATTED: "+dated);
        try{

            Date again=sdf.parse(dated); //parse changes the date format to the default pattern
            System.out.println("AGain: "+again);
        }catch(ParseException ex){
            System.out.println(ex.getClass().getSimpleName());
            System.out.println(ex.getMessage());
        }
        Calendar cal=new GregorianCalendar(2092,0,28,18,06,12);
        String dater=sdf.format(cal.getTime());
        System.out.println("From cal: "+dater);
        try{
            Date form=sdf.parse(dater);
            System.out.println("Again 2: "+form);
        }catch(ParseException ex){
            System.out.println(ex.getClass().getSimpleName());
            System.out.println(ex.getMessage());
        }

    }
}
