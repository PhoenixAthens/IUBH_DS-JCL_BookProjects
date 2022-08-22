package Unit_4_1;

public class ArrayTest {
    public static void main(String...args){
        int[][] array_2_D={{1,2,3,4,5,6},{23,44,99,89,12,43,56},{44,23,33,25,27,101,},{9,3,6,2,78,45,41}};
        for(int i=0;i<array_2_D.length;i++){
            for(int j=0;j<array_2_D[i].length;j++){
                System.out.println("At: "+i+","+j+": we have, "+array_2_D[i][j]);
            }
            System.out.println();
        }
    }
}
