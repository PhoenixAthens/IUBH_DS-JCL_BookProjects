package Unit_4_1.Part2;
import java.util.*;
public class CustomerAdministration {
    private Scanner scan=new Scanner(System.in);
    private Collection<Customer> collectCustomers;
    public CustomerAdministration(){
        this.collectCustomers=new ArrayList<>();
    }
    public void removeInvalidEntries(){
        Iterator<Customer> it=collectCustomers.iterator();
        Customer k=null;
        while(it.hasNext()){
            k=it.next();
            if(k.getGender()==null||k.getGender().equals(" ")){
                it.remove();
            }

        }
    }
    public void PrintCustomers(){
        for(Customer c:collectCustomers){
            System.out.println(c);
        }
    }
    public void AddCustomers(){
        System.out.println("Enter customer name: ");
        String nameOfCustomer=scan.nextLine();
        System.out.println("Enter Customer's last name: ");
        String lastNameOfCustomer=scan.nextLine();
        Customer cust=new Customer(nameOfCustomer,lastNameOfCustomer);
        System.out.println("Enter customer gender: ");
        String gender=scan.nextLine();
        if(gender.equalsIgnoreCase("null")){
            cust.setGender(null);
        }else{
            cust.setGender(gender);
        }
        boolean bool=collectCustomers.add(cust);
        if(bool){
            System.out.println("Customer Added Successfully!");
        }else{
            System.out.println("Customer not added!");
        }
    }
    public void loopToAddCustomers(){
        boolean flag=true;
        while(flag){
            AddCustomers();
            System.out.println("Hit 5 to exit: ");
                int num=scan.nextInt();
                scan.nextLine();
                if(num==5) flag=false;
                else System.out.println("Here we go again!");

        }
    }
    public static void main(String...args){
        CustomerAdministration admin=new CustomerAdministration();
        admin.loopToAddCustomers();
        admin.PrintCustomers();
        admin.removeInvalidEntries();
        admin.PrintCustomers();

    }

}
