//Main.java
import java.util.Scanner;
public class Main {
public static void main(String []args){
//fill your code here
 Scanner s=new Scanner(System.in);
 System.out.println("Address 1:");
 String a=s.nextLine();
 System.out.println("Address 2:");
 String b=s.nextLine();

 if (a.equalsIgnoreCase(b))
 {
 if (a.equals(b))
 System.out.println("RED");
 else
 System.out.println("BLUE");
 }
 else if (a.replace(" ", "").equals(b.replace(" ", "")))
 System.out.println("YELLOW");
 else
 System.out.println("GREEN");
}
}
