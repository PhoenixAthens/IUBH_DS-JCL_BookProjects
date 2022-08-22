package Unit_4_1.Part5;

public interface ICustomerStorageDB {
    void storeCustomerToDB(Customer c);
    Customer retrieveCustomerFromDB(Integer key);
    void update(Customer c);
}
