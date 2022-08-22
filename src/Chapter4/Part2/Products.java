package Unit_4_1.Part3;

public class Products implements Comparable<Products>,Cloneable{
    private String productName;
    private double productPrice;
    private int ProductNumber;
    private Products(){

    }
    public Products(String productName,double productPrice){
        this.productName=productName;
        this.productPrice=productPrice;
        this.ProductNumber=(int)Math.ceil(Math.random()*100_000);
    }
    public static Products createNewProducts(String ProductName,double ProductPrice){
        return new Products(ProductName,ProductPrice);
    }
    public String getProductName(){
        return productName;
    }
    public double getProductPrice(){
        return productPrice;
    }
    public int getProductNumber(){
        return ProductNumber;
    }
    public void setProductName(String ProductName){
        this.productName=ProductName;
    }
    public void setProductPrice(double newPrice){
        this.productPrice=newPrice;
    }
    public String toString(){
        return "Product Name: "+productName+"\nProduct Price: "+productPrice+"\nProduct Number: "+ProductNumber;
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj instanceof Products){
            Products p=(Products) obj;
            return (productName.equals(p.productName))&&(productPrice==p.productPrice);
        }else{
            return super.equals(obj);
        }
    }
    public int compareTo(Products obj){
        int result=Integer.compare(ProductNumber,obj.ProductNumber);
        return result!=0?result:productName.compareTo(productName);
    }
    public int hashCode(){
        int Prime=31;
        int result=1;
        result=Prime*result+(productName.hashCode());
        result=Prime*result+Double.hashCode(productPrice);
        result=Prime*result+ProductNumber;
        return result;
    }
    public Products clone(){
        try{
            Products p=(Products) super.clone();
            return p;
        }catch(CloneNotSupportedException ex){
            System.out.println("OOPSIE DAISY!");
            return null;
        }
    }
}
