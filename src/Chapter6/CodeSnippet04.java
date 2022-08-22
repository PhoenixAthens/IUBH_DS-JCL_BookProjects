package Unit6;
import java.io.*;
public class CodeSnipped04 {
    public static void main(String...args){
        String sep=File.separator;
        String path=sep+"Volumes"+sep+"Macintosh HD"+sep+"Volumes"+sep+"Macintosh HD"+sep+"Users"+sep+"anmolkhanna"+sep+"Downloads"+sep+"Random.txt";
        File file=new File(path);
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch(IOException io){
                System.out.println("Exception: "+io.getClass().getSimpleName());
                io.printStackTrace();
            }
        }
        String[] names=new String[]{"Drake","Khalid","Bieber","Levine","Sinatra","Juice"};
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("What's up mate?");
            bufferedWriter.write("\n Hotwings, flingClicks");
            for(String s:names){
                bufferedWriter.write("\n"+s);
            }
            System.out.println("WorkDone!");
            bufferedWriter.close();
            fileWriter.close();

        } catch(Exception ex){
            System.out.println("Exception: "+ex.getClass().getSimpleName());
            ex.printStackTrace();
        }
    }
}
