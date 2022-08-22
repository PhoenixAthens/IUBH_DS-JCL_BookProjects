package Unit6;
import java.io.*;
public class CodeSnip_3_01 {
    public static void main(String...args){
        String sep=File.separator;
        String BasePath=sep+"Volumes"+sep+"Macintosh HD"+sep+"Volumes"+sep+"Macintosh HD"+sep+"Users"+sep+"anmolkhanna"+sep+"Downloads";
        String FromPath=BasePath+sep+"Playground"+sep+"Eden"+sep+"Error.txt";
        String ToPath=BasePath+sep+"Playground"+sep+"Edana"+sep+"Error.txt";//just like in mkdirs you have
        File file1=new File(FromPath);//to specify in path the folder to be created, here as well, the path already has
        File file2=new File(ToPath);//the file name that is later moved to the path
        boolean r=file1.renameTo(file2);
        if(r) System.out.println("File moved from "+file1.getName()+" to "+file2.getName());
        else System.out.println("No comprendo!");
        System.out.println("Path of file2: "+file2.getAbsolutePath());
        System.out.println("Path of file1: "+file1.getAbsolutePath());
    }
}
