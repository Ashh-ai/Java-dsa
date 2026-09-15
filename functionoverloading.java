                       //🔥 Function/Method Overloading in Java


// Simple definition — interview ready
// Method overloading means having multiple methods with the same name but different parameters in the same class.

// Matlab method ka naam same, but usko call karne ke liye parameters different hone chahiye.
//FUNCTION OVERLOADING DEPENDS ON PARAMETERS NOT ON RETURN TYPE.


                              // example  OF FUNCTION OVERLOADING WITH PARAMETERS 

class functionoverloading {

    // static int add(int a, int b) {
    //     return a + b;
    // }

    // static int add(int a, int b, int c) {
    //     return a + b + c;
    // }
    //                                   //   FUNCTION OVERLOADING USING DATA TYPE 
    // static double add ( double k , double l){
    //     return k + l ;
    // }
    
    // static float add ( float v, float n ){

    //     return  v + n; 
    // }
// abhi yha mai int firse likh deta fir ye duplicate hoata 

    // //  BINARY TO DECIMAL CONVERSION
    // public static void bintodec (int binNum){
    //     int mynum = binNum;
    //     int pow = 0;
    //     int decNum = 0;
    //     while(binNum > 0 ){
    //     int lastdigit =  binNum % 10 ; 
    //     decNum = decNum+(lastdigit * (int)Math.pow(2, pow));

    //     pow++;
    //     binNum =binNum / 10;
    // }
    // System.out.println("decimal of "+ mynum + " = "  + decNum );   


    // Decimal to binary convertion
public static void dectobin (int n){
    int mynum = n;
    int pow = 0 ;
    int binNum = 0;
   while ( n >  0 ){
    int rem = n % 2;
     binNum  = binNum * ( rem*(int) Math.pow(10,pow));
    pow++;
    n = n/2;  // this for the quetient 
      
   }
    System.out.println("binary formof "+ mynum + " =" + binNum );

}

    public static void main(String[] args) {

        // System.out.println(add(10, 20));
        // System.out.println(add(10, 20, 30));
        // System.out.println(add(4.6,6.5));
        // System.out.println(add(4,5));
        // bintodec(111);
dectobin(7);
    }
}


// 1. Method Scope
// A variable declared inside a method (but not inside any inner block) has method scope.
// It can be used anywhere in that method after its declaration, but not outside the method.
 