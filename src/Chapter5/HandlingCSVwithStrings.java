package Unit_5;

import java.util.Arrays;

public class HandlingCSVwithStrings {
    public static void main(String...args){
        String fromFile="'2021','Level 1','99999','All industries','Dollars (millions)','H01','Total income','Financial performance','757,504','ANZSIC06 divisions A-S (excluding classes K6330, L6711, O7552, O760, O771, O772, S9540, S9601, S9602, and S9603)'";
        String main=fromFile.substring(fromFile.indexOf('\'')+1,fromFile.lastIndexOf('\''));
        System.out.println(main);
        String[] arrayFromData=main.split("\',\'");
        arrayFromData[8]="$"+arrayFromData[8].replace(",",".");
        System.out.println(Arrays.toString(arrayFromData));
        for(String s:arrayFromData){
            System.out.println(s);
        }

    }


}
