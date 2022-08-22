package Unit_4_1.Part5;
import java.util.*;
public class Demo {
    public static void main(String...args){
        Map<Integer,String> StudentRecord=new HashMap<>();
        StudentRecord.put(101,"Phoenix");
        StudentRecord.put(102,"Athens");
        StudentRecord.put(103,"Grass");
        StudentRecord.put(104,"loud");
        StudentRecord.put(105,"loud");
        StudentRecord.put(105,"Hunger");
        StudentRecord.put(106,"panda");
        System.out.println(StudentRecord);
        Set<Integer> KeyValues=StudentRecord.keySet();
        System.out.println(KeyValues);
        Collection<String> valuesOfKeys=StudentRecord.values();
        System.out.println(valuesOfKeys);
        Set<Map.Entry<Integer,String>> SetOfKeyAndValues=StudentRecord.entrySet();
        System.out.println(SetOfKeyAndValues);
        System.out.println("Checking if key 105 is present in the map: "+StudentRecord.containsKey(105));
        System.out.println("Checking if value panda is presnt in the map: "+StudentRecord.containsValue("panda"));
        System.out.println(StudentRecord.get(101));
        Map<Integer,String> forPutAll=new HashMap<>(Map.of(107,"tiger",108,"Lion",109,"Apocalypse"));
        StudentRecord.putAll(forPutAll);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        KeyValues.remove(103);
        System.out.println(StudentRecord);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        valuesOfKeys.remove("loud");
        System.out.println(StudentRecord);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        SetOfKeyAndValues.remove(Map.entry(105,"Hunger"));
        System.out.println(SetOfKeyAndValues);
        System.out.println(StudentRecord);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        List<Map.Entry<Integer,String>> getWhat=StudentRecord.entrySet().stream().map(Map.Entry::copyOf).toList();
        System.out.println(getWhat);
        //(Map.entry(109,"Apocalypse"));
        System.out.println(getWhat);
        System.out.println(StudentRecord);
        //PreHashedMap<String> val=new PreHashesMap<>();


    }
}
