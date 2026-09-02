public class methods {

    public static void greet() {   // jab void nhi likha hoga toh , return type likhna [padega].
        System.out.println("Hello");
    }
//     interview mein bolo:
// Every method declaration has a return type. If the method doesn't return a value, we use void.
// public       → access modifier
// static       → belongs to class
// void         → method kuch return nahi karta
// greet        → method ka naam
// ()           → parameters
// {}           → method body
// Interview difference
// Parameter: variable declared in method definition.
// Argument: actual value passed during method call.

public static void sum( int a , int b){
int sum = a + b ;
System.out.println(sum);
}

// swappinmg of two numbers 

public static void swap( int a , int b ){
    int temp = a ;
    a = b ;
    b =  temp;   // this is whole logic 
    System.out.println( b );
    System.out.println( a );

}
public static void main (String args [] ){
int a = 5 ;
int b = 6;
sum (a, b);
 greet();

 System.out.println(" __________________________________________________");
 swap( a, b );

}

// ⭐ void vs return
// This is VERY important for interviews.
// Remember:
// void → gives nothing back

// return type → gives a value back

// 14. static kyun use kar rahe hain?
// Abhi tum mostly aise methods dekhoge:
// static void add()
// static ka simple meaning:
// Static method class se associated hota hai, object banaye bina call kiya ja sakta hai.
 

}