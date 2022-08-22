package Unit_5;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateHandlingUsingSimpleDateFormat {
    public static void main(String...args){
        SimpleDateFormat sdf=new SimpleDateFormat(" dd-MM-yyyy");
        Date date=new Date();
        String newDate=sdf.format(date);
        System.out.println("Present Date: "+newDate);
        try{
            Date date1=sdf.parse("3423-12-2022");//since month was 12 and date was 34 we went to Jan 2023
            //if I had used DD in pattern rather than using dd the date would have been Feb 2022, because
            //DD is the number of days since year began it goes from 1-365 0 is 31st of december;
            System.out.println("Date: "+date1);
        }catch(ParseException ex){
            System.out.println("Exeception caught: "+ex.getClass().getSimpleName());
            System.out.println("Error message: "+ex.getMessage());
            System.out.println("getLocalisedMessage(): "+ex.getLocalizedMessage());
        }
        DateFormat df;
        df=DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("LONG: "+df.format(date));
        df=DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("SHORT: "+df.format(date));
        df=DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("MEDIUM: "+df.format(date));
        df=DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("FULL: "+df.format(date));

        df=DateFormat.getTimeInstance(DateFormat.SHORT);
        System.out.println("Short "+df.format(date));
        df=DateFormat.getTimeInstance(DateFormat.MEDIUM);
        System.out.println("Medium: "+df.format(date));
        df=DateFormat.getTimeInstance(DateFormat.LONG);
        System.out.println("Long: "+df.format(date));
        df=DateFormat.getTimeInstance(DateFormat.FULL);
        System.out.println("Full: "+df.format(date));

        df=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        System.out.println("Short+Short "+df.format(date));
        df=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.LONG);
        System.out.println("Medium+Long: "+df.format(date));
        df=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.MEDIUM);
        System.out.println("Long+Medium: "+df.format(date));
        df=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
        System.out.println("Full+Long: "+df.format(date));
        try{
            Date d=df.parse("23.12.1998");
            System.out.println("DATE: "+d);
        }catch(ParseException ex){
            System.out.println("Exception in parsing: "+ex.getClass().getSimpleName());
            System.out.println("Exception message: "+ex.getLocalizedMessage());
        }



    }
}
