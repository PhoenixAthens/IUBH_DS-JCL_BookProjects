package Unit_4_1.Part7;

public class Order {
    private String timeStamp;
    private Customer customer;
    private ShoppingCart cartOfCustomer;
    public Order(String timeStamp,Customer customer){
        this.timeStamp=timeStamp;
        this.customer=customer;
        this.cartOfCustomer=customer.getShoppingCart();
    }
    public String getTimeStampOfOrder(){
        return timeStamp;
    }
    public Customer getCustomer(){
        return customer;
    }
    public ShoppingCart getCartOfCustomer(){
        return cartOfCustomer;
    }
    public void setTimeStamp(String updatedTimeStamp){
        this.timeStamp=updatedTimeStamp;
    }
    public void setCustomer(Customer customer){
        this.customer=customer;
    }
    public void setCartOfCustomer(ShoppingCart cart){
        this.cartOfCustomer=cart;
    }


}
