package Unit2_3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Customer {
    private String name;
    private int age;
    private int CustomerID;
    private String lastName;
    private String Birthdate;
    private String Sex;
    public Customer(String name,String lastName,String Birthdate,String sex,int age){
        this.name=name;
        this.lastName=lastName;
        this.Birthdate=Birthdate;
        this.Sex=sex;
        this.age=age;
        this.CustomerID=(int)Math.ceil(Math.random()*10000);

    }
    @Override
    public int hashCode(){
        final int Prime=31;
        int result=1;
        result=Prime*result+age;
        result=Prime*result+CustomerID;
        result=Prime*result+(name==null?0:name.hashCode());
        result=Prime*result+(lastName==null?0:lastName.hashCode());
        result=Prime*result+(Birthdate==null?0:Birthdate.hashCode());
        result=Prime*result+(Sex==null?0:Sex.hashCode());
        return result;
    }
    @Override
    public String toString(){
        return "Name: "+name+" \nLastName: "+lastName+" \nBirthdate: "+Birthdate+" \nAge: "+age+" \nCustomerId: "+CustomerID+" \nSex: "+Sex+"" +
                "HashCode: "+this.hashCode();
    }
    public static void main(String...args) throws FileNotFoundException {
        Customer c1=new Customer("Louis","Bringham","3-07-89","M",33);
        Customer c2=new Customer("Francine","Kabutz","12-05-50","F",72);
        Customer c3=new Customer("Phoenix","Athens","28-01-2003","M",19);
        OutputStream output=new FileOutputStream("/Users/anmolkhanna/Downloads/Cusomer.txt");
        PrintStream printTo=new PrintStream(output);
        System.setOut(printTo);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

}
