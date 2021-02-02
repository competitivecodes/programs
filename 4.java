//Main.java
import java.util.Scanner;
import java.util.*;
public class Main {
 public static void main(String[] args){
 //Your code here
 Scanner s=new Scanner(System.in);
 int m,n;
 String p,name,num,owner;
 Double cost;
 Hall h=new Hall();
 List x=new ArrayList();
 do
 {
 System.out.println("Action");
 System.out.println("1.Add Hall\n2.Remove Hall\nEnter your choice");
 n=s.nextInt();
 if (n==1)
 {
 System.out.println("Enter the Hall details in CSV format");
 s.nextLine();
 String[] a=s.nextLine().split(",");
 h.setName(a[0]);
 h.setContactNumber(a[1]);
 h.setCostPerDay(Double.parseDouble(a[2]));
 h.setOwnerName(a[3]);
 x=h.addEle(x);
 }
 else if (n==2)
 {
 if (x.isEmpty())
 {
 System.out.println("The list is empty");
 System.exit(0);
 }
 System.out.println("Enter the index of the hall to be removed");
 m=s.nextInt();
 x=h.removeEle(m,x);
 h.display(x);
 }
 else
 System.out.println("Please enter a valid choice");
 System.out.println("Do you want to continue?(Y/N)");
 p=s.next();
 }
 while(!p.equals("N"));
}
}
//Hall.java
import java.util.*;
public class Hall {
 //write your code here
 private String name,contactNumber,ownerName;
 private Double costPerDay;

 Hall()
 {

 }

 Hall(String name,String contactNumber,Double costPerDay,String ownerName)
 {
 this.name=name;
 this.contactNumber=contactNumber;
 this.costPerDay=costPerDay;
 this.ownerName=ownerName;
 }

 public String getName()
 {
 return name;
}
public void setName(String name)
 {
this.name = name;
}

 public String getContactNumber()
 {
 return contactNumber;
}
public void setContactNumber(String contactNumber)
 {
this.contactNumber = contactNumber;
}
 public String getOwnerName()
 {
return ownerName;
}
public void setOwnerName(String ownerName)
 {
this.ownerName = ownerName;
}
 public Double getCostPerDay()
 {
return costPerDay;
}
public void setCostPerDay(Double costPerDay)
 {
this.costPerDay = costPerDay;
}

 public List<Hall> addEle(List<Hall> h)
 {
 h.add(new Hall(getName(),getContactNumber(),getCostPerDay(),getOwnerName()));
 return h;
 }

 public List<Hall> removeEle(int i,List<Hall> h)
 {
 h.remove(i);
 return h;
 }

 public void display(List<Hall> h)
 {
 if (h.isEmpty())
 System.out.println("No Hall details to display");
 else
 {
 System.out.printf("%-20s%-20s%-20s%-20s","Hall name","Contact number","Cost per
day","Owner name");
 int size=h.size();
 System.out.println();
 for (int i=0;i<size;i++)
 {
 Hall hb=h.get(i);
 System.out.printf("%-20s%-20s%-20s%-
20s\n",hb.getName(),hb.getContactNumber(),hb.getCostPerDay(),hb.getOwnerName());
 }
 }
 }
}
