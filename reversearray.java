import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int []arr=new int [5];
        System.out.println("give the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sr.nextInt();
        }
        System.out.println("Reverse array: ");
        for(int i=arr.length-1;i>=0;i--){
             System.out.print(" "+arr[i]);
        }
        
    }
}
