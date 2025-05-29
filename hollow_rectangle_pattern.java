// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void rectangle(int row, int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("* ");
                }
                else{
                 System.out.print("  ");
                }
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
         System.out.println("enter the value of row and column:");
         int a=sr.nextInt();
         int b=sr.nextInt();
         rectangle(a,b);
    }
}
