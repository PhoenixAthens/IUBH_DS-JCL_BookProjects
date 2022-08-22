package Unit_4_1.Part6;
import java.util.*;
public class Demo {
    public static void main(String...args){
        Deque<String> collectStrings=new ArrayDeque<>();
        collectStrings.addFirst("First");
        collectStrings.addFirst("Second");
        collectStrings.addFirst("Third");
        collectStrings.addFirst("Fourth");
        collectStrings.addFirst("Fifth");
        collectStrings.addFirst("Sixth");
        System.out.println("Collection of Strings: "+collectStrings);
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++\n");
        for(String s:collectStrings){
            System.out.println(s);
        }
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++\n");
        String onTop=collectStrings.peekFirst();
        System.out.println("element on top: "+onTop);
        System.out.println("peedFirst() does not remove the top element as a result: ");
        for(String s:collectStrings){
            System.out.println(s);
        }
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++\n");
        String removedFromTop=collectStrings.removeFirst();
        System.out.println("element on top: "+removedFromTop);
        System.out.println("removeFirst() removes the element from top: ");
        for(String s:collectStrings){
            System.out.println(s);
        }
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++\n");
        collectStrings.push("Seventh");
        for(String s:collectStrings){
            System.out.println(s);
        }
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++\n");
        collectStrings.addAll(new ArrayDeque<>(Arrays.asList("Eighth","Ninth","Tenth")));
        for(String s:collectStrings){
            System.out.println(s);
        }
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++\n");
        collectStrings.pop();
        for(String s:collectStrings){
            System.out.println(s);
        }
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++\n");
        collectStrings.addLast("Unbeknownst");
        for(String s:collectStrings){
            System.out.println(s);
        }
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("\n\t+++++++++++++++++++++++++++++++++++++++++\n");
        Iterator<String> it=collectStrings.descendingIterator();
        while(it.hasNext()){
            String el=it.next();
            System.out.println(el);
        }
        System.out.println("\n\t++++++++++++++++++++++++++++++++++++++++\n");

        System.out.println("\n\t+++++++++++++++++++++++++++++++++++++++++\n");
        Iterator<String> gt=collectStrings.iterator();
        while(gt.hasNext()){
            String el=gt.next();
            System.out.println(el);
        }
        System.out.println("\n\t++++++++++++++++++++++++++++++++++++++++\n");
        collectStrings.offerFirst("The end");
        collectStrings.offerLast("The beginning");
        System.out.println(collectStrings);
        for(String s:collectStrings){
            System.out.println(s);
        }
    }
}
