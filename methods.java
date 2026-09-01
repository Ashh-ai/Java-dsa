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
public static void main (String args [] ){
int a = 5 ;
int b = 6;
sum (a, b);
 greet();

}

 

}