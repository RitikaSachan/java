
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=sr.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                 System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                 System.out.print("*");
            }
            System.out.println();
            }
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                 System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                 System.out.print("*");
            }
            System.out.println();
            }
            
                
           
    }
}
