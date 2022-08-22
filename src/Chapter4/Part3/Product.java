package Unit_4_1.Part4;

public class Product implements Comparable<Product>,Cloneable{
    private String ProductName;
    private float ProductPrice;
    private int quantity;
    private final int ProductInventoryNumber;
    public Product(String ProductName){
        this.ProductName=ProductName;
        this.ProductInventoryNumber=ProductName.hashCode();
    }
    public static Product registerProduct(String ProductName){
        return new Product(ProductName);
    }
    public void setProductName(String productName){
        this.ProductName=productName;
    }
    public void setProductPrice(float productPrice){
        this.ProductPrice=productPrice;
    }
    public void updateQuantity(int HowManyMore){
        this.quantity+=HowManyMore;
    }
    public String getProductName(){
        return ProductName;
    }
    public float getProductPrice(){
        return ProductPrice;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getProductInventoryNumber(){
        return ProductInventoryNumber;
    }
    public String toString(){
        return "Name: "+ProductName+"\nProduct price: "+ProductPrice+"\nQuantity: "+quantity+"\n";
    }
    public int compareTo(Product product){
        int result=ProductName.compareTo(product.ProductName);
        return result!=0?result:Integer.compare(ProductInventoryNumber,product.ProductInventoryNumber);
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj instanceof Product){
            Product product=(Product)obj;
            return (ProductName.equals(product.ProductName))&&(ProductInventoryNumber==product.ProductInventoryNumber);
        }
        return super.equals(obj);
    }
    public int hashCode(){
        int Prime=31;
        int result=1;
        result=Prime*result+ProductName.hashCode();
        result=Prime*result+ProductInventoryNumber;
        result=Prime*result+quantity;
        return result;
    }
    public Product clone(){
        try{
            Product product=(Product)super.clone();
            return product;
        }catch(CloneNotSupportedException ex){
            System.out.println("Clone is not supported: "+ex.getMessage());
            return null;

        }
    }
}
