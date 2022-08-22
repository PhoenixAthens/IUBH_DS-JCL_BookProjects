package Unit6;
import java.io.*;
import java.text.*;
import java.util.*;
public class CodeSnippet06 {
    public static void main(String...args){
        String sep=File.separator;
        DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM);
        String basePath="Volumes"+sep+"Macintosh HD"+sep+"Volumes"+sep+"Macintosh HD"+sep
                +"Users"+sep+"anmolkhanna"+sep+"Downloads"+sep+"Testing Grounds";
        String fileName=df.format(new Date());
        String path=sep+"Volumes"+sep+"Macintosh HD"+sep+"Volumes"+sep+"Macintosh HD"+sep
                +"Users"+sep+"anmolkhanna"+sep+"Downloads"+sep+"Testing Grounds"+sep+fileName+".txt";
        try{
            File file=new File(path);
            if(file.exists()){

                FileReader reader=new FileReader(file);
                //BufferedReader buffReader=new BufferedReader(reader);

                String path34=basePath+sep+fileName+"old.txt";
                File file2=new File(path34);
                if(file2.exists()){
                    System.out.println("oo");
                }
                else{
                    FileWriter writ=new FileWriter(file2);
                    for(int j= reader.read();j!=-1;j=reader.read()){
                        writ.write(j);
                    }
                }

            }else{
                FileWriter writer=new FileWriter(file);
                BufferedWriter buffWriter=new BufferedWriter(writer);
                buffWriter.write("Hello World, Wassup!");
                buffWriter.close();
                writer.close();
            }
        }catch(IOException ex){
            System.out.println("Exception: "+ex.getClass().getSimpleName());
            ex.printStackTrace();
        }

    }
}
