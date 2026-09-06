public class methodsquestion {
    // find the product of a abd b

    public static int multiply (int a , int b ){
         
         int product = a * b ;
         return product;
    }
// factorialof a number
public static int fact(int n){
    int f = 1;
    for ( int i = 1; i<= n ; i++){   
        // This is the logic. 
        f = f * i ;
    }  
    return f ;
}

    
public static void main(String args []){
System.out.println(multiply (5, 4));
System.out.println(fact(5));


}


    }


// factorialof a number

