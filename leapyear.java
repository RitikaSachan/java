import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sr=new Scanner(System.in);
      System.out.println("enter year: ");
      int year=sr.nextInt();
      if(year%4==0){
          System.out.println("leap year");
      }
      else{
          System.out.println("not a leap year");
      }
       
    }
}
