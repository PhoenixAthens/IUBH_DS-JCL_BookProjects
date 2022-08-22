package Unit6;
import java.io.*;
import java.util.Arrays;

public class CodeSnip02 {
    public static void main(String...args){
        System.out.println("++++++++++++++++++++++++++++++++Just listing files in a directory++++++++++++++++++++++++++++++++");
        String sep=File.separator;
        String path=sep+"Volumes"+sep+"Macintosh HD"+sep+"Volumes"+sep+"Macintosh HD"+sep+"Users"+sep+"anmolkhanna"+sep+"Downloads";
        File file=new File(path);
        for(File files:file.listFiles()){
            System.out.println(files.getName());
        }
        System.out.println("\n++++++++++++++++++++++++++++++++Creating a directory and a subDirectory++++++++++++++++++++++++++++++++\n");

        String NameOfNewFolder="Playground";
        String NameOfSubFolder="playing";
        String newPath=path+sep+NameOfNewFolder+sep+NameOfSubFolder;
        File file1=new File(newPath);
        System.out.println(file1.exists());
        file1.mkdirs();
        System.out.println(file1.exists());
        System.out.println("\n++++++++++++++++++++++++++++++++Creating textFile in Directory++++++++++++++++++++++++++++++++\n");
        String fileName="Work.txt";
        newPath+=sep+fileName;
        File file2=new File(newPath);
        if(file2.exists()){
            System.out.println("It is already there!");
        }else{
            try{
                file2.createNewFile();
                System.out.println("Path to Work.txt: "+file2.getPath());
                System.out.println(file2.getAbsolutePath());
            }catch(IOException ex){
                System.out.println("Exception: "+ex.getClass().getSimpleName());
                System.out.println("Error Message: "+ex.getMessage());
            }
        }
        System.out.println("\n++++++++++++++++++++++++++++++++Next we move files++++++++++++++++++++++++++++++++\n");
        //String sep=File.separator;
        ///String path=sep+"Volumes"+sep+"Macintosh HD"+sep+"Volumes"+sep+"Macintosh HD"+sep+"Users"+sep+"anmolkhanna"+sep+"Downloads";
        String extend=path+sep+"Playground"+sep+"playing"+sep;
        file2=new File(extend);
        System.out.println(Arrays.toString(file2.listFiles()));
        String newDir="Playground2";
        String SubNewDir="RussianDoll";
        String SubSubNewDir="Dumplings";
        String SubSubSubNewDir="Fumes";
        String path2=path+sep+newDir+sep+SubNewDir+sep+SubSubNewDir+SubSubSubNewDir;
        File frack=new File(path2);
        boolean success=frack.mkdirs();
        System.out.println(success);
        boolean suc=file2.renameTo(frack);
        System.out.println(suc);
        File file3=new File(path2+sep+"Work.txt");
        System.out.println(file3.getPath());
        System.out.println(file3.getAbsolutePath());

    }
}
