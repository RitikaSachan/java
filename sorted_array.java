
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("give the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sr.nextInt();
        }
        char t='t';
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1!=arr[i+1]){
                t='f';
            }
        }
        if(t=='t'){
            System.out.println("array is sorted");
        }
        else{
             System.out.println("array is not sorted");
        }
    }
}
