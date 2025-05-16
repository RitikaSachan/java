import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int []arr=new int[10];
         System.out.println("enter the marks of physics for 10 students: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sr.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            // arr[i]=sr.nextFloat();
            sum=sum+arr[i];
        }
        System.out.println("sum: "+ sum);
        int avg=sum/arr.length;
        System.out.println("avg: "+ avg);
    }
}
