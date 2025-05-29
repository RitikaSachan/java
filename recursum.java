import java.util.*;
class Main {
     public static int recursum(int num){
         if(num<=1){
             return num;
         }
         return num+recursum(num-1);
     }
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=sr.nextInt();
        int ans=recursum(n);
        System.out.println("sum: "+ ans);
    }
}
