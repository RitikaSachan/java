import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("give the n:");
        int a=sr.nextInt();
        int even=2;
        int sum =0;
        int i=1;
        while( i<=a){
            sum=sum+even;
            even=even+2;
            i++;
        }
           System.out.println("print the sum of n even number: "+sum);
    }
}
