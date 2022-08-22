package Unit_4_1.Part4;
import java.util.*;
public class ShopAssortment {

    //this class will not handle order::
    private static Set<Product> AssortmentOfAvailableProducts=new HashSet<>();
    public boolean AddProductToAssortment(Product product){
        boolean ordered=AssortmentOfAvailableProducts.add(product);
        if(ordered){
            System.out.println("Order placed!");
            return true;
        }else return false;
    }
    public void RemoveFromAssortment(String productName){
        Iterator<Product> it=AssortmentOfAvailableProducts.iterator();
        while(it.hasNext()){
            Product prod=it.next();
            String ProductName=prod.getProductName();
            if(ProductName.equals(productName)){
                it.remove();
            }
        }
    }
    public boolean checkAvailability(Collection<Product> list){
        if(AssortmentOfAvailableProducts.containsAll(list)){
            System.out.println("All products are available");
            return true;
        }
        System.out.println("Missing Products: "+FindProductsMissingFromAssortment(list));
        return false;
    }
    public Collection<Product> FindProductsMissingFromAssortment(Collection<Product> listOfOrders){
        Set<Product> duplicateOfAssortment=new HashSet<>(AssortmentOfAvailableProducts);
        listOfOrders.removeAll(duplicateOfAssortment);
        return new LinkedList<Product>(listOfOrders);

    }
    public Collection<Product> availableProduct(Collection<Product> listOfOrders){
        listOfOrders.retainAll(AssortmentOfAvailableProducts);
        return new LinkedList<Product>(listOfOrders);
    }
    public boolean AddBunchOfProductsToAssortment(Collection<Product> list){
        boolean success=AssortmentOfAvailableProducts.addAll(list);
        if(success){
            PrintAssortment();
            return true;
        }else{
            return false;
        }

    }
    public void PrintAssortment(){
        int i=1;
        for(Product product:AssortmentOfAvailableProducts){
            System.out.println("At: "+i+" we have: "+product);
            i++;
        }
        String[] names=new String[]{"Hell","shark","Ahead"};
        /*for(String a:names){
            System.out.println(a);
        }*/
        byte[] bt=new byte[]{1,2,3,4,5,6};
        String str=new String(bt);
        System.out.println(str);
    }
}
