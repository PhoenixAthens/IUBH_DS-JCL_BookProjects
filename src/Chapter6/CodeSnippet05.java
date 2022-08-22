package Unit6;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CodeSnippet05 {
    private String sep=File.separator;
    private String basePath=sep+"Volumes"+sep+"Macintosh HD"+sep+"Volumes"+sep+"Macintosh HD"+sep+"Users"+sep+"anmolkhanna"+sep+"Downloads";

    private String TempWorkingDirectoryPath=basePath;
    //We create a directory, inside that directory create tow folders
    //we create a file, use it to write and then once we have copies, we create a copy of old file and save it in the second
    //folder, write the new content in old file,
    //then we create a directory in public folder in which will go the file in encrypted form, when ever read the files will be
    //read  from user using inflater
    public File DirectoryCreator(String enterNameOfRootDirectory,String subFolder1,String subFolder2){
        String requiredName=basePath+sep+enterNameOfRootDirectory;
        File file=new File(requiredName);
        if(!file.exists()){
            file.mkdirs();
            CreateSubFolders(requiredName,subFolder1,subFolder2);
            TempWorkingDirectoryPath=requiredName;
            return file;
        }

        CreateSubFolders(requiredName,subFolder1,subFolder2);
        TempWorkingDirectoryPath=requiredName;
        return file;
    }
    private void CreateSubFolders(String requiredPath, String subFolder1, String subFolder2){
        String path1=requiredPath+sep+subFolder1;
        File f1=new File(path1);
        String path2=requiredPath+sep+subFolder2;
        File f2=new File(path2);
        if(!f1.exists()){
            f1.mkdirs();
        }
        if(!f2.exists()){
            f2.mkdirs();
        }
        File f3=new File(requiredPath+sep+"bin");
        f3.mkdirs();
    }
    public boolean CreateFile(String fileName,String folderAbsolutePath){
        File file=new File(folderAbsolutePath+sep+fileName);
        if(file.exists()){
            String path=TempWorkingDirectoryPath+sep+"bin"+sep+fileName;
            File file2=new File(path);
            boolean success=file.renameTo(file2);
            return success;
        }else{
            try{
                boolean suck=file.createNewFile();
                return suck;
            }catch(IOException ex){
                System.out.println("Exception: "+ex.getClass().getSimpleName());
                ex.printStackTrace();
                return false;
            }
        }
    }
    public static void main(String...args){
        CodeSnippet05 cs=new CodeSnippet05();
        cs.DirectoryCreator("junky","f10","f20");
        cs.CreateFile("work.txt",cs.basePath+cs.sep+"junky");
        String PrePath=cs.basePath+cs.sep+"junky"+cs.sep+"f10"+cs.sep;
        String path=cs.basePath+cs.sep+"junky"+cs.sep+"f10"+cs.sep+".txt";
        String[] Sentences=new String[]{"Some words are not meant to be spoken",
                "Some weapons not meant to be drawn",
                "Some wars not meant to be fought","Some people not meant to be messes up with!"
                ,"Hence began the story of the one hand god"};

        File file=new File(path);
        if(file.exists()){
            String path2=file.getAbsolutePath();


        }
        try{
            FileWriter fw=new FileWriter(file);
            BufferedWriter bw=new BufferedWriter(fw);
            for(String s:Sentences){
                bw.write(s+"\n");
            }
            bw.close();
            fw.close();
        }catch(Exception ex){
            System.out.println("Exception: "+ex.getClass().getSimpleName());
            System.out.println("Message: "+ex.getMessage());
        }
    }
}
