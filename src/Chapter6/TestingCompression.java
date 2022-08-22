package Unit6;

import java.io.File;
import java.io.*;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class TestingCompression {
    public static void main(String...args){
        String sep= File.separator;
        String basePath=sep+"Volumes"+sep+"Macintosh HD"+sep+"Volumes"+sep+"Macintosh HD"+sep+"Users"+sep+"anmolkhanna"+sep+"Downloads";
        String compressTo="compress.txt";
        String decompressTo="deCompress.txt";
        String path1=basePath+sep+"Junky"+sep+compressTo;
        String path2=basePath+sep+"Junky"+sep+decompressTo;
        compressFile(path1);
        DecompressFile(path1,path2);
    }
    public static void compressFile(String path){
      try{
          File file=new File(path);
          BufferedWriter buff=new BufferedWriter(new OutputStreamWriter(new DeflaterOutputStream(new FileOutputStream(file))));
          String[] Sentences=new String[]{"Some words are not meant to be spoken",
                  "Some weapons not meant to be drawn",
                  "Some wars not meant to be fought","Some people not meant to be messes up with!"
                  ,"Hence began the story of the one hand god"};
          for(String s:Sentences){
              buff.write(s+"\n");
          }
          buff.close();
      }catch(FileNotFoundException gx){
          System.out.println("Exception: "+gx.getClass().getSimpleName());
          gx.printStackTrace();
      }catch(IOException px){
          System.out.println("Exception: "+px.getClass().getSimpleName());
          px.printStackTrace();
      }catch(Exception ex) {
          System.out.println("Exception: " + ex.getClass().getSimpleName());
          ex.printStackTrace();
      }
    }
    public static void DecompressFile(String from,String to){
        try{
            File file=new File(from);
            BufferedReader buff=new BufferedReader(
                    new InputStreamReader(
                            new InflaterInputStream(
                                    new FileInputStream(file))));

            File file2=new File(to);
            FileWriter fileWriter=new FileWriter(file2);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for(String line=buff.readLine();line!=null;line=buff.readLine()){
                bufferedWriter.write(line+"\n");
            }
            buff.close();
            bufferedWriter.close();
            fileWriter.close();

        }catch(FileNotFoundException fx){
            System.out.println("Exception: "+fx.getClass().getSimpleName());
            fx.printStackTrace();
        }catch(IOException ex){
            System.out.println("Exception: "+ex.getClass().getSimpleName());
            ex.printStackTrace();
        }
    }


}
