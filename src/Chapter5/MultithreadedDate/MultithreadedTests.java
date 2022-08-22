package Unit_5.MultithreadedDate;
import java.text.*;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadedTests {
    private static final SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy 'at' hh:mm:ss:SSS a G");
    public static void main(String...args){
        String dateString="24-11-2002 at 18:23:40:234 am AD";
        ExecutorService exc= Executors.newFixedThreadPool(10);
        Runnable runnable=new Runnable(){
            @Override
            public void run(){
                try{
                    Date date=sdf.parse(dateString);
                    System.out.println("Date: "+date);
                }catch(Exception ex){
                    System.out.println("Exception: "+ex.getClass().getSimpleName());
                    ex.printStackTrace();
                }
            }
        };
        for(int i=0;i<10;i++){
            exc.submit(runnable);
        }
        exc.shutdown();

    }

}
