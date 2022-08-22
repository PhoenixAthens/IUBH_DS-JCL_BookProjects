package Unit_4_1.Part5;

public class Customer implements Comparable<Customer>,Cloneable{
    public static int NumberOfCustomer=1;
    private int CustomerNumber;
    private String FirstName;
    private String LastName;
    private String Gender;
    private int age;
    private Address address;
    private ShoppingCart cart;
    public Customer(String firstName,String lastName,int age){
        this.CustomerNumber=NumberOfCustomer;
        this.FirstName=firstName;
        this.LastName=lastName;
        this.age=age;
        this.cart=new ShoppingCart();
        NumberOfCustomer++;
    }
    public Customer(String firstName,String lastName,String gender,int age,Address address,ShoppingCart cart){
        this.CustomerNumber=NumberOfCustomer;
        this.FirstName=firstName;
        this.LastName=lastName;
        this.Gender=gender;
        this.age=age;
        this.address=address;
        this.cart=cart;
    }
    public int getCustomerNumber(){
        return CustomerNumber;
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getGender(){
        return Gender;
    }
    public int getAge(){
        return age;
    }
    public Address getAddress(){
        return address;
    }
    public ShoppingCart getCart(){
        return cart;
    }
    public void setFirstName(String firstName){
        this.FirstName=firstName;
    }
    public void setLastName(String lastName){
        this.LastName=lastName;
    }
    public void setGender(String gender){
        this.Gender=gender;
    }
    public void setCustomerNumber(int newCustomerNumber){
        this.CustomerNumber=newCustomerNumber;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }
    public void setAddress(Address newAddress){
        this.address=newAddress;
    }
    public void setCart(ShoppingCart cart){
        this.cart=cart;
    }
    public String toString(){
        return "First Name: "+FirstName+"\nLastName: "+LastName
                +"\nGender: "+Gender+"\nAge: "+age+"\nAddress: "+address
                +"\nShopping Cart: "+cart+"\n";
    }
    public Customer clone(){
        try{
            Customer cust1=(Customer)super.clone();
            cust1.address=this.address.clone();
            cust1.cart=this.cart.clone();
            return cust1;
        }catch(CloneNotSupportedException ex){
            System.out.println("Cloning issues");
            return null;
        }
    }
    public int compareTo(Customer c){
        int result= Integer.compare(CustomerNumber,c.CustomerNumber);
        if(result==0) result=FirstName.compareToIgnoreCase(c.FirstName);
        if(result==0) result=LastName.compareToIgnoreCase(c.LastName);
        if(result==0) result=Gender.compareToIgnoreCase(c.Gender);
        if(result==0) result=Integer.compare(age,c.age);
        return result;
    }
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj instanceof Customer){
            Customer c=(Customer) obj;
            return CustomerNumber==c.CustomerNumber&&FirstName.equals(c.FirstName)&&LastName.equals(c.LastName);
        }
        return super.equals(obj);
    }

}
