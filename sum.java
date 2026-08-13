/* sum of two numbers taking user input  */

import java.util.Scanner;

public class sum {
    public static void main ( String [] args ){

        Scanner sc = new Scanner(System.in);
       System.out.println(" enter number A");
      

       int a = sc.nextInt();
        System.out.println(" enter number  B");
       int b = sc.nextInt();

       int Sum = a + b;
    
       System.out.println("sum of a and b = "+ Sum);



    }


}
