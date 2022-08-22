package Unit_4_1.Part2;

public class Customer {
    private String firstName;
    private String lastName;
    private String gender;
    public Customer(String firsName,String lastName){
        this.firstName=firsName;
        this.lastName=lastName;
        this.gender=" ";
    }
    public String getFirsName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String update){
        this.gender=update;
    }
    public String toString(){
        return "Name: "+firstName+", LastName: "+lastName;
    }
}
