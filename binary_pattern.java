
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=sr.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"); 
                }
                else{
                System.out.print("0");
                }
            }
             System.out.println();
        }
    }
}



