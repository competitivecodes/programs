//User.java
public class User {
 String name,mobileNumber,username,password;
 User()
 {

 }

 User(String n,String m,String u,String p)
 {
 name=n;
 mobileNumber=m;
 username=u;
 password=p;
 }

}
//Main.java
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
 public static void main(String args[]) throws IOException {
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the number of users:");
 int n=s.nextInt();
 s.nextLine();
 ArrayList<User> userlist=new ArrayList<User>();
 for(int i=0;i<n;i++)
 {
 System.out.println("Enter the details of user : "+(i+1));
 String[] a=s.nextLine().split(",");
 User u=new User(a[0],a[1],a[2],a[3]);
 userlist.add(u);
 }
 File f=new File("output.csv");

 if(!f.exists())
 f.createNewFile();
 s
 BufferedWriter bw=new BufferedWriter(new FileWriter(f));
 UserBO.writeFile(userlist,bw);
 bw.close();
}
}
//UserBO.java
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedWriter;
public class UserBO {
 public static void writeFile(ArrayList<User> userList, BufferedWriter bw)throws IOException {
for(int i=0;i<userList.size();i++)
 {
 User u=userList.get(i);
 String s=u.name+","+u.mobileNumber+","+u.username+","+u.password+"\n";
 bw.write(s);
}
}
}
