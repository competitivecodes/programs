//UserBO.java
public class UserBO {
public User[] getUsers() {
User[] users = new User[5];
users[0] = new User(1, "Louis", "rxfsuzA2345");
users[1] = new User(2, "Messie", "hpphmf1:");
users[2] = new User(3, "Steve", "opefKt");
users[3] = new User(4, "Kallis", "23456778");
users[4] = new User(5, "Wipro", "A$%");
return users;
}
 private String encryptPassword(String value) {
//fill the code
 String newValue="";
 for(int i=1;i<=value.length();i++)
 newValue+=(char)(value.charAt(i-1)+1);
 return newValue;
}
public boolean validate(String username, String password) {
//fill the code
 String newpass=encryptPassword(password);
 int c;
 User[] users=getUsers();
 for (int i=0;i<5;i++)
 {
 if(username.equals(users[i].getUsername()) && newpass.equals(users[i].getPassword()))
 return true;
 }
 return false;
}
}
//User.java
public class User {
//fill code here
 private int id;
 private String username,password;

 User()
 {

 }

 User(int id,String username,String password)
 {
 this.id=id;
 this.username=username;
 this.password=password;
 }

 public int getId()
 {
 return id;
 }
 public String getUsername()
 {
 return username;
 }
 public String getPassword()
 {
 return password;
 }

 public void setId(int id)
 {
 this.id=id;
 }
 public void setUsername(String username)
 {
 this.username=username;
 }
 public void setPassword(String password)
 {
 this.password=password;
 }
}
//Main.java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
public static void main(String[] args) throws Exception {
//fill code here
 Scanner s=new Scanner(System.in);
 System.out.println("Username :");
 String name=s.next();

 UserBO ub=new UserBO();
 User[] a=ub.getUsers();
 User u=new User();
 //String n=a[i].u.getUsername();
 String n;
 int c=0;
 for (int i=0;i<5;i++)
 {
 n=a[i].getUsername();
 if (name.equals(n))
 c=1;
 }
 if (c==0)
 {
 System.out.println("Password :");
 System.out.println("Incorrect username/password");
 System.exit(0);
 }
 System.out.println("Password :");
 String pass=s.next();
 if(ub.validate(name,pass))
 System.out.println("Login Successfull");
 else
 System.out.println("Incorrect username/password");
}
}
