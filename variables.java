/* VARIABLES IN JAVA  */

/* these are primitve data types :- byte,short,char,boolean,int,long,foat,double  */
public class variables { /* ere file name is variables sothats we have writter function name o variable , both must be same  */

    public static void main(String[] args) {

        String name = "Ashray"; /*Sentence or word */
        int age = 21; /* integre whole number only */
        double height = 5.10; /* double decimal number onlu */
        char grade = 'A'; /* single character " use single quotes " */
        boolean student = true; 

/* here aslo we can chnage the value of any avrianble  later on ,  */

        age = 22;
        grade = 'B';   /* as you see i have made changes here , also you can chnage later on*/
        name = " baby ";
       
        int marks = 50;
System.out.println(marks);

marks = 95;   /* we can also reaasign the variables */

System.out.println(marks);
int a = 10;

int b = a;  /* we can also copying variables */



int c = 2;  
int d = 3;
int sum = c+d;

  System.out.println(sum);


System.out.println(b);
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(grade);
        System.out.println(student);



    }

}

/* Primitive Data Types
│
├── Integer Types
│     ├── byte
│     ├── short
│     ├── int ⭐
│     └── long
│
├── Decimal Types
│     ├── float
│     └── double ⭐
│
└── Other Types
      ├── char ⭐
      └── boolean ⭐ */

      /*Non-Primitive
│
├── String ⭐
├── Arrays ⭐
├── Classes ⭐
├── Objects ⭐
├── Interfaces
├── ArrayList
├── LinkedList
├── HashMap
└── etc. */

/* just for the practise  */
/* 
There are 3 main types of variables in Java:
Variables
│
├── 1. Local Variable
├── 2. Instance Variable
└── 3. Static / Class Variable

1. Local Variable
A variable declared inside a method, constructor, or block is called a local variable.
public class Main {

    public static void main(String[] args) {

        int age = 21;   // local variable

        System.out.println(age);
    }
}
Here:
int age = 21;
is a local variable because it is declared inside main().
A local variable can only be accessed within the block where it is declared.
public static void main(String[] args) {

    int age = 21;

    System.out.println(age);  // ✅


    Important point
Local variables do not get default values.


2. Instance Variable
An instance variable is declared inside a class but outside methods, constructors, and blocks, and without static.
Example:
class Student {

    String name;
    int age;

}
Here:
String name;
int age;
are instance variables.
Why "instance"?
Because every object/instance of the class gets its own copy.
For example:
class Student {

    String name;
    int age;
}
Create two objects:
Student s1 = new Student();
Student s2 = new Student();
Assign values:
s1.name = "Ashray";
s1.age = 21;

s2.name = "Rahul";
s2.age = 22;
Now:
s1
name → Ashray
age  → 21

s2
name → Rahul
age  → 22
They have separate copies of the instance variables.

3. Static Variable / Class Variable
A variable declared inside a class with the static keyword is called a static variable.
Example:
class Student {

    String name;
    int age;

    static String college = "ABC College";
}
Here:
static String college = "ABC College";
is a static variable.
It's also called a class variable.
Why?
Because it belongs to the class, rather than to each individual object.
Suppose:
Student s1 = new Student();
Student s2 = new Student();
Both objects can access:
Student.college
and it refers to the same class-level variable.

Type Conversion vs Type Casting
Dono ka basic kaam hai:
Ek data type ke value ko doosre data type mein convert karna.

Lekin conversion automatic ho sakta hai, 
jabki casting generally explicitly karni padti hai.

1. Type Conversion
Jab Java automatically ek compatible data type ko doosre data type mein convert karta hai, use type conversion kehte hain.
int x = 10;

double y = x;

System.out.println(y);
Output:
10.0
Why is it safe?
double int se zyada range/precision support karta hai, so Java generally allows this automatically.

2. Type Casting
Jab hum manually/explicitly ek type ko doosre type mein convert karte hain, use type casting kehte hain.
Example:
double x = 10.99;

int y = (int) x;

System.out.println(y);
Output:
10
Here:
(int)
is the cast.
We are explicitly telling Java:
"Mujhe is double ko int banana hai."

Main Difference
TYPE CONVERSION
↓
Automatic
↓
Usually widening
↓
int → double


TYPE CASTING
↓
Explicit
↓
Usually narrowing
↓
double → int

3. Widening Conversion
Smaller compatible type → larger type.
Q4. What is widening conversion?
Answer:
Converting a smaller compatible numeric type into a larger compatible numeric type.
Example:
int x = 100;
double y = x;
Java performs this automatically.

4. Narrowing Casting
Larger type → smaller type.
double x = 10.99;
Q5. What is narrowing conversion?
Answer:
Converting a larger numeric type into a smaller numeric type.
Example:
double x = 100.5;
int y = (int)x;
It requires explicit casting and may result in loss of information.

int y = (int) x;
*/