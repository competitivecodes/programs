//Main.java
import java.util.Scanner;
public class Main {
public static void main(String[] args){
//Your code here
 Scanner s=new Scanner(System.in);
 System.out.println("Enter Address Line 1");
 String a1=s.nextLine();
 System.out.println("Enter Address Line 2");
 String a2=s.nextLine();
 System.out.println("Enter the City Name");
 String c=s.nextLine();
 System.out.println("Enter the State Name");
 String d=s.nextLine();
 System.out.println("Enter the Pincode");
 int p=s.nextInt();
 Address a=new Address();
 a.setAddressLine1(a1);
 a.setAddressLine2(a2);
 a.setCity(c);
 a.setState(d);
 a.setPincode(p);
 System.out.println(a);
}
}
//Address.java
public class Address {
//Your code here
 private String addressLine1,addressLine2,city,state;
 private int pincode;

 public String getAddressLine1()
 {
 return addressLine1;
 }
 public String getAddressLine2()
 {
 return addressLine2;
 }
 public String getCity()
 {
 return city;
 }
 public String getState()
 {
 return state;
 }
 public int getPincode()
 {
 return pincode;
 }

 public void setAddressLine1(String addressLine1)
 {
 this.addressLine1=addressLine1;
 }
 public void setAddressLine2(String addressLine2)
 {
 this.addressLine2=addressLine2;
 }
 public void setCity(String city)
 {
 this.city=city;
 }
 public void setState(String state)
 {
 this.state=state;
 }
 public void setPincode(int pincode)
 {
 this.pincode=pincode;
 }
@Override
public String toString() {
//Your code here
 return ("The Address Details
are\n"+getAddressLine1()+"\n"+getAddressLine2()+"\n"+getCity()+"\n"+getState()+"\n"+getPin
code());
}
