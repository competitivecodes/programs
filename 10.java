//Exhibition.java
public class Exhibition extends Event {
//Your code here
private int noOfStalls;
 private double rentPerStall;

 Exhibition()
 {

 }

 Exhibition(String name,String detail,String type,String organiser,int noOfStalls,double
rentPerStall)
 {
 super(name,detail,type,organiser);
 this.noOfStalls=noOfStalls;
 this.rentPerStall=rentPerStall;
 }

 public int getNoOfStalls()
 {
 return noOfStalls;
 }
 public double getRentPerStall()
 {
 return rentPerStall;
 }

 public void setNoOfStalls(int noOfStalls)
 {
 this.noOfStalls=noOfStalls;
 }
 public void setRentPerStall(double rentPerStall)
 {
 this.rentPerStall=rentPerStall;
 }

 Double calculateAmount()
 {
 return noOfStalls*rentPerStall;
 }
}
//Main.java
import java.io.IOException;
import java.util.Scanner;
public class Main {
public static void main(String[] args) throws IOException{
//Your code here
 Scanner s=new Scanner(System.in);
 System.out.println("Enter your choice\n1.Exhibition\n2.StageEvent");
 int n=s.nextInt();
 if(n!=1 && n!=2)
 {
 System.out.println("Invalid choice");
 System.exit(0);
 }
 System.out.println("Enter the details in CSV format");
 String name,detail,type,organiser;
 int noOfStalls,noOfShows;
 double rentPerStall,costPerShow,amt;

 if(n==1)
 {
 s.nextLine();
 String[] arr=s.nextLine().split(",");
 name=arr[0];
 detail=arr[1];
 type=arr[2];
 organiser=arr[3];
 noOfStalls=Integer.parseInt(arr[4]);
 rentPerStall=Double.parseDouble(arr[5]);
 Exhibition e=new Exhibition(name,detail,type,organiser,noOfStalls,rentPerStall);
 amt=e.calculateAmount();
 System.out.println("Exhibition Details");
 System.out.println("Event Name:"+name);
 System.out.println("Detail:"+detail);
 System.out.println("Type:"+type);
 System.out.println("Organiser Name:"+organiser);
 System.out.println("Total Cost:"+amt);
 }
 else if(n==2)
 {
 s.nextLine();
 String[] arr=s.nextLine().split(",");
 name=arr[0];
 detail=arr[1];
 type=arr[2];
 organiser=arr[3];
 noOfShows=Integer.parseInt(arr[4]);
 costPerShow=Double.parseDouble(arr[5]);
 StageEvent e=new StageEvent(name,detail,type,organiser,noOfShows,costPerShow);
 amt=e.calculateAmount();
 System.out.println("Stage Event Details");
 System.out.println("Event Name:"+name);
 System.out.println("Detail:"+detail);
 System.out.println("Type:"+type);
 System.out.println("Organiser Name:"+organiser);
 System.out.println("Total Cost:"+amt);
 }
 }
}
//StageEvent,java
public class StageEvent extends Event{
 private int noOfShows;
 private double costPerShow;
 StageEvent()
 {

 }

 StageEvent(String name,String detail,String type,String organiser,int noOfShows,double
costPerShow)
 {
 super(name,detail,type,organiser);
 this.noOfShows=noOfShows;
 this.costPerShow=costPerShow;
 }

 public int getNoOfShows()
 {
 return noOfShows;
 }
 public double getCostPerShow()
 {
 return costPerShow;
 }

 public void setNoOfShows(int noOfShows)
 {
 this.noOfShows=noOfShows;
 }
 public void setCostPerShow(double costPerShow)
 {
 this.costPerShow=costPerShow;
 }

 Double calculateAmount()
 {
 return noOfShows*costPerShow;
 }
}
//Event.java
public abstract class Event {
//your code here
 protected String name,detail,type,organiser;

 Event()
 {

 }

 Event(String name,String detail,String type,String organiser)
 {
 this.name=name;
 this.detail=detail;
 this.type=type;
 this.organiser=organiser;
 }
 public String getName()
 {
 return name;
 }
 public String getDetail()
 {
 return detail;
 }
 public String getType()
 {
 return type;
 }
 public String getOrganiser()
 {
 return organiser;
 }

 public void setName(String name)
 {
 this.name=name;
 }
 public void setDetail(String detail)
 {
 this.detail=detail;
 }
 public void setType(String type)
 {
 this.type=type;
 }
 public void setOrganiser(String organiser)
 {
 this.organiser=organiser;
 }

 abstract Double calculateAmount();
}
