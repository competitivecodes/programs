//UserBO.java
import java.util.*;
public class UserBO extends ArrayList<User>{
 public static UserBO getList(){
 UserBO u=new UserBO();
u.add(new User("mohan Raja","9874563210","mohan","mohan@abc.in"));
u.add(new User("arjun Ravi","4324237","arjun","arjun@abc.in"));
u.add(new User("Arun kumar","9845671230","arun","arun@abc.in"));
u.add(new User("prakash raj","7548921445","prakash","raj@abc.in"));
return u;
}
 //Your code here
 public static UserBO removeUser(int r1,int r2,ArrayList<User> list)
 {
 UserBO u = new UserBO();
 for(int i=0;i<list.size();i++)
 {
 User obj = list.get(i);
 u.add(obj);
 }
 u.removeRange(r1,r2);
 return u;
 }
}
//User.java
public class User{
 //Your code here
 String name,contactNumber,username,email;
 User(String n,String c,String u,String e)
 {
 name=n;
 contactNumber = c;
 username=u;
 email=e;
 }
 public void display()
 {
 String s = String.format("%-20s%-20s%-20s%-20s",name,contactNumber,username,email);
 System.out.println(s);
 }
}
//Main.java
import java.util.*;
public class Main{
 public static void main(String[] args){
 //Your code here
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the number of User details to be added");
 int n = s.nextInt();
 s.nextLine();
 ArrayList<User> d = new ArrayList<User>();
 d = UserBO.getList();
 ArrayList<User> list = new ArrayList<User>();
 list.addAll(d);
 for(int i=0;i<n;i++)
 {
 System.out.printf("Enter the user %d detail in csv format\n",i+1);
 String str[] = s.nextLine().split(",");
 User obj = new User(str[0],str[1],str[2],str[3]);
 list.add(obj);
 }
 System.out.format("%-20s%-20s%-20s%-20s\n","Name","Contact
Number","Username","Email");
 for(int i=0;i<n+4;i++)
 {
 User u = list.get(i);
 u.display();
 }
 System.out.println("Enter the range to be removed from array list");
 int r1 = s.nextInt();
 int r2 = s.nextInt();
 list = UserBO.removeUser(r1,r2,list);
 System.out.format("%-20s%-20s%-20s%-20s\n","Name","Contact
Number","Username","Email");
 for(int i=0;i<list.size();i++)
 {
 User u = list.get(i);
 u.display();
 }

}
}
