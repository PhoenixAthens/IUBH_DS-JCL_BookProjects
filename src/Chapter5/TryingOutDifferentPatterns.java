package Unit_5;
import java.text.*;
import java.util.*;
public class TryingOutDifferentPatterns {
    public static void main(String...args){
        SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-YYYY G");
        //G is for era AD or BC, m is for minute in hour, thus if you use above pattern you get, 13-39-2022 AD where
        String date1=sdf.format(new Date());// 39 is the minutes in time.
        System.out.println("Date1: "+date1);
        sdf=new SimpleDateFormat("dd-MM-YYYY G");
        String date2=sdf.format(new Date());
        System.out.println("Date2: "+date2);
        sdf=new SimpleDateFormat("dd-MMM-YYYY G");
        String date3=sdf.format(new Date());
        System.out.println("Date3: "+date3);
        sdf=new SimpleDateFormat("dd-MMMM-YYYY G");
        String date4=sdf.format(new Date());
        System.out.println("Date4: "+date4);
        sdf=new SimpleDateFormat("dd-MMMM-YYYY,ww,G");
        String date5=sdf.format(new Date());
        System.out.println("Date5: "+date5);
        sdf=new SimpleDateFormat("dd-MMMM-YYYY, WW, G");
        String date6=sdf.format(new Date());
        System.out.println("Date6: "+date6);
        sdf=new SimpleDateFormat(": DD, :dd, : MMMM, : YYYY, : ww, : WW, : G");
        String date7=sdf.format(new Date());
        System.out.println("Date7: "+date7);
        sdf=new SimpleDateFormat("DD,FF,dd,MMMM,YYYY,ww,WW,G");//FF is for the number of day in month like here
        String date8=sdf.format(new Date());// we got 02 that is this is 2nd Saturday of this month
        System.out.println("Date8: "+date8);
        sdf=new SimpleDateFormat("DD,FF,dd,MMMM,YYYY,ww,WW,mmmm,G");
        String date9=sdf.format(new Date());
        System.out.println("Date9: "+date9);
        sdf=new SimpleDateFormat("dd, MMMM, YYYY, EEEE ,G");
        String date10=sdf.format(new Date());
        System.out.println("Date10: "+date10);
        sdf=new SimpleDateFormat("dd, MM, YYYY, EEE, G");//E,EE,EEE mean the same, M,MM gives month number
        String date11=sdf.format(new Date());// but MMM, MMMM gives abbreviated month name, complete month name
        System.out.println("Date11: "+date11);
        sdf=new SimpleDateFormat("dd, MMM, YYYY, EEEE, u, G");
        String date12=sdf.format(new Date());
        System.out.println("Date12: "+date12);
        sdf=new SimpleDateFormat("dd, MMMM, YYYY, EEEE, u, a, G");
        String date13=sdf.format(new Date());
        System.out.println("Date13: "+date13);
        sdf=new SimpleDateFormat("dd, MMMM, YYYY, HH, EEEE, u, a, G");
        String date14=sdf.format(new Date());
        System.out.println("Date14: "+date14);
        sdf=new SimpleDateFormat("dd 'of' MMMM, YYYY; kk 'Day:' EEEE, u, a, G ");
        String date15=sdf.format(new Date());
        System.out.println("Date15: "+date15);
        sdf=new SimpleDateFormat("dd 'of' MMMM, YYYY; KK, 'Day: 'EEEE, u, a, G");
        String date16=sdf.format(new Date());
        System.out.println("Date16: "+date16);
        sdf=new SimpleDateFormat("'DATE: 'dd,'Month:' MMMM,'Year: ' YYYY,'hour[1-12]' hh,'hour[0-11]' KK,'hour[1-24]' kk,'hour[0-23]' HH,'Num of day' u,'Day: ' EEEE, a, G");
        String date17=sdf.format(new Date());
        System.out.println("Date17: "+date17);
        sdf=new SimpleDateFormat("dd'th of' MMM, YYYY, 'AT:' hh:mm:ss:SSS, z  EEEE, u, a, G");
        String date18=sdf.format(new Date());
        System.out.println("Date18: "+date18);
        DateFormat df=DateFormat.getTimeInstance(DateFormat.FULL);
        System.out.println("Using DF: "+df.format(new Date()));
        Object obj=new String("Hello World");
        try{
            obj.wait(5000);
            System.out.println("obj: "+obj);
        }catch(InterruptedException ex){
            System.out.println("Exception occured!");
        }
        Date n;
        try{
            n=sdf.parse(date18);
        }catch(ParseException ex){
            System.out.println("There was an exception: "+ex.getMessage());
        }
        




    }
}
