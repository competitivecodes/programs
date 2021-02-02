//Account.java
public class Account {
//fill your code here
 protected String accName,accNo,bankName;

 public String getAccName()
 {
 return accName;
 }
 public String getAccNo()
 {
 return accNo;
 }
 public String getBankName()
 {
 return bankName;
 }

 public void setAccName(String accName)
 {
 this.accName=accName;
 }
 public void setAccNo(String accNo)
 {
 this.accNo=accNo;
 }
 public void setBankName(String bankName)
 {
 this.bankName=bankName;
 }

 protected void display()
 {
 System.out.println("Account Name:"+getAccName());
 System.out.println("Account Number:"+getAccNo());
 System.out.println("Bank Name:"+getBankName());
 }


}
//CurrentAccount.java
public class CurrentAccount extends Account{
//fill your code here
 private String tinNumber;

 public String getTinNumber()
 {
 return tinNumber;
 }
 public void setTinNumber(String tinNumber)
 {
 this.tinNumber=tinNumber;
 }

 public void display()
 {
 super.display();
 System.out.println("TIN Number:"+tinNumber);
 }
}
//SavingsAccount.java
public class SavingsAccount extends Account{
//fill your code here
 private String orgName;

 public String getOrgName()
 {
 return orgName;
 }
 public void setOrgName(String orgName)
 {
 this.orgName=orgName;
 }

 public void display()
 {
 super.display();
 System.out.println("Organisation Name:"+orgName);
 }
}
//Main.java
import java.util.Scanner;
public class Main {
public static void main(String[] args){
//fill your code here
 Scanner s=new Scanner(System.in);
 System.out.println("Choose Account Type");
 System.out.println("1.Savings Account");
 System.out.println("2.Current Account");
 int i=s.nextInt();
 String accName,accNo,bankName,orgName,tinNo;
 if (i==1)
 {
 System.out.println("Enter Account details in comma separated(Account Name,Account
Number,Bank Name,Organisation Name)");
 s.nextLine();
 String str=s.nextLine();
 String[] arr=str.split(",");
 accName=arr[0];
 accNo=arr[1];
 bankName=arr[2];
 orgName=arr[3];
 SavingsAccount sa=new SavingsAccount();
 sa.setAccName(accName);
 sa.setAccNo(accNo);
 sa.setBankName(bankName);
 sa.setOrgName(orgName);
 sa.display();

 }
 else if(i==2)
 {
 System.out.println("Enter Account details in comma separated(Account Name,Account
Number,Bank Name,TIN Number)");
 s.nextLine();
 String str1=s.nextLine();
 String[] arr1=str1.split(",");
 accName=arr1[0];
 accNo=arr1[1];
 bankName=arr1[2];
 tinNo=arr1[3];
 CurrentAccount ca=new CurrentAccount();
 ca.setAccName(accName);
 ca.setAccNo(accNo);
 ca.setBankName(bankName);
 ca.setTinNumber(tinNo);
 ca.display();

 }

 }
}

