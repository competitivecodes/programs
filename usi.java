//Stall.java
public class Stall implements Runnable {
//Your code here
 private String stallName,details,owner;
 private Double stallArea,stallCost;

 Stall()
 {

 }

 Stall(String stallName, String details, Double stallArea, String owner)
 {
 this.stallName=stallName;
 this.details=details;
 this.stallArea=stallArea;
 this.owner=owner;
 }

 public void setStallCost(Double stallCost)
 {
 this.stallCost=stallCost;
 }

 public double getStallCost()
 {
 return stallCost;
 }
 public void run() {
//Your code here
 stallCost=stallArea*150.0;
 this.setStallCost(stallCost);
}
}
//Main.java
import java.util.Scanner;
import java.io.*;
public class Main {
public static void main(String[] args) throws IOException, InterruptedException {
//Your code here
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the number of stalls:");
 int n=s.nextInt();
 s.nextLine();
 String[] a=new String[4];
 double sum=0.0;

 for (int i=0;i<n;i++)
 {
 a=s.nextLine().split(",");
 Stall p=new Stall(a[0],a[1],Double.parseDouble(a[2]),a[3]);
 Thread t=new Thread(p);
 t.start();
 t.sleep(1000);
 sum+=p.getStallCost();
 }
 System.out.println("The total revenue is "+sum);

}
}
