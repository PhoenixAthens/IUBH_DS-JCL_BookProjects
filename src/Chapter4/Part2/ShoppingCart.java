package Unit_4_1.Part3;
import java.util.*;
public class ShoppingCart implements Cloneable{
    private Scanner scan=new Scanner(System.in);
    private static int counter=0;
    private int NumberOfProducts;
    private double calculateSum;
    private List<Products> collection;
    private boolean voucherHonored;
    public ShoppingCart(){
        this.NumberOfProducts=0;
        this.calculateSum=0;
        this.collection=new LinkedList<>();
        this.voucherHonored=false;
    }
    public boolean addProduct(){
        System.out.println("Enter product name: ");
        String ProductName=scan.nextLine();
        System.out.println("Enter product Price: ");
        double price=scan.nextDouble();
        Products product=Products.createNewProducts(ProductName,price);
        boolean success=collection.add(product);
        if(success){
            calculateSum+=price;
            return true;
        }
        System.out.println("Product was not added");
        return false;
    }
    public boolean addProduct(String productName,double priceOfProduct){
        Products product=Products.createNewProducts(productName,priceOfProduct);
        boolean success=collection.add(product);
        if(success){
            calculateSum+=priceOfProduct;
            return true;
        }
        System.out.println("Product was not added");
        return false;
    }
    public void addProduct(int index,String ProductName,double ProductPrice) {
        Products product = Products.createNewProducts(ProductName, ProductPrice);
        collection.add(index, product);
        calculateSum+=product.getProductPrice();
    }
    public void RemoveProduct(String ProductName){
        Iterator<Products> it=collection.iterator();
        while(it.hasNext()){
            Products p=it.next();
            if(p.getProductName().equals(ProductName)){
                it.remove();
                calculateSum-=p.getProductPrice();
            }
        }
        System.out.println("removed All Products with name: "+ProductName);
    }
    public void setProductInCart(int index,Products p){
        //manual
        try{
            collection.set(index,p);
            calculateSum+=p.getProductPrice();
        }catch(IndexOutOfBoundsException ex){
            throw new IndexOutOfBoundsException("Invalid index used");
        }
    }
    public void PrintCart(){
        //collection.sort(null);
        for(Products p:collection){
            System.out.println("At "+(collection.indexOf(p)+1)+", we have "+p.getProductName());
        }
    }
    public void setProductInCart(){
        //user interactive
        PrintCart();
        System.out.println("Enter the index you want to add Products at: ");
        int i=scan.nextInt();
        i-=1;
        double PriceOfPreviousProduct=collection.get(i).getProductPrice();
        calculateSum-=PriceOfPreviousProduct;
        scan.nextLine();
        System.out.println("Enter the product name: ");
        String nameOfProduct=scan.nextLine();
        System.out.println("Enter the product price: ");
        double price=scan.nextDouble();
        Products product=Products.createNewProducts(nameOfProduct,price);
        collection.set(i,product);
        calculateSum+=product.getProductPrice();
    }
    public void EmptyCart(){
        collection.clear();
    }
    public void CalculateSumOfProducts(){
        System.out.println("Total Price: "+calculateSum);
    }
    public void getTotalNumberOfProductsInCart(){
        PrintCart();
        System.out.println("Size: "+collection.size());
    }
    public boolean compareCarts(List<Products> cart){
        int total=cart.size();
        int count=0;
        for(int i=0;i<cart.size();i++){
            Products p1=this.collection.get(i);
            Products p2=cart.get(i);

            if(p1.equals(p2)){
                count++;

            }
        }
        if(count==total){
            return true;
        }else{
            System.out.println(count);
            return false;
        }
    }
        public LinkedList<Products> returnCart(){
        return (LinkedList<Products>) collection;
    }

    public static void main(String...args){
        ShoppingCart cart1=new ShoppingCart();
        ShoppingCart cart2=new ShoppingCart();
        ShoppingCart cart3=new ShoppingCart();
        ShoppingCart cart4=cart1;
        cart1.addProduct("Biscuits",2.34);
        cart1.addProduct("Chips",5.98);
        cart1.addProduct("Bananas",12.98);
        cart1.addProduct("Cheerios",4.32);
        cart1.addProduct(1,"Apples",23.22);
        //cart1.PrintCart();
        //cart1.CalculateSumOfProducts();
        //cart1.getTotalNumberOfProductsInCart();
        cart1.setProductInCart(2,new Products("coffee",20));
        //cart1.PrintCart();
        //System.out.println("Comparison:"+cart1.equals(cart4));
        //cart1.CalculateSumOfProducts();
        cart2.addProduct("Biscuits",2.34);
        cart2.addProduct("Chips",5.98);
        cart2.addProduct("Bananas",12.98);
        cart2.addProduct("Cheerios",4.32);
        cart2.addProduct(1,"Apples",23.22);
        cart2.setProductInCart(2,new Products("coffee",20));
        System.out.println("comparison imp: "+cart1.equals(cart2));
        System.out.println(cart1.compareCarts(cart2.collection));
        System.out.println(cart1.collection.equals(cart2.collection));
        System.out.println(cart1.collection.equals(cart3.collection));
        /* Unncecssary
        * public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj instanceof ShoppingCart) {
            ShoppingCart c1 = (ShoppingCart) obj;
            if (this.compareCarts(c1.returnCart())){
                return true;
            }
        }
        return super.equals(obj);
    }
*/




    }

}
