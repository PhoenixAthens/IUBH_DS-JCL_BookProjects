package Unit_4_1.Part6;
import java.util.*;
public class History {
    private Deque<String> dequeOfEvents=new ArrayDeque<>();
    public void addEvent(String s){
        dequeOfEvents.addFirst(s);
    }
    public String goBack(){
        String peekAtTop=dequeOfEvents.peekFirst();
        if(peekAtTop!=null){
            String removeRecentEvent=dequeOfEvents.removeFirst();
            return removeRecentEvent;
        }
        return null;
    }
}
