// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("give the a:");
        int a=sr.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
         System.out.println("fact of "+ a+":"+ fact);
    }
}
