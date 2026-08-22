

//         Q1 Task
// Given an integer, , perform the following conditional actions:

// If  is odd, print Weird
// If  is even and in the inclusive range of  to , print Not Weird
// If  is even and in the inclusive range of  to , print Weird
// If  is even and greater than , print Not Weird
// Complete the stub code provided in your editor to print whether or not  is weird.

// import java.io.*;
// import java.math.*;
// import java.security.*;
// // import java.text.*;
// import java.util.*;
// // import java.util.concurrent.*;
// // import java.util.regex.*;

// public  class Solution {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if (n % 2 != 0) {
//             System.out.print("Weird");
//         }
//         else if (n % 2 == 0 && n >= 2 && n <= 5) {
//             System.out.print("Not Weird");
//         }
//         else if (n % 2 == 0 && n >= 6 && n <= 20) {
//             System.out.print("Weird");
//         }
//         else {
//             System.out.print("Not Weird");
//         }
//     }
// }

// task 2 
import java.util.Scanner;

class task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            System.out.printf("%-15s%03d%n", s1, x);
        }

        System.out.println("================================");
    }
}


// Q3

// Objective
// In this challenge, we're going to use loops to help us do some simple math.

// Task
// Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

// Input Format

// A single integer, .

// Constraints

// Output Format

// Print  lines of output; each line  (where ) contains the  of  in the form:
// N x i = result.

// Sample Input

// 2
// Sample Output

// 2 x 1 = 2
// 2 x 2 = 4
// 2 x 3 = 6
// 2 x 4 = 8
// 2 x 5 = 10
// 2 x 6 = 12
// 2 x 7 = 14
// 2 x 8 = 16
// 2 x 9 = 18
// 2 x 10 = 20



class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}