import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sr=new Scanner(System.in);
      System.out.println("find type of file: ");
      String website=sr.nextLine();
      switch(website){
              case ".com":
              System.out.println("commerical website");
              break;
               case ".in":
              System.out.println("india website");
              break;
               case ".edu":
              System.out.println("education website");
              break;
              default:
              System.out.println(" website not found");
      }
    }
}
