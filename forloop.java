
// 1. for loop kya hai?
// Interview answer:
// A for loop is a control-flow statement used to repeatedly execute a block of code
//  as long as a specified condition is true.
// 18. 🔥 for vs while
// Interview answer:
// Both are looping statements. A for loop is generally preferred when initialization, condition, and update are closely related or the iteration pattern is known. 
// A while loop is generally useful when repetition depends primarily on a condition.

// public class forloop{
//     public static void main (String args []){
//         // for ( initialization ; condition; updation){}
//     for ( int i = 0 ; i <= 5 ; i ++){
//         System.out.println(i);
//     }
 
//     }
    
// }


// // PRINT THE RESVERSE OF THE NUMBER 
// // n = 1060
// class reverse{
//     public ststic main void( String args []);
//     for( int i = )
// }





// do while loop

// A do-while loop executes the loop body first and checks the condition afterward.
//  Therefore, it executes at least once.
// do {
//     // dosomthing 
// } while condition;

class dowhile {
    public static void main ( String args []){
       int  i = 1;
        do {
            System.out.println("hello");
            i ++;
        } while( i <= 5 );
   }
}

// BREAK STATREMENT IS USED TO EXITTHEW LOOP 


// Q3 print reverse of the number 
class reverse{
    public static void main( String [] args){
int n = 29039;

while ( n > 0 ){
    int lastdigit = n % 10;     // ye last digit ko lane kjeliye % iska use hota hai 
    System.out.print(lastdigit + " ");
     n = n / 10;                 // and here to remove last digit / iska suse hota hai 

}
System.out.println();
    }

}


// Q5 reverse the given number 
class practise {
    public static void main ( String [] args ){
int n = 10899;
int rev = 0; // dekho ismeek var leliya jisnme valkue store krani hai 

while( n > 0)  { // ye loop calega jab tak 0 na hojaye n 
int lastdigit =  n % 10 ; // fir ek ek krke last digit leni hogi fir age use rev mai daldenge 
rev = ( rev * 10 ) + lastdigit; // rev jo bnaya hai usme rev * 10 plus krdenge lastdigit jo niklenge n maise 
n = n / 10; // fir bs n ko update n ko 0 krbe keloie 

}

System.out.print(rev); // rev mai bhara hai toih print karvadenge 

    }
}
