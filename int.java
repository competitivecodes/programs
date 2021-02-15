//RTGSTransfer.java
public class RTGSTransfer extends FundTransfer{
//write your code here

 RTGSTransfer()
 {

 }

 RTGSTransfer(String accountNumber,Double balance)
 {
 super(accountNumber,balance);
 }
 Boolean transfer(Double transfer)
 {
 double a=getBalance();
 if (transfer>10000)
 {
 a=a-transfer;
 setBalance(a);
 return true;
 }
 return false;
 }
}
//FundTransfer.java
public abstract class FundTransfer {
//write your code here
 private String accountNumber;
 private double balance;

 FundTransfer()
 {

 }

 FundTransfer(String accountNumber,double balance)
 {
 this.accountNumber=accountNumber;
 this.balance=balance;
 }

 public String getAccountNumber()
 {
 return accountNumber;
 }

 public double getBalance()
 {
 return balance;
 }

 public void setAccountNumber(String accountNumber)
 {
 this.accountNumber=accountNumber;
 }

 public void setBalance(double balance)
 {
 this.balance=balance;
 }

 Boolean validate(Double transfer)
 {
 if (accountNumber.length()==10 && transfer>0 && transfer<balance)
 return true;
 return false;
 }

 abstract Boolean transfer(Double transfer);
}
//NEFTTransfer.java
public class NEFTTransfer extends FundTransfer{
//write your code here

 NEFTTransfer()
 {

 }

 NEFTTransfer(String accountNumber,Double balance)
 {
 super(accountNumber,balance);
 }

 Boolean transfer(Double transfer)
 {
 double a=transfer+(5*(transfer))/100;
 double b=getBalance();

 if (a<getBalance())
 {
 b=b-a;
 setBalance(b);
 return true;
 }
 return false;
 }
}
//Main.java
import java.util.Scanner;
public class Main {
public static void main(String args[]) throws Exception {
//write your code here
 Scanner s=new Scanner(System.in);
 System.out.println("Enter your account number:");
 String no=s.nextLine();
 System.out.println("Enter the balance of the account:");
 double bal=s.nextDouble();
 System.out.println("Enter the type of transfer to be made:\n1.NEFT\n2.IMPS\n3.RTGS");
 int n=s.nextInt();
 System.out.println("Enter the amount to be transferred:");
 double transfer=s.nextDouble();

 if(n==1)
 {
 NEFTTransfer a=new NEFTTransfer(no,bal);

 a.setAccountNumber(no);
 a.setBalance(bal);

 if (a.validate(transfer)==false)
 {
 System.out.println("Account number or transfer amount seems to be wrong");
 System.exit(0);
 }

 if(a.transfer(transfer))
 {
 System.out.println("Transfer occurred successfully");
 System.out.println("Remaining balance is "+a.getBalance());
 }
 else
 System.out.println("Transfer could not be made");
 }
 else if (n==2)
 {
 IMPSTransfer i=new IMPSTransfer(no,bal);

 i.setAccountNumber(no);
 i.setBalance(bal);

 if (i.validate(transfer)==false)
 {
 System.out.println("Account number or transfer amount seems to be wrong");
 System.exit(0);
 }

 if(i.transfer(transfer))
 {
 System.out.println("Transfer occurred successfully");
 System.out.println("Remaining balance is "+i.getBalance());
 }
 else
 System.out.println("Transfer could not be made");
 }
 else if(n==3)
 {
 RTGSTransfer r=new RTGSTransfer(no,bal);

 r.setAccountNumber(no);
 r.setBalance(bal);

 if (r.validate(transfer)==false)
 {
 System.out.println("Account number or transfer amount seems to be wrong");
 System.exit(0);
 }

 if(r.transfer(transfer))
 {
 System.out.println("Transfer occurred successfully");
 System.out.println("Remaining balance is "+r.getBalance());
 }
 else
 System.out.println("Transfer could not be made");
 }
}
}
//IMPSTransfer.java
public class IMPSTransfer extends FundTransfer{
//write your code here
 IMPSTransfer()
 {

 }

 IMPSTransfer(String accountNumber,Double balance)
 {
 super(accountNumber,balance);
 }

 Boolean transfer(Double transfer)
 {
 double a=transfer+(2*(transfer))/100;
 double b=getBalance();

 if (a<getBalance())
 {
 b=b-a;
 setBalance(b);
 return true;
 }
 return false;
 }
}
