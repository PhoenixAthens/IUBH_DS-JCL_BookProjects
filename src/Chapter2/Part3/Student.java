package Unit2_5;

import java.util.Scanner;

public class Student implements Comparable<Student>,Cloneable{
    private int StudentID;
    private String name;
    private String lastname;
    private String email;
    private int PhNum;
    private Course course;
    public Student(String name,String lastname,String email,int PhNum,Course course){
        this.StudentID=(int)Math.ceil(Math.random()*10000);
        this.name=name;
        this.lastname=lastname;
        this.email=email;
        this.PhNum=PhNum;
        this.course=course;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastname;
    }
    public String getEmail(){
        return email;
    }
    public void UpdateStudentID(int newID){
        this.StudentID=newID;
    }
    public void UpdateStudentEmail(String email){
        this.email=email;
    }
    public void UpdateStudentInFo(String name,String lastname){
        this.name=name;
        this.lastname=lastname;
    }
    public void PhNum(int newPhNum){
        this.PhNum=newPhNum;
    }
    public Course getCourse(){
        return course;
    }
    public String toString(){
        return "StudentID: "+StudentID+"\nName: "+name+"\nLastName: "+lastname+"\nEmail: "+email+"\nPhNum: "+PhNum+"\n"+
                "Course: "+course;

    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if(obj instanceof Student){
            Student s=(Student)obj;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter '1' for complete equality check / '2' for check on the basis of StudentID");
            boolean entry=sc.hasNextInt();
            if(entry) {
                boolean flag=true;
                while(flag){
                    int reply=sc.nextInt();
                    switch(reply){
                        case 1->{
                            flag=false;
                            return (s.StudentID==StudentID)&&(s.name.equals(name))&&(s.lastname.equals(s.lastname))&&(s.PhNum==s.PhNum);
                        }
                        case 2->{
                            flag=false;
                            return (s.StudentID==StudentID);
                        }
                        default->{
                            System.err.println("Invalid entry");
                            System.out.println("Try Again!");
                        }
                    }
                }
            }else{
                System.err.println("Invalid entry");
                return super.equals(obj);
            }

        }
        return super.equals(obj);
    }
    public int hashCode(){
        System.out.println("To generate Extreme Hash code enter 1/ To generate Simple HashCode enter 2");
        Scanner sc=new Scanner(System.in);
        boolean entry=sc.hasNextInt();
        if(entry){
            boolean flag=true;
            while(flag){
                int num=sc.nextInt();
                switch(num){
                    case 1->{
                        flag=false;
                        final int Prime=31;
                        int result=1;
                        result=Prime*result+StudentID;
                        result=Prime*result+name.hashCode();
                        result=Prime*result+lastname.hashCode();
                        result=Prime*result+email.hashCode();
                        result=Prime*result+PhNum;
                        result=Prime*result+course.getSubject1().hashCode();
                        result=Prime*result+course.getSubject2().hashCode();
                        result=Prime*result+course.getSubject3().hashCode();
                        return result;

                    }
                    case 2->{
                        final int Prime=31;
                        int result=1;
                        result=Prime*result+StudentID;
                        result=Prime*result+PhNum;
                        return result;
                    }
                }
            }
        }else{
            System.err.print("invalid entry");
        }

        return 0;
    }
    public int compareTo(Student stu){
        return Integer.compare(StudentID,stu.StudentID);
    }
    public Student clone(){
        //you have to clone very single reference data type
        // thus implement clone in course as well
        //as a result you will also obtain  a
        //clone of reference data type in object as well
        try{
            Student s2=(Student)super.clone();
            s2.course=this.course.clone();
            return s2;
        }catch(CloneNotSupportedException ex){
            System.out.println("NotSupported!");
            return null;
        }


    }
}
