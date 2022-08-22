package Unit_5.MultithreadedDate;
import java.util.concurrent.*;
import java.util.Date;
import java.text.*;
public class MultiThreadedPart3 {
    //this one also barely ever shows an error or results in non-threads-safe behavior taking control and causing troubles
    public static void main(String...args){
        String dateString="Sunday 15-08-2002 at 03:45:23:222 am AD";
        ExecutorService exc=Executors.newFixedThreadPool(10);
        Runnable run= () -> {
            try{
                Date date=(new SimpleDateFormat("EEEE dd-MM-yyyy 'at' hh:mm:ss:SSS a G")).parse(dateString);
                System.out.println("Date: "+date);
            }catch(Exception px){
                System.out.println("Exception: "+px.getClass().getSimpleName());
                px.printStackTrace();
            }
        };
        for(int i=0;i<10;i++){
            exc.submit(run);
        }
        exc.shutdown();
    }
}
