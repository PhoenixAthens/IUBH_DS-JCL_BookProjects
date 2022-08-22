package Unit_4_1.Part7;
import java.util.*;
public class Non_FictionBook extends Book{
    private static final String CLASS_PREFIX="NF";
    private Scanner scan=new Scanner(System.in);
    private String Subject;
    private String Summary;
    public Non_FictionBook(){
        super();
        this.Subject=CLASS_PREFIX;
    }
    public Non_FictionBook(String name,String author,float price,String publisher,String subject){
        super(name,author,publisher,price);
        this.Subject=subject;
    }
    public Non_FictionBook(String name,String author,float price,String publisher){
        super(name,author,publisher,price);
        this.Subject=CLASS_PREFIX;
    }
    public String getSubject(){
        return this.Subject;
    }
    public void composeSummary(){
        System.out.println("Enter a few words describing the movie: like action,drama,romance etc.");
        Summary=scan.nextLine();
    }
    public String[] getSummary(){
        return Summary.split(",");
    }
    public void setSubject(String newSubject){
        this.Subject=newSubject;
    }
    public void updateSummary(){
        Summary+=","+scan.nextLine();
    }


}
