package Unit_5;
import java.util.*;
public class PartWithClassDate {
    public static void main(String...args){
        Date date=new Date();
        System.out.println("Present Date: "+date);
        Date date2=new Date(125,0,25,11,34,20);//years begin from 1900, so 2022 is 122
        System.out.println("3 years later: "+date2);//1900+122=2022 and months are from ( 0-11 ), jan=0;dec=11
        date2.setDate(11);//if we set date to 0 then it is equal to the last date of last month like January 0 is dec 31
        //date2.setTime(System.currentTimeMillis());//doing this will not only change time but the entire date as well
        System.out.println(date2);
        date2.setHours(24);//hours are from 0-23, 24 is ist first hour the next day
        System.out.println();
        if(date2.getDate()==10){
            System.out.println("hours begin from 0 till 23, 24 is equal to 0 hours on next day");
        }
        System.out.println(date2);
        date2.setMonth(11);
        System.out.println(date2);
        date2.setMinutes(60);
        System.out.println(date2);
        date2.setYear(124);//to set year as well you enter the difference from 1900
        System.out.println(date2);
        Date date3=new Date(124,5,25,20,30);
        System.out.println(date2.after(date3));
        System.out.println(date2.before(date3));
        date2.setTime(System.currentTimeMillis());
        date3.setYear(date2.getYear());
        date3.setMonth((date.getMonth()+6));
        date3.setDate(date2.getDate());
        date3.setHours(date2.getHours());
        date3.setMinutes(date2.getMinutes());
        date3.setSeconds(date2.getSeconds());
        System.out.println("Start: "+date2);
        System.out.println("Expeiry: "+date3);
        System.out.println(date3.after(date2));
        if(date3.before(date2)){
            System.out.println("Alert! time's up You need to change you credentials");
        }else{
            System.out.println("You are safe for now!");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Six Months Later:   ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        date2.setMonth(date3.getMonth());
        date2.setYear(date3.getYear());
        date2.setMinutes(date2.getSeconds()+60);
        System.out.println("Current: "+date2);
        System.out.println("Expeiry: "+date3);
        if(date2.after(date3)){
            System.out.println("Alert! time's up You need to change you credentials");
            System.out.println("Date of Expiration: "+date3);
            System.out.println("Current date: "+date2);
        }else{
            System.out.println("You are still safe");
        }
        long time=System.currentTimeMillis();//this method itself gives us milliseconds since 1970
        Date dat4=new Date(time);
        //to check if System.currentTimeMillis is working with 1970
        Date date5=new Date(70,1,1,1,1,12);
        System.out.println("This should give in milliseconds: from 1900 "+date5.getTime());
        long g=date5.getTime();
        long years=((((((g/1000))))));//this gives 2662272000 which is number of MilliSeconds in 31 days
        System.out.println("years: "+years);
        Date date6=new Date();
        System.out.println("This is time in milliseconds from 1900 to preseng: "+date6.getTime());
        System.out.println("Now comp milliseconds btw 1970 and present: "+(date6.getTime()-date5.getTime()));
        System.out.println("And this is the result from CurrentTimeMillis: "+time);
        System.out.println("Date using currentTimeMillis: "+new Date(System.currentTimeMillis()));
        System.out.println("Date using milliseconds since 1900: "+new Date(date6.getTime()));
        Date date10=new Date(130,11,12,24,12,45);
        System.out.println(date10);
    }
}
