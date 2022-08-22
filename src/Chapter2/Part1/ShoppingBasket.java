package Unit2_3;

import java.io.*;

public class ShoppingBasket {
    private int NumberOfProducts;
    private float ProductSum;
    private boolean VoucherHonored;
    public ShoppingBasket(int NumberOFProducts,float ProductSum){
        this.NumberOfProducts=NumberOFProducts;
        this.ProductSum=ProductSum;
        this.VoucherHonored=false;
    }
    public void SetVoucher(){
        this.VoucherHonored=true;
    }
    public boolean isVoucherHonored(){
        return VoucherHonored;
    }
    public int getNumberOfProducts(){
        return NumberOfProducts;
    }
    public float getProductSum(){
        return ProductSum;
    }
    public String toString(){
        return "NumberOfProducts: "+NumberOfProducts+"\nProductSum: "+ProductSum+"\nVoucher Honored: "+VoucherHonored;
    }
    public int hashCode(){
        final int Prime=31;
        int result=1;
        result=Prime*result+NumberOfProducts;
        int temp=Float.floatToIntBits(ProductSum);
        result=Prime*result+temp;
        result=Prime*result+(VoucherHonored?1231:1237);
        return result;

    }
    public static void main(String...args)throws FileNotFoundException {
        OutputStream outTo=new FileOutputStream("/users/anmolkhanna/Downloads/Cusomer.txt");
        PrintStream PrintTo=new PrintStream(outTo);
        System.setOut(PrintTo);
        ShoppingBasket basket01=new ShoppingBasket(23,34.98f);
        basket01.SetVoucher();
        ShoppingBasket basket02=new ShoppingBasket(10,100.98f);
        basket02.SetVoucher();
        ShoppingBasket basket03=new ShoppingBasket(5,2);
        System.out.println(basket01);
        System.out.println("Basket01: "+basket01.hashCode()+"\n");
        System.out.println(basket02);
        System.out.println("Basket02: "+basket02.hashCode()+"\n");
        System.out.println(basket03);
        System.out.println("Basket03: "+basket03.hashCode());


    }
}
