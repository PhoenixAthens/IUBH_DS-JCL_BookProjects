package Unit_4_1.Part5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DatabaseStorage implements ICustomerStorageDB {
    private Map<Integer,Customer> listOfCustomers=new HashMap<>();
    @Override
    public void update(Customer c){
        listOfCustomers.put(c.getCustomerNumber(),c);
    }
    @Override
    public void storeCustomerToDB(Customer c){
        update(c);
    }
    @Override
    public Customer retrieveCustomerFromDB(Integer key){
        return listOfCustomers.get(key);
    }
}
