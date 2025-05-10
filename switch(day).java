import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sr=new Scanner(System.in);
       System.out.print("enter the day: ");
       int day=sr.nextInt();
       switch(day){
               case 1:
               System.out.println("Monday");
               break;
                case 2:
               System.out.println("tuesday");
               break;
                case 3:
               System.out.println("wednesday");
               break;
                case 4:
               System.out.println("thursday");
               break;
                case 5:
               System.out.println("friday");
               break;
                case 6:
               System.out.println("saturday");
               break;
                case 7:
               System.out.println("sunday");
               break;
               default:
               System.out.println("not included/error");
       }
    }
}
