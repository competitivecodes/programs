//Main.java
import java.util.Scanner;
public class Main {
public static void main(String[] args){
//fill your code here
 Scanner s=new Scanner(System.in);
 System.out.println("Choose Stall Type");
 System.out.println("1.Silver Stall");
 System.out.println("2.Gold Stall");
 System.out.println("3.Platinum Stall");
 int i=s.nextInt();
 if (i==1)
 {
 System.out.println("Enter Stall details in comma separated(Stall Name,Stall
Description,Owner Name,Stall Cost)");
 s.nextLine();
 String[] a=s.nextLine().split(",");
 String name=a[0];
 String detail=a[1];
 String owner=a[2];
 int cost=Integer.parseInt(a[3]);
 SilverStall p=new SilverStall();
 p.setName(name);
 p.setDetail(detail);
 p.setOwner(owner);
 p.setCost(cost);
 p.display();
 System.out.println("Total Cost:"+p.getCost());
 }
 else if (i==2)
 {
 System.out.println("Enter Stall details in comma separated(Stall Name,Stall
Description,Owner Name,Stall Cost,Number of TV set)");
 s.nextLine();
 String[] a=s.nextLine().split(",");
 String name=a[0];
 String detail=a[1];
 String owner=a[2];
 int cost=Integer.parseInt(a[3]);
 int tvSet=Integer.parseInt(a[4]);
 GoldStall p=new GoldStall();
 p.setName(name);
 p.setDetail(detail);
 p.setOwner(owner);
 p.setCost(cost);
 p.setTvSet(tvSet);
 int r=p.getCost();
 int r1=p.getTvSet();
 int res=r+(r1*100);
 p.display();
 System.out.println("Total Cost:"+res);
 }
 else if(i==3)
 {
 System.out.println("Enter Stall details in comma separated(Stall Name,Stall
Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");
 s.nextLine();
 String[] a=s.nextLine().split(",");
 String name=a[0];
 String detail=a[1];
 String owner=a[2];
 int cost=Integer.parseInt(a[3]);
 int tvSet=Integer.parseInt(a[4]);
 int proj=Integer.parseInt(a[5]);
 PlatinumStall p=new PlatinumStall();
 p.setName(name);
 p.setDetail(detail);
 p.setOwner(owner);
 p.setCost(cost);
 p.setTvSet(tvSet);
 p.setProjector(proj);
 int r=p.getCost();
 int r1=p.getTvSet();
 int r2=p.getProjector();
 int res=r+(r1*100)+(r2*500);
 p.display();
 System.out.println("Total Cost:"+res);
 }
}
}
//GoldStall.java
public class GoldStall extends SilverStall{
//fill your code here
 private int tvSet;

 public int getTvSet()
 {
 return tvSet;
 }
 public void setTvSet(int tvSet)
 {
 this.tvSet=tvSet;
 }

 public void display()
 {
 super.display();
 System.out.println("TV Sets:"+getTvSet());
 }
}
//SilverStall.java
public class SilverStall {
//fill your code here
 protected String name,detail,owner;
 protected int cost;

 public String getName()
 {
 return name;
 }
 public String getDetail()
 {
 return detail;
 }
 public String getOwner()
 {
 return owner;
 }
 public int getCost()
 {
 return cost;
 }

 public void setName(String name)
 {
 this.name=name;
 }
 public void setDetail(String detail)
 {
 this.detail=detail;
 }
 public void setOwner(String owner)
 {
 this.owner=owner;
 }
 public void setCost(int cost)
 {
 this.cost=cost;
 }

 public void display()
 {
 System.out.println("Stall Name:"+getName());
 System.out.println("Details:"+getDetail());
 System.out.println("Owner Name:"+getOwner());
 }
}
//PlatinumStall.java
public class PlatinumStall extends GoldStall{
//fill your code here
 private int projector;

 public int getProjector()
 {
 return projector;
 }
 public void setProjector(int projector)
 {
 this.projector=projector;
 }

 public void display()
 {
 super.display();
 System.out.println("Projectors:"+getProjector());
 }
}
