package Unit_4_1.Part7;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DemoOfQueue {
    public static void main(String...args){
        Queue<String> queue=new ConcurrentLinkedQueue<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("four");
        queue.add("Five");
        queue.add("Six");
        System.out.println(queue.size());
        System.out.println("Removing using .remove(obj): "+queue.remove("Six"));
        System.out.println("My Queue: "+queue);
        for(String s:queue){
            System.out.println("element: "+s);
        }
        System.out.println(queue.size());
        int sizeOfQueue=queue.size();
        for(int i=0;i<sizeOfQueue;i++){
            System.out.println(queue.remove());
        }
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++");
        try{
            System.out.println(queue.remove());
        }catch(NoSuchElementException ex){
            System.out.println("Empty queue!");
            System.out.println("Message from java: "+ex.getMessage());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++\n");
        try{
            System.out.println(queue.element());
        }catch(NoSuchElementException ex){
            System.out.println("Trying to peed for an element that doesn't exist!");
            System.out.println("Message from java: "+ex.getMessage());
        }
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Using .offer() .poll() .peek() ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++");
        queue.offer("Seven");
        queue.offer("Eight");
        queue.offer("nine");
        queue.offer("ten");
        queue.offer("eleven");
        queue.offer("twelve");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++\n");
        int sizeOfQ=queue.size();
        for(int i=0;i<sizeOfQ;i++){
            queue.poll();
        }
        try{
            queue.poll();
            System.out.println(queue.poll());
        }catch(Exception ex){
            System.out.println("Message from java: "+ex.getMessage());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++\n");
        try{
            System.out.println(queue.peek());
        }catch(Exception ex){
            System.out.println("Trying .peed()");
            System.out.println("Message from java: "+ex.getMessage());
        }



    }
}
