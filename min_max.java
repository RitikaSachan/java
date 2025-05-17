
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("give the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sr.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        
        System.out.println("min: "+min);
        System.out.println("max: "+max);
    }
}
