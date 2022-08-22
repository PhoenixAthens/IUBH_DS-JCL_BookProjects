package Unit_4_1.Part7;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class OnlineShop {
    Queue<Order> Q=new ConcurrentLinkedQueue<>();
    public void addOrderToQueue(Order order){
        Q.offer(order);
    }
    public void removeOrder(Order order){
        Q.remove(order);
    }
    public void PrintOrderDetails(Order order){
        System.out.println("Customer details: ");
        System.out.println(order.getCustomer());
        System.out.println("===================");
        System.out.println("Time Stamp of order: "+order.getTimeStampOfOrder());
        System.out.println("===================");
        System.out.println("Shopping Cart details: ");
        System.out.println(order.getCartOfCustomer());
    }
    public static void main(String...args){
        OnlineShop shop=new OnlineShop();
        ShoppingCart cart1=new ShoppingCart();
        Book book1=new Book("It","Stephen King","Hodder",549);
        Book book2=new Book("Salem's Lot(Limited Edition)","Stephen King","New English Library",700);
        Book book3=new Book("The Bazaar of Bad Dreams","Stephen King","Hodder",345);
        cart1.addBooksToCart(book1,2);
        cart1.addBooksToCart(book2,5);
        cart1.addBooksToCart(book3,23);
        cart1.addBooksToCart(book1,5);
        System.out.println(cart1.SearchBookInCart(book1));
        Customer customer1=new Customer("John","Bell","Male","11-02-1982");
        customer1.setCart(cart1);
        Order order=new Order("8-10-2022",customer1);
        shop.addOrderToQueue(order);
        shop.PrintOrderDetails(order);
        shop.removeOrder(order);
    }
}
