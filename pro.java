//Main.java
import java.util.Scanner;
public class Main
{
 public static void main(String args[])
 {
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the number of seats to be booked:");
 int n = s.nextInt();
 int c = 0;
 int[] arr = new int[100];
 for(int i=0;i<n;i++)
 {
 System.out.println("Enter the seat number "+(i+1));
 c = s.nextInt();
 try
 {
 arr[c-1]=1;
 }
 catch(ArrayIndexOutOfBoundsException aib)
 {
 System.out.println("java.lang.ArrayIndexOutOfBoundsException: "+(c-1));
 System.exit(0);
 }
 }
 System.out.println("The seats booked are:");
 for(int i=0;i<100;i++)
 {
 if(arr[i]==1)
 System.out.println((i+1));
 }
 }
}
