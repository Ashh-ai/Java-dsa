/* takinf input in java  */

/*Scanner Class
Scanner is a predefined class in Java.
It helps Java read data from the keyboard.
Think of Scanner as a person listening to whatever the user types.

*/

// we need to import the library first //
/* 
import java.util.Scanner; /* ye package impoirt krne ka hamehsa */



import java.util.Scanner;

public class input{
    public static void main(String [] args ){

       Scanner pussy = new Scanner(System.in);  /* ye main line sc khuch bhi hoskta hai  */
       System.out.println("enter the age of the student");  /* ye input ke liye print krne ke liye puchoge */
int age = pussy.nextInt();  /* .nextInt(); ye integer ke liye use hota hai */

System.out.println("age of the student " 
+age); /* yha pe print krva diya and also ismecomanhi lgata hai inside the output statement ,pyhton kitrh nhi yha toh concrete wrna dusri line mai print karavao fdurasa  */
  System.out.println("true ya flse");
 boolean bacha = pussy.nextBoolean(); 
 System.err.println(bacha);

}} 

/* 
import java.util.Scanner;

public class ScannerMethodsDemo {

    public static void main(String[] args) {

        // Creating Scanner object to take input from the keyboard
        Scanner sc = new Scanner(System.in);

        // --------------------------------------------------------
        // nextInt() -> Reads an integer value
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // nextDouble() -> Reads a double (decimal) value
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // nextFloat() -> Reads a float value
        System.out.print("Enter your percentage: ");
        float percentage = sc.nextFloat();

        // nextLong() -> Reads a long integer
        System.out.print("Enter your mobile number: ");
        long mobile = sc.nextLong();

        // nextShort() -> Reads a short integer
        System.out.print("Enter a short number: ");
        short shortNumber = sc.nextShort();

        // nextByte() -> Reads a byte value (-128 to 127)
        System.out.print("Enter a byte value: ");
        byte byteValue = sc.nextByte();

        // nextBoolean() -> Reads true or false
        System.out.print("Are you a student? (true/false): ");
        boolean student = sc.nextBoolean();

        // next() -> Reads only one word (stops at space)
        System
        */

/* sumof two numbers ye question  */