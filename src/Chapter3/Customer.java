package Unit3_0;

public class Customer {
    private String name;
    private int age;
    public Customer(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setAge(int ageUpdate){
        this.age=ageUpdate;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "Name: "+name+"\n,age: "+age;
    }
}
