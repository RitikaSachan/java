import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sr=new Scanner(System.in);
       System.out.print("enter the marks of 3 subjects:");
       int hindi= sr.nextInt();
       int english= sr.nextInt();
       int math= sr.nextInt();
       int total=hindi+english+math;
     
       if(hindi>=33 &&english>=33 && math>=33 ){
           if(((total/3))>=40){
           System.out.print("pass");
           }
           else{
                System.out.print("fail");
           }
       }
       else{
        System.out.print("fail");
       }
    }
}
