public import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//   HACKER RANK QUESTIONS 
// You are given marks of a student as input. Display a correct message based on the following rules:

// for marks above 90, print "Excellent".
// for marks above 80 and less than equal to 90, print "Good"
// for marks above 70 and less than equal to 80, print "Fair".
// for marks above 60 and less than equal to 70, print "Meets Expectations".
// for marks below and equal to 60, print "Below Expectations".
public class Solution {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
 
   if ( N > 90 ){
    System.out.println("Excellent");
  }
  else if ( N > 80){
    System.out.println("Good");
  }
  else if ( N > 70  ){
    System.out.println("Fair");  
  }
  else if ( N > 60 ){
    System.out.println("Meets Expectations");
    
  }
  else{
    System.out.println("Below Expectations");
  }
  
    }
} {
    
}

