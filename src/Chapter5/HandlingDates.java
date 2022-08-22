package Unit_5;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
public class HandlingDates {
    public static void main(String...args){
        Date d=new Date();
        System.out.println("Current date: "+d);
        long millSeconds=d.getTime();
        System.out.println("Milliseconds since !970 Jan!: "+millSeconds);
        System.out.println("Seconds Since jan1 1970: "+millSeconds/1000);
        System.out.println("Minutes since Jan1 1970: "+(millSeconds/1000)/60);
        System.out.println("Hours Since Jan1 1970: "+((millSeconds/1000)/60)/60);
        System.out.println("Days since Jan1 1970: "+(((millSeconds/1000)/60)/60)/24);
        System.out.println("Years since Jan1 1970: "+((((millSeconds/1000)/60)/60)/24)/365);

        double doo= 234.9899;
        System.out.println(Double.hashCode(doo));
        float foo=2.34f;
        System.out.println(Float.hashCode(foo));


    }
}
