package Unit_4_1.Part6;
import java.util.*;
public class UndoClass {
    private History history=new History();
    private String[] events=new String[]{"show order overview","Select address",
            "Select payment method","confirm payment","PlaceOrder","Check order status"};
    public static void main(String...args){
        UndoClass eve=new UndoClass();
        eve.orderProcess();
    }
    public void orderProcess(){
        Scanner sc=new Scanner(System.in);
        int index=0;
        boolean flag=true;
        while(flag){
            System.out.println("enter 0 to go forward, 1 to go back and 2 to abort the process!");
            System.out.println("We are currently at: "+events[index]);
            if(sc.hasNextInt()){
                int i=sc.nextInt();
                switch(i){

                    case 0->{
                        if(index==(events.length-1)){
                            System.out.println("The ordering process is complete, thanks for visiting: ");
                            return;
                        }
                        history.addEvent(events[index]);
                        index++;
                        System.out.println("Currently at: "+events[index]);

                    }
                    case 1->{
                        String back=history.goBack();
                        if(back!=null){
                            index--;
                            System.out.println("we are now at: "+back);
                        }else{
                            System.out.println(events[index]+" is the first step!");
                        }
                    }case 2->{
                        System.out.println("Thanks for visiting!");
                        flag=false;
                    }
                }
            }
        }
    }
}
