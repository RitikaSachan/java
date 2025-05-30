// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void repeat(int n) {
    if(n<1){
       return ; 
    }
      System.out.print(4);
      repeat(n-1);
    
    }
    public static void main(String[] args) {
      repeat(4);
    }
}
