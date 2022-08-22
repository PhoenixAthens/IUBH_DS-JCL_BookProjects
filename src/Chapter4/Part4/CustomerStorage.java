package Unit_4_1.Part5;
import java.util.*;
public class CustomerStorage {
    private Map<Integer,Customer> collectCustomers;
    ICustomerStorageDB store=new DatabaseStorage();
    public CustomerStorage(){
        collectCustomers=new HashMap<>();
        Customer c1=new Customer("Phoenix","Athens",19);
        Customer c2=new Customer("Julia","Links",22);
        Customer c3=new Customer("Patrick","jenkins",20);
        Customer c4=new Customer("Linus","Trovaldo",40);
        collectCustomers.put(c1.getCustomerNumber(),c1);
        collectCustomers.put(c2.getCustomerNumber(),c2);
        collectCustomers.put(c3.getCustomerNumber(),c3);
        collectCustomers.put(c4.getCustomerNumber(),c4);
    }
    public void addCustomerToStorage(Customer c){
        collectCustomers.put(c.getCustomerNumber(),c);
        store.update(c);
    }
    public void removeCustomerFromDB(Customer c){
        Collection<Customer> valuesCollect=collectCustomers.values();
        valuesCollect.remove(c);
    }
    public void PrintAllCustomersFromStorage(){
        for(Map.Entry<Integer,Customer> m:collectCustomers.entrySet()){
            System.out.println(m);
        }
    }
    public Customer retrieveCustomer(Integer key){
        return store.retrieveCustomerFromDB(key);
    }
    public static void main(String...args){
        CustomerStorage cs=new CustomerStorage();
        cs.PrintAllCustomersFromStorage();
        cs.addCustomerToStorage(new Customer("Henderson","Jim",33));
        cs.addCustomerToStorage(new Customer("kendall","Stevens",20));
        cs.PrintAllCustomersFromStorage();
    }


}
