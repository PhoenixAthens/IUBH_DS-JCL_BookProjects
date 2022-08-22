package Unit2_5;

public class Main {
    public static void main(String...args){
        Student s1=new Student("John","Manning","JohnManning@yahoo.com",123456,new Course("Maths","Economics","Accounts"));
        Student s2=s1.clone();
        System.out.println(s1==s2);
        System.out.println(s1.getCourse()==s2.getCourse());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
    }
}
