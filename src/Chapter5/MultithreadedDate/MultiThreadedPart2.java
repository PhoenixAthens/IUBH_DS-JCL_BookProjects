package Unit_5.MultithreadedDate;
import java.util.concurrent.*;
import java.util.*;
import java.text.*;
public class MultiThreadedPart2 {
    //this way of using SDF doesn't cause thread issues and non-thread safe sdf
    //works fine!
    private SimpleDateFormat sdf=new SimpleDateFormat("EEEE, dd-MM-yyyy '@' hh:mm:ss:SSS a G");
    public static void main(String...args){
        String DateString="Monday, 15-08-2022 @ 11:17:23:234 am AD";
        ExecutorService exc=Executors.newFixedThreadPool(20);
        Runnable run=new Runnable(){
            @Override
            public void run(){
                try{
                    MultiThreadedPart2 m=new MultiThreadedPart2();
                    Date date=m.sdf.parse(DateString);
                    System.out.println("Date: "+date);
                }catch(Exception ex){
                    System.out.println("Exception: "+ex.getClass().getSimpleName());
                    ex.printStackTrace();
                }
            }
        };
        for(int i=0;i<20;i++){
            exc.submit(run);
        }
        exc.shutdown();
    }
}
