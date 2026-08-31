import java.lang.Math; 

// java.math     
// Agar bahut large numbers ya high-precision calculations karni hain:
// import java.math.*;

public class math {
    public static void main( String [] args ){
        

        int absolute = -25;

        int result = Math.abs(absolute);

        System.out.println(result);
         
         
//                              1. Math.abs() — Absolute Value

// Math.abs() returns the absolute value of a number, meaning it removes the negative sign..
// Math.abs(10)    → 10
// Math.abs(-10)   → 10
// Math.abs(0)     → 0
// DSA use
// Difference nikalne mein bahut common:
// int a = 10;
// int b = 25;

// int difference = Math.abs(a - b);

// System.out.println(difference);
// Output:
// 15
       
                                   
                                      // 2. Math.max() — Maximum
       
    //    Definition
// Math.max() returns the larger of two values.

// Syntax
// Math.max(a, b);
// Code
// public class Main {
//     public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int maximum = Math.max(a, b);

        System.out.println(maximum);

// DSA use 🔥
// Maximum value maintain karne mein:
// int max = Math.max(a, b);
// Later arrays mein bhi iska use milega.

// Interview Q
// Q: What does Math.max() return?

//                              3. Math.min() — Minimum

 
// Definition
// Math.min() returns the smaller of two values.

// Syntax
// Math.min(a, b);
int k = 12;
int m = 45;

int minimmum = Math.min(k,m);
System.out.println(minimmum);

// Interview Q
// Q: Difference between Math.max() and Math.min()?
// Answer:
// - Math.max() → returns larger value.
// - Math.min() → returns smaller value.

                                            // 4. Math.sqrt() — Square Root
                                            //  Drefination :-  Math.sqrt() returns the square root of a number.

      int s = 25;
      double squar_root = Math.sqrt(s);
      System.out.println(squar_root);   
      
//       Why 5.0?
// Because Math.sqrt() returns a double.
// Interview Q
// Q: What is the return type of Math.sqrt()?
// Answer: double.

// Examples
// System.out.println(Math.sqrt(16));  // 4.0
// System.out.println(Math.sqrt(81));  // 9.0
// System.out.println(Math.sqrt(2));   // 1.414...

                                            //    5. Math.pow() — Power
// Definition
// Math.pow() returns the value of the first argument raised to the power of the second argument.

// a ^ b 
  
  double power = Math.pow(2, 3); //   ( base , power ) here first 2 means is number is ki power and second one means 3 time power 
 double power2 = Math.pow(3,2);  // ( base, power) idhar bhi number 3 ki power 2 hogi 

        System.out.println(power);
         System.out.println(power2);


//          Interview Q
// Q: What is used to calculate power in Java?
// Answer: Math.pow().

                                            //         6. Math.round() — Nearest Integer
                             // Defination :-Math.round() rounds a decimal value to the nearest whole number.
                             System.out.println(Math.round(4.6)); 
//                              4.1 → 4
// 4.4 → 4
// 4.5 → 5
// 4.9 → 5
// Interview mein yaad rakho 🔥
// Math.round() ke 2 important overloaded versions hain:
// Math.round(float)   → int
// Math.round(double)  → long

// 7. Math.ceil() — Round Up
// Definition
// Math.ceil() returns the smallest integer value that is greater than or equal to the given number.

// Simple language:
// Decimal ko upar le jaata hai.


        System.out.println(Math.ceil(4.1));
        System.out.println(Math.ceil(4.9));
        System.out.println(Math.ceil(4.0));
        // Interview Q
// Q: What does Math.ceil() return?
// Answer: The smallest integer greater than or equal to the given number, returned as a double.

// 8. Math.floor() — Round Down
// Definition
// Math.floor() returns the largest integer value that is less than or equal to the given number.

// Simple:
// Decimal ko neeche le jaata hai.

   System.out.println(Math.floor(4.3));
   System.out.println(Math.floor(7.6));
   System.out.println(Math.floor(45.9));   // YE KREGA HI LAREGST INTEGER 

//    4.1 → 4
// 4.9 → 4
// 4.0 → 4
// ceil vs floor
// Number     ceil       floor

// 4.2        5.0        4.0
// 4.8        5.0        4.0
// 4.0        4.0        4.0
                                                        // 9. Math.random() 🔥
                                                        
        //   Definition ;- Math.random() generates a pseudo-random double value greater than or equal to 0.0 and less than 1.

          int randomNumber = (int) (Math.random() * 50); // ye randomnumber multi[ply krke int maidega ]

          double randomnumber2 = Math.random();  // yre random number dega 
          System.out.println(randomnumber2);

        System.out.println(randomNumber);

        int number5 = (int)(Math.random() * 10) + 1;

System.out.println(number5);

// 10. Math.PI
// Definition
// Math.PI is a predefined constant representing the mathematical value of π.
System.out.println(Math.PI);

double radius = 5 ;
    double area =  (Math.PI)* Math.pow(radius,2);
      System.out.println(area);

//       11. Math.E
// Math.E mathematical constant e ko represent karta hai.
System.out.println(Math.E);






// 🎯 Interview Questions You Should Know
// Q1. What is the Math class in Java?
// Answer:
// Math is a built-in class in the java.lang package that provides methods and constants for mathematical operations.

    }
}