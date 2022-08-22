package Unit_4_1.Part7;
import java.util.*;
public class ShoppingCart {
    private int numberOfProducts;
    private float calculateSum;
    private boolean voucherHonored;
    private List<Book> itemsInCart;
    public ShoppingCart(){
        this.numberOfProducts=0;
        this.calculateSum=0;
        this.voucherHonored=false;
        this.itemsInCart=new LinkedList<>();
    }
    private void addToProductSum(float amount){
        this.calculateSum+=amount;
    }
    private void subFromProductSum(float amount){
        this.calculateSum-=amount;
    }
    private void updateNumberOfProducts(int numberOFProducts){
        this.numberOfProducts+=numberOFProducts;
    }
    private void decreaseNumberOfProducts(int numberOfProducts){
        this.numberOfProducts-=numberOfProducts;
    }
    public void addBooksToCart(Book book,int NumberOfBooks){
        boolean r1=SearchBookInCart(book);
        if(r1){
            System.out.println("Book: "+book.getName()+" added successfully!");
            addToProductSum(book.getPrice());
            updateNumberOfProducts(NumberOfBooks);
        }else{
            boolean result=itemsInCart.add(book);
            if(result){
                System.out.println("Book: "+book.getName()+" added successfully!");
                addToProductSum(book.getPrice()*NumberOfBooks);
                updateNumberOfProducts(NumberOfBooks);
            }else{
                System.out.println("Book not added!");
            }
        }

    }
    //book already in cart so SearchBook method
    //another method to reduce quantity of Certain Book;
    public void removeBookFromCart(Book book){
        boolean result=itemsInCart.remove(book);
        if(result){
            System.out.println("Book: "+book.getName()+" removed successfully!");
            subFromProductSum(book.getPrice());
            decreaseNumberOfProducts(1);
        }else
            System.out.println("Book not removed!");
    }
    public boolean SearchBookInCart(Book book){
        String nameOfBook=book.getName();
        String authorOfBook=book.getAuthor();
        for(Book b:itemsInCart){
            if(b.getName().equalsIgnoreCase(nameOfBook)&&b.getAuthor().equalsIgnoreCase(authorOfBook)){
                //System.out.println("Book already in cart!");
                return true;
            }
        }
        return false;
    }
    public void getTotalSum(){
        System.out.println("Total Sum: "+calculateSum);
    }
    public void getNumberOfProducts(){
        System.out.println("Total Products: "+numberOfProducts);
    }
    public void applyVoucher(int voucherDiscount ){
        float discountPrice=(voucherDiscount*calculateSum)/100;
        calculateSum-=discountPrice;
        voucherHonored=true;
    }
    public String toString(){
        return "Products: "+itemsInCart+"\nNumber of products: "+numberOfProducts+
                "\nTotal Sum: "+calculateSum+"\nVoucher Honored: "+voucherHonored+"\n";
    }

}
