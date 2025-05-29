
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=sr.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
             for(int k=1;k<=n;k++){
                System.out.print("* ");
                }
             System.out.println();
        }
    }
}

