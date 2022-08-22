package Unit6;
import java.io.*;
import java.util.Arrays;

public class CodeSnip01 {
    public static void main(String...args){
        String sep=File.separator;
        /*File file=new File(sep+"Volumes");
        System.out.println(Arrays.toString(file.listFiles()));
        File[] sub=file.listFiles();
        for(File f1:sub){
            System.out.println("\tInside: " +Arrays.toString(f1.listFiles()));
            for(File f2:f1.listFiles()){
                System.out.println("\t\tIn2: "+Arrays.toString(f2.listFiles()));
            }
        }*/
        String path=sep+"Volumes"+sep+"Macintosh HD"+sep+"Volumes"+sep+"Macintosh HD"+sep+"Users"+sep+"anmolkhanna"+sep+"Downloads"+sep+"Java Savings";
        File file1=new File(path);
        for(File in:file1.listFiles()){//list files give path to each file in the directory
            System.out.println("FoundYa: "+in);
            System.out.println("Path : "+in.getPath());
            if(in.isFile()){
                System.out.println("This is a file!");
            }if(in.isDirectory()){
                System.out.println("This is a directory!");
            }if(in.isHidden()){
                System.out.println("This was empty before!");
            }if(in.canExecute()){
                System.out.println("This can execute");
            }if(in.canRead()){
                System.out.println("Readable");
            }if(in.canWrite()){
                System.out.println("WriteAble");
            }
            try{
                if(in.createNewFile()){
                    System.out.println("A new folder was created");
                }else{
                    System.out.println("it wasn't created!");
                }
            }catch(IOException ex){
                System.out.println("Exception named: "+ex.getClass().getSimpleName()+" occured!");
                System.out.println("Message: "+ex.getMessage());
            }

        }
        System.out.println(Arrays.toString(File.listRoots()));//the USB-Drive doesn't show here
        /*File file2=new File(sep+"Volumes"+sep+"Macintosh HD"+sep+"Volumes"+sep+"Macintosh HD"+sep+"Users");
        for(File in:file2)
*/        /*File[] f1=File.listRoots();
        for(File s1:f1){
            System.out.println("\t"+s1);
            File[] f2=s1.listFiles();
            for(File s2:f2){
                System.out.println("\t\t"+s2);
                File[] f3=s2.listFiles();
                for(File s3:f3){
                    System.out.println("\t\t\t"+s3);
                    File[] f4=s3.listFiles();
                    for(File s4:f4){
                        System.out.println("\t\t\t\t"+s4);
                    }
                }
            }
        }
*/

    }
}
