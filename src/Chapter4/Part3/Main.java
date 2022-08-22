package Unit_4_1.Part4;
import java.util.*;
public class Main {
    public static void main(String...args){
        ShopAssortment shop=new ShopAssortment();
        List<Product> iWant=new LinkedList<>();
        Product p1=new Product("Biscuits");
        Product p2=new Product("Chips");
        Product p3=new Product("Onions");
        Product p4=new Product("Apples");
        Product p5=new Product("Soap");
        Product p6=new Product("Silk scarf");
        shop.AddProductToAssortment(p1);
        shop.AddProductToAssortment(p2);
        shop.AddProductToAssortment(p3);
        shop.AddProductToAssortment(p4);
        shop.AddProductToAssortment(p5);
        iWant.add(p1);
        iWant.add(p2);
        iWant.add(p6);
        shop.PrintAssortment();
        shop.checkAvailability(iWant);
    }
    //this code is ridiculously bad because it wants precise details for ordering and that's not how things work
    //to improve it use methods that ask for single products, like is the product with enterd name in the list
    //or method that takes the inputted items makes a list out of it and then returns whether the order is available or not
    //retainsAll removeAll will not work on large scale
    //if you want to make use of removeAll and retain All leave out the price and quantity as static variables!, that's the only way things work here!

}
