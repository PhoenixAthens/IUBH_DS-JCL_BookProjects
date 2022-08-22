package Unit2_5;

public class Course implements Cloneable{
    private String Subject1;
    private String Subject2;
    private String subject3;
    public Course(String sub1,String sub2,String sub3){
        this.Subject1=sub1;
        this.Subject2=sub2;
        this.subject3=sub3;
    }
    public void setSubject1(String newSubject){
        this.Subject1=newSubject;
    }
    public void setSubject2(String newSubject){
        this.Subject2=newSubject;
    }
    public void setSubject3(String newSubject){
        this.subject3=newSubject;
    }
    public String getSubject1(){
        return Subject1;
    }
    public String getSubject2(){
        return Subject2;
    }
    public String getSubject3(){
        return subject3;
    }
    @Override
    public Course clone(){
        try{
            Course c=(Course)super.clone();
            return c;
        }catch(CloneNotSupportedException ex){
            System.out.println("Not Supported!");
            return null;
        }



    }
}
