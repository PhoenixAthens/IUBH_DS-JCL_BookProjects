package Unit_4_1.Part7;

public class Book {
    private String name;
    private String author;
    private float price;
    //private int stock;
    private String publisher;
    public Book(){}
    public Book(String name,String Author,String Publisher,float price){
        this.name=name;
        this.author=Author;
        this.price=price;
        this.publisher=Publisher;
        //this.stock=stock;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public void setAuthor(String newAuthor){
        this.author=newAuthor;
    }
    public void setPrice(float newPrice){
        this.price=newPrice;
    }
    /*public void setStock(int newStock){
        this.stock=newStock;
    }*/
    public void setPublisher(String newPublisher){
        this.publisher=newPublisher;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
    /*public int getStock(){
        return stock;
    }*/
    public float getPrice(){
        return price;
    }
    public String toString(){
        return "NameOfBook: "+name+", Author: "+author+", Price: "+price+", Publisher:  "+publisher+"\n";
    }
}
