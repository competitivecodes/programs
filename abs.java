//Main.java
import java.util.Scanner;
import java.lang.System;
public class Main {
public static void main(String[] args){
//Your code here
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the Booking details");
 String str=s.nextLine();
 String[] a=str.split(",");
 String name=a[0];
 String customer=a[1];
 int seats=Integer.parseInt(a[2]);
 System.out.println("Payment mode\n1.Cash payment\n2.Wallet payment\n3.Credit card
payment");
 int i=s.nextInt();
 if (i!=1 && i!=2 && i!=3)
 {
 System.out.print("Invalid choice");
 System.exit(0);
 }
 TicketBooking t=new TicketBooking();
 t.setStageEvent(name);
 t.setCustomer(customer);
 t.setNoOfSeats(seats);
 if(i==1)
 {
 System.out.println("Enter the amount");
 double amt=s.nextDouble();
 t.makePayment(amt);
 }
 else if(i==2)
 {
 System.out.println("Enter the amount");
 double amt=s.nextDouble();
 System.out.println("Enter the wallet number");
 String no=s.next();
 t.makePayment(no,amt);
 }
 else
 {
 System.out.println("Enter card holder name");
 String n=s.next();
 System.out.println("Enter the amount");
 double amt=s.nextDouble();
 System.out.println("Enter the credit card type");
 String cc=s.next();
 System.out.println("Enter the CCV number");
 String ccv=s.next();
 t.makePayment(cc,ccv,n,amt);
 }
}
}
//TicketBooking.java
public class TicketBooking {
//Your code here
 private String stageEvent,customer;
 private int noOfSeats;

 public String getStageEvent()
 {
 return stageEvent;
 }
 public String getCustomer()
 {
 return customer;
 }
 public int getNoOfSeats()
 {
 return noOfSeats;
 }

 public void setStageEvent(String stageEvent)
 {
 this.stageEvent=stageEvent;
 }
 public void setCustomer(String customer)
 {
 this.customer=customer;
 }
 public void setNoOfSeats(int noOfSeats)
 {
 this.noOfSeats=noOfSeats;
 }

 public void makePayment(double amount)
 {
 System.out.println("Stage event:"+getStageEvent());
 System.out.println("Customer:"+getCustomer());
 System.out.println("Number of seats:"+getNoOfSeats());
 System.out.println("Amount "+amount+" paid in cash");
 }

 public void makePayment(String walletNumber ,double amount)
 {
 System.out.println("Stage event:"+getStageEvent());
 System.out.println("Customer:"+getCustomer());
 System.out.println("Number of seats:"+getNoOfSeats());
 System.out.println("Amount "+amount+" paid using wallet number "+walletNumber);
 }

 public void makePayment(String creditCard,String ccv,String name,double amount)
 {
 System.out.println("Stage event:"+getStageEvent());
 System.out.println("Customer:"+getCustomer());
 System.out.println("Number of seats:"+getNoOfSeats());
 System.out.println("Holder name:"+name);
 System.out.println("Amount "+amount+" paid using "+creditCard+" card");
 System.out.println("CCV:"+ccv);
 }
}
