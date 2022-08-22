package Unit6;
import java.io.*;
import java.util.Date;
public class CodeSnip03 {
    public static void main(String...args){
        String sep=File.separator;
        String path=sep+"Volumes"+sep+"Macintosh HD"+sep+"Volumes"+sep+"Macintosh HD"+sep+"Users"+sep+"anmolkhanna"+sep+"Downloads";
        File file=new File(path);
        File[] collection=file.listFiles();
        System.out.println("The Sub-Directories of "+file.getName()+" are as follows: ");
        for(File f:collection){
            System.out.println(f.getName());
        }
        System.out.println("isDirectory(): "+file.isDirectory());
        System.out.println("isFile(): "+file.isFile());
        System.out.println("Size of directory: "+file.length());
        System.out.println("Date of lastModification: "+new Date(file.lastModified()));
        System.out.println("\n++++++++++++++++++++++++++++++BREAK++++++++++++++++++++++++++++++++++++++++++\n");
        String newDirectory="PlayGround";
        String newSubDirectory="Eden";
        String updatedPath=path+sep+newDirectory+sep+newSubDirectory;
        File file1=new File(updatedPath);
        if(file1.exists()){
            System.out.println("We created the directories with mkdirs already");
        }else{
            boolean success=file1.mkdirs();
            if(success) System.out.println("New directory created!");
        }
        System.out.println("\n++++++++++++++++++++++++++++++BREAK++++++++++++++++++++++++++++++++++++++++++\n");
        String fileName="Error.txt";
        String path2=updatedPath+sep+fileName;
        File file2=new File(path2);
        if(file2.exists()){
            System.out.println("File already exists!");
        }else{

            try{
                boolean result=file2.createNewFile();
                if(result) System.out.println("File named, "+file2.getName()+" created");
            }catch(IOException ex){
                System.out.println("Exception : "+ex.getClass().getSimpleName());
                System.out.println("Error Message: "+ex.getMessage());
            }
        }
        System.out.println("\n++++++++++++++++++++++++++++++BREAK++++++++++++++++++++++++++++++++++++++++++\n");
        //if you try to create a file or directory that already exists, there is no overwriting, rather, we just we just keep the old files
        String folderTwo="Edana";
        String path3=path+sep+newDirectory+sep+folderTwo;
        File file3=new File(path3);
        if(file3.exists()){
            System.out.println("File already there !");
        }else{
            boolean success=file3.mkdirs();//always use mkdirs(), just mkdir() causes problems
            if(success) System.out.println("Directory named "+file3.getName()+" created!");
        }
        /*String pathToTransferTo=path3;
        File file4=new File(pathToTransferTo);
        File file5=new File(path+sep+"Playground"+sep+"Eden"+sep);
        boolean result2=file5.renameTo(file4);
        if(result2) System.out.println("New file path is: "+file4.getPath());

        */

    }
}
