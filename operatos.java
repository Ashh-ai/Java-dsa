// // 
// public class operatos {
    
// }

// a


// 4. Pre-Increment ++x
// Pre means:
// Increase first, then use the new value.

// int x = 10;

// int y = ++x;

// System.out.println(x);
// System.out.println(y);
// Output:
// 11
// 11


// 5. Pre-Decrement
// int x = 10;

// int y = --x;

// System.out.println(x);
// System.out.println(y);
// First:
// x = 9
// Then y gets 9.
// Output:
// 9
// 9

// 6. Post-Decrement
// int x = 10;

// int y = x--;

// System.out.println(x);
// System.out.println(y);
// First y gets the old value:
// y = 10
// Then:
// x = 9
// Output:
// 9
// 10
// 🔥 The Four Case //
// //
//🎯 Interview Questions
// Q1. Difference between ++x and x++?
// Answer:
// ++x is pre-increment: it increments the variable before its value is used in the expression.
// x++ is post-increment: it uses the current value first and increments afterward.

// Q2. Difference between --x and x--?
// Same concept.
// --x → decrease first, then use
// x-- → use first, then decrease

// RELATIONAL OPERATOR 
// 1 . == ( CHECLKS Equals )

public class operatos{
    public static void main ( String args []) {
    int A= 10;
    int B = 20;
    
    int c = 5 ;
    int d = 5 ;
    
    System.out.println(A==B);
    System.out.println(c==d);   // here == is used to check it is equal or not 

      int k = 10;
    int l = 20;
    
    int e = 5 ;
    int f  = 5 ;
    
    System.out.println(" checks inequality : " + (k != l));
    System.out.println(e != f);    // here not equals to jab koiequals nhi hai tab use hoga 

    int v = 20;
int m = 10;

System.out.println( "check greater than:  " + ( v> m ) );

int p = 10;
int n = 3;

System.out.println( "checks less than :" + (p < n));


// // 🎯 Interview Questions
// Q1. Relational operators ka return type kya hota hai?
// Answer: boolean
// Example:
// 10 > 5
// Result:
// true

// Q2. = aur == mein difference?
// Answer:
// = → assignment
// int x = 10;
// == → comparison
// x == 10;

// Q3. Output kya hoga?
// int x = 10;
// int y = 20;

// System.out.println(x > y);
// System.out.println(x != y);
// System.out.println(x <= y);
// Answer:
// false
// true
// true

// int x = 5;

// System.out.println(x == 5);
// System.out.println(x != 5);
// Answer:
// true
// false
                            //   Logical Operators


//    2. && — AND Operator
// Dono conditions true → result true

int age = 21;
int marks = 80;

System.out.println(age >= 18 && marks >= 40);

// AND ka truth table
// A	B	A && B
// true	true	true
// true	false	false
// false	true	false
// false	false	false

// || — OR Operator
// OR mein at least one condition true honi chahiye.
// Example:

int pym = 16;
boolean hasPermission = true;

System.out.println(pym >= 18 || hasPermission);

// Truth table
// | A | B | A || B |
// |---|---|---|
// | true | true | true |
// | true | false | true |
// | false | true | true |
// | false | false | false |
// 🧠 Shortcut
// || = ek bhi true hai to true

// 4. ! — NOT Operator
// NOT result ko reverse kar deta hai.
// boolean x = true;

// System.out.println(!x);
// Output:
// false
// Truth table
// A	!A
// true	false
// false	true


// && → ALL true
// || → ANY ONE true
// !  → REVERSE

                                     // assignment operator 

                                    //  =
                                    //  +=
                                    //  -=
                                    //  *=
                                    //  /=
}
}