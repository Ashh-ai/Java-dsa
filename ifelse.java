import java.util.Scanner;

public class ifelse{
    public static void main(String[] args) {
        // print largest of two 
int a = 12;
int b = 2;
if (a<b){
    System.out.println( "b is larger  ");
}
else{
    System.out.println("a is larger");
}
    


// print if a number is odd or even 

int num = 12; 


if ( num % 2 == 0 ){
    System.out.println("number is even ");
}

else{ 
    System.out.println(" number is odd");

}
  


                                  // ELSE IF STATEMEnt 
                  // income tax calculator 
                  
// income < 5 l  = 0 percenbt tax 
// income agr btw 5 10 ltoh 20% tax 
// income agr < 10l toh 30 percent tax 

Scanner sc = new Scanner(System.in);
System.out.println( " enter the income ");

int income = sc.nextInt();

if (income < 50000){
    System.out.println("5% tax ");
}
else if (income >=  500000 && income < 100000){
    System.out.println("10% tax ");
 }

else{
    System.out.println(" 30% tax ");
}

 
// abhi isko baad mai check krte haiu 


    //   TERNARY OPERATOR 

// VARIABLE =  CONDITION ? STATEMENT1: STATEMENT2; THIS IS THE SYNTAX 


int number  = 4 ; // yha pe condition meliyue int bana diya 

 String type =( (number % 2 ) == 0) ? "even" : "odd"; // yha pe string bana diyua jissse jo satement ayegi usko store krna pdega 

 System.out.println(type); // yha pe print karav denge ye string ko 

int ash = 10;
String house = ( ash < 10 ) ? " bigger ": " smaller";
 System.out.println(house);


 int marks = 56 ;

 String result  = ( ( marks >= 33) ) ? "pass": "fail";

 System.err.println(result);

 // SWITCH STATEMENT 


 Scanner DS = new Scanner(System.in);
 int y = DS.nextInt();
 System.out.println(y);
int z = DS.nextInt();
 System.out.println(z);
char operator = sc.next().charAt(0);

switch (operator){
    case '+' : System.out.println(y+z);
              break; // break is use to stop the condition 

    case '-' : System.out.println(y-z);          
              break;
    case '*' : System.out.println(y*z);    
    break;
    default : 
    System.out.println("done");



}
    


}

}

// Q4. Multiple conditions check karne ke liye kya use karoge?
// else if
// if (marks >= 90) {
//     System.out.println("A");
// }
// else if (marks >= 75) {
//     System.out.println("B");
// }
// else {
//     System.out.println("C");
// }


// 🔥 Switch Interview
// Q11. switch kab use karna better hota hai?
// Jab tumhare paas multiple fixed choices/cases hon.

// Q12. break ka kya kaam hai?
// break current switch ko terminate karta hai.
