//ItemType.java
public class ItemType {
//write your code here
 private String name;
 private double deposit,costPerDay;

 ItemType()
 {

 }

 ItemType(String name,double deposit,double costPerDay)
 {
 this.name=name;
 this.deposit=deposit;
 this.costPerDay=costPerDay;
 }

 public String getName()
 {
 return name;
 }
 public double getDeposit()
 {
 return deposit;
 }
 public double getCostPerDay()
 {
 return costPerDay;
 }

 public void setName(String name)
 {
 this.name=name;
 }
 public void setDeposit(double deposit)
 {
 this.deposit=deposit;
 }
 public void setCostPerDay(double costPerDay)
 {
 this.costPerDay=costPerDay;
 }

}
//Main.java
import java.util.Scanner;
public class Main {
public static void main(String args[]) throws Exception{
//write your code here
 Scanner s=new Scanner(System.in);
 ItemType[] a=new ItemType[100];
 int i=0;
 String name,c;
 double deposit,cost;
 do
 {
 System.out.println("Enter the details of Item Type "+(i+1));
 System.out.println("Name:");
 if (i>0)
 s.nextLine();
 name=s.nextLine();
 System.out.println("Deposit:");
 deposit=s.nextDouble();
 System.out.println("Cost per Day:");
 cost=s.nextDouble();
 a[i]=new ItemType(name,deposit,cost);
 a[i].setName(name);
 a[i].setDeposit(deposit);
 a[i].setCostPerDay(cost);
 System.out.println("Do you want to continue?(y/n)");
 c=s.next();
 i++;
 }
 while(c.equals("y"));

 System.out.format("%-20s%-20s%-20s\n","Name","Deposit","CostPerDay");
 for (int j=0;j<i;j++)
 {
 System.out.format("%-20s%-20s%-
20s\n",a[j].getName(),a[j].getDeposit(),a[j].getCostPerDay());
 }
}
}
