package Unit_5;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class HandlingDatesWithCalendar {
    public static void main(String...args){
        Calendar c1=new GregorianCalendar(2022,Calendar.AUGUST,14,10,03,20);
        System.out.println(c1);//if I make hour 24 the date becomes 15 from 14, thus hours go from 0-23
        System.out.println(c1.getTime());
        Calendar c2=new GregorianCalendar(2022,1,14,10,10,10);
        System.out.println(c2);
        System.out.println("c2.after(c1): "+c2.after(c1));
        System.out.println("c2.before(c1): "+c2.before(c1));
        System.out.println(c1.getActualMaximum(Calendar.DAY_OF_YEAR));
        System.out.println(c1.getCalendarType());
        System.out.println(c2.getFirstDayOfWeek());
        System.out.println(c1.isWeekDateSupported());
        Calendar c3=new GregorianCalendar();
        System.out.println(c3);
        System.out.println(c3.getTime());
        System.out.println(c3.get(Calendar.DAY_OF_YEAR));
        //System.out.println(c3.get(Calendar.FIELD_COUNT));
        System.out.println("1: "+c3.get(Calendar.DATE));
        System.out.println("2: "+c3.get(Calendar.DAY_OF_MONTH));
        System.out.println("3: "+c3.get(Calendar.DST_OFFSET));
        System.out.println("4: "+c3.get(Calendar.DAY_OF_WEEK));
        System.out.println("5: "+c3.get(Calendar.DAY_OF_WEEK_IN_MONTH));//this is the number of times sunday has
        //appeared so far in this month
        System.out.println("6: "+c3.get(Calendar.HOUR));//for 0-11 hour clock
        System.out.println("DAY before: "+c3.get(Calendar.DATE));
        c3.set(Calendar.HOUR_OF_DAY,24);
        System.out.println("DAY after: "+c3.get(Calendar.DATE));
        System.out.println("7: "+c3.get(Calendar.HOUR_OF_DAY));//24 hour clock(0-23)
        System.out.println("8: "+c3.get(Calendar.ERA));
        System.out.println("9: "+c3.get(Calendar.MINUTE));
        System.out.println("10: "+c3.get(Calendar.MILLISECOND));
        System.out.println("11: "+c3.get(Calendar.WEEK_OF_MONTH));
        System.out.println("12: "+c3.get(Calendar.WEEK_OF_YEAR));
        System.out.println("13: "+c3.get(Calendar.YEAR));
        SimpleDateFormat sdf=new SimpleDateFormat("EEEE, dd'of' MMMM, YYYY [hh:mm:ss:SSS] a G ");
        String c=sdf.format((new GregorianCalendar()).getTime());
        DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
        String d=df.format((new GregorianCalendar()).getTime());
        System.out.println("New Date formatted with sdf: "+c);
        System.out.println("New Date formatted with df: "+d);
        Date d1=(new GregorianCalendar()).getTime();
        Calendar dc2=new GregorianCalendar();
        System.out.println("Before Roll: "+dc2.getTime());
        dc2.roll(Calendar.MONTH,6);
        dc2.roll(Calendar.YEAR,1);
        System.out.println("After roll: "+dc2.getTime());

    }

}
