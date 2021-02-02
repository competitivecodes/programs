//Main.java
import java.util.Scanner;
class Main {
 public static void main(String[] args) {

 // Fill your code here
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the code");
 StringBuilder a=new StringBuilder();
 a.append(s.nextLine());
 System.out.println("Formatted code");
 if (a.substring(0,2).contains("DH"))
 a.replace(0,2,"DEL");
 else if (a.substring(0,2).contains("MB"))
 a.replace(0,2,"MUB");
 else if (a.substring(0,2).contains("KL"))
 a.replace(0,2,"KOL");
 int p=3;
 while (a.length()!=8)
 {
 a.insert(p,0);
 p++;
 }
 System.out.println(a);
 }
}
