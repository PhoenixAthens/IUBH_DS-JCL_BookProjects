package Unit_4_1.Part4;
import java.util.*;
public class Test {
    public static void main(String...args){
        TreeSet<String> elements=new TreeSet<>();
        elements.add("Hello");
        elements.add("Hallo");
        elements.add("Hballo");
        elements.add("world");
        elements.add("what's");
        elements.add("up");
        System.out.println(elements);
        for(String i:elements){
            System.out.println(i);
        }
        HashSet<Integer> big=new HashSet<>(Set.of(1,2,3,4,5,6,7));
        HashSet<Integer> small=new HashSet<>(Set.of(1,2,3,4,8,9,10));
        small.removeAll(big);
        System.out.println(small);

    }
}
