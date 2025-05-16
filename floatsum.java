
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        float []arr=new float[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sr.nextFloat();
        }
        float sum=0;
        for(int i=0;i<arr.length;i++){
            
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
