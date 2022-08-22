package Unit3_0;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class Main {
    private static Logger log=LogManager.getRootLogger();
    public static void main(String...args){
        Customer c1=new Customer("Jacob",5);
        log.info(c1);
        log.debug(c1);
    }
}
