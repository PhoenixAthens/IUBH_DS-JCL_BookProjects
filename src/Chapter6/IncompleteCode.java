package Unit6;
import java.util.*;
import java.io.*;
import java.text.*;
public class CodeSnipped07 {
    private int RandomNumber=1;
    public File fileContentDuplicator(File oldFile){
        String path=oldFile.getAbsolutePath();
        String oldFileName=oldFile.getName();
        String name=oldFileName.substring(0,oldFileName.indexOf(".txt"));
        name+="_"+RandomNumber+".txt";
        RandomNumber+=1;
        String pout=path.substring(0,path.lastIndexOf("/"));
        pout+="/"+name;
        File file=new File(pout);
        try{
            FileWriter f=new FileWriter(file);
            f.close();
            return file;
        }catch(IOException ex){
            System.out.println("Exception: "+ex.getClass().getSimpleName());
            ex.printStackTrace();
            return null;
        }

    }
    public static void main(String...args){
        System.out.println("\t\t:Options:");
        //Scanner scan=new sca
    }
}
