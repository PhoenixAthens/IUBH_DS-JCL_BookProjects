package Unit_4_1.Part5;

import java.util.PropertyPermission;

public class ShoppingCart {
    private double ProductSum;
    private int NumberOfProducts;
    private boolean VoucherHonored;
    public ShoppingCart(){

    }
    public ShoppingCart(double ProductSum,int NumberOfProducts,boolean VoucherHonored){
        this.ProductSum=ProductSum;
        this.NumberOfProducts=NumberOfProducts;
        this.VoucherHonored=VoucherHonored;
    }
    public void setProductSum(int newSum){
        this.ProductSum=newSum;
    }
    public void setNumberOfProducts(int NumberOfProducts){
        this.NumberOfProducts=NumberOfProducts;
    }
    public void setVoucherHonored(){
        this.VoucherHonored=true;
    }
    public double getProductSum(){
        return ProductSum;
    }
    public int getNumberOfProducts(){
        return NumberOfProducts;
    }
    public boolean isVoucherHonored(){
        return VoucherHonored;
    }
    public String toString(){
        return "Number of Products: "+NumberOfProducts+"\nProduct Sum: "+ProductSum+"\nVoucherHonored: "+VoucherHonored+"\n";
    }
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj instanceof ShoppingCart){
            ShoppingCart cart=(ShoppingCart) obj;
            return (cart.ProductSum==ProductSum)&&(cart.NumberOfProducts==NumberOfProducts);
        }
        return super.equals(obj);
    }
    public int hashCode(){
        int Prime=31;
        int result=1;
        result=Prime*result+NumberOfProducts;
        result=Prime*result+Double.hashCode(ProductSum);
        result=Prime*result+(VoucherHonored?1231:1237);
        return result;
    }
    public ShoppingCart clone(){
        try{
            ShoppingCart cart=(ShoppingCart) super.clone();
            return cart;
        }catch(CloneNotSupportedException ex){
            System.out.println("Problems in clone() method");
            return null;
        }
    }
}
