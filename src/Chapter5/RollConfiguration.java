package Unit_5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class RollConfiguration {
    private Calendar c;
    public RollConfiguration(){
        c=new GregorianCalendar();
        NumberOfMonthsToRoll=0;
        NumberOfYearsToRoll=0;
    }
    private int NumberOfMonthsToRoll;
    private int NumberOfYearsToRoll;
    public void setNumberOfMonthsToRoll(int numberOfMonthsToRoll){
        this.NumberOfMonthsToRoll=numberOfMonthsToRoll;
    }
    public void setNumberOfYearsToRoll(int numberOfYearsToRoll){
        this.NumberOfMonthsToRoll=numberOfYearsToRoll;
    }
    public void setDate(int year, int month, int date,int hour,int minute,int second){
        this.c=new GregorianCalendar(year,month,date,hour,minute,second);
    }
    public void RollDate(int EnterTheMonths){
        NumberOfMonthsToRoll=EnterTheMonths;
        NumberOfYearsToRoll=CalculateYearsToRoll();
        getPresentDateAndTime();
        c.roll(Calendar.MONTH,NumberOfMonthsToRoll);
        c.roll(Calendar.YEAR,NumberOfYearsToRoll);
        getPresentDateAndTime();
    }
    private int CalculateYearsToRoll(){
        int numberOfMonthsToRoll=NumberOfMonthsToRoll;
        int CurrentMonth=c.get(Calendar.MONTH);

        if(numberOfMonthsToRoll<0){
            numberOfMonthsToRoll=-(numberOfMonthsToRoll);
            int totalMonths=numberOfMonthsToRoll+CurrentMonth;
            return -(totalMonths/12);
        }else{
            int totalMonths=numberOfMonthsToRoll+CurrentMonth;
            return totalMonths/12;
        }

    }
    public Calendar getCalendarObject(){
        return c;
    }
    public void getPresentDateAndTime(){
        System.out.println("Current:"+getCalendarObject().getTime());
    }
    public String toString(){
        return "Date & Time: "+c;
    }
    public static void main(String...args){
        RollConfiguration rc=new RollConfiguration();
        rc.getPresentDateAndTime();
        rc.RollDate(-50);
        rc.RollDate(10);
        rc.RollDate(40);
    }

}
