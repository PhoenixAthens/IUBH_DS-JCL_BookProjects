package Unit2_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Shopee implements Comparable<Shopee>{
    private String FirstName;
    private String LastName;
    private int CustomerNumber;
    private String sex;
    private int age;
    private String Birthdate;
    public Shopee(String firstName,String lastName,String Sex,int age,int CustomerNumber,String date){
        this.FirstName=firstName;
        this.LastName=lastName;
        this.CustomerNumber=CustomerNumber;
        this.sex=Sex;
        this.age=age;
        this.Birthdate=date;
    }
    /*public int CalculateAge() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
        String date=Birthdate;
        Date DOB=sdf.parse(date);
        int BirthYear =DOB.getYear();
        Date Present=new Date();
        int PresentYear=Present.getYear();
        return PresentYear-BirthYear;
    }*/
    public String toString(){
        return "CustomerId: "+CustomerNumber+"\n"+
                "FirstName: "+FirstName+"\n" +
                "LastName: "+LastName+"\n"+
                "BirthDate: "+Birthdate+"\n"+
                "Age: "+age+"\n"+
                "Sex: "+sex+"\n";

    }
    public int compareTo(Shopee c){
        int Result=Integer.compare(CustomerNumber,c.CustomerNumber);
        if(Result==0){
            int result01=FirstName.compareTo(c.FirstName);
            int result02=LastName.compareTo(c.LastName);
            int result03=Integer.compare(age,c.age);
            int result04=sex.compareTo(sex);
            if(result01!=0){
                return result01;
            }else if(result02!=0){
                return result02;
            }else if(result01!=0){
                return result03;
            }else if(result04!=0){
                return result04;
            }else{
                return 0;
            }
        }
        return Result;
    }
    public void CompareWrapper(Shopee s){
        int result=compareTo(s);
        if(result>0){
            System.out.println(this.FirstName+" should come after "+s.FirstName);
        }else if(result<0){
            System.out.println(this.FirstName+" Should come before "+s.FirstName);
        }else{
            System.out.println("Duplicates!");
        }
    }
    public static void main(String...args){
        Shopee s1=new Shopee("Alex01","Johnson","M",27,2398,"22.05.1995");
        Shopee s2=new Shopee("Alex02","Johnson","M",26,2398,"22.06.1996");
        System.out.println(s1);
        System.out.println(s2);
        s1.CompareWrapper(s2);
        String name1="Alexabj01";
        String name2="Alexabj02";
        System.out.println(name1.compareTo(name2));

    }
}
