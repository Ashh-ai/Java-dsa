import java.util.Scanner;

public class simpleinterest {
    public static void main (String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println(" enter the p ");
 int  p  = sc.nextInt();
  System.out.println(" enter the r ");
 int  r  = sc.nextInt();
  System.out.println("enter the t");
 int  t  = sc.nextInt();

 int si = p * r * t / 100; 
 System.out.println(si);
 

    }
}
