package Unit_4_1.Part7;

public class Customer implements Comparable<Customer>,Cloneable {
    private String firstName;
    private String lastName;
    private String sex;
    private String birthDate;
    private ShoppingCart cart;
    public Customer(){
        this.cart=new ShoppingCart();
    }
    public Customer(String firstName,String lastName,String sex,String birthDate){
        this.firstName=firstName;
        this.lastName=lastName;
        this.sex=sex;
        this.birthDate=birthDate;
        this.cart=new ShoppingCart();
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSex(){
        return sex;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public void setBirthDate(String birthDate){
        this.birthDate=birthDate;
    }
    public String toString(){
        return "Name: "+firstName+"\nLastName: "+lastName+"\nSec: "+sex+"\nBirthdate: "+birthDate+"\n";
    }
    public ShoppingCart getShoppingCart(){
        return cart;
    }
    public void printShoppingCart(){
        System.out.println(cart);
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }if(obj instanceof Customer){
            Customer c=(Customer) obj;
            return c.firstName.equals(firstName)
                    &&c.lastName.equals(lastName)
                    &&c.sex.equals(sex)
                    &&c.birthDate.equals(birthDate);
        }
        return super.equals(obj);
    }
    public int compareTo(Customer c){
        int result=firstName.compareToIgnoreCase(c.firstName);
        if(result==0)result=lastName.compareToIgnoreCase(c.lastName);
        if(result==0)result=sex.compareToIgnoreCase(c.sex);
        if(result==0)result=birthDate.compareToIgnoreCase(c.birthDate);
        return result;
    }
    public Customer clone(){
        try{
            Customer c=(Customer) super.clone();
            return c;
        }catch(CloneNotSupportedException ex){
            System.out.println("error while cloning");
            return null;
        }
    }
    public void setCart(ShoppingCart cart){
        this.cart=cart;
    }
}
