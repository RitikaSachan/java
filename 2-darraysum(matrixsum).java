// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int [][]arr=new int[2][3];
        int [][]arr1=new int[2][3];
         System.out.println("enter the values for 1st matrix: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
              arr[i][j]=sr.nextInt();
            }
        }
        System.out.println("enter the values for 2nd matrix: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
              arr1[i][j]=sr.nextInt();
            }
        }
        int [][]sum=new int[2][3];
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[0].length;j++){
              sum[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("sum of 2_d arrays: ");
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[0].length;j++){
             System.out.print(sum[i][j]+ " ");
        }
         System.out.println();
    }
}
}
