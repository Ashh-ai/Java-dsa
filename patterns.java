public class patterns{



public static void main(String[] args) {

    for ( int line = 1 ; line <= 4 ; line ++ ){  // outer loop is for rows = lines 
        for( int star = 1 ; star <= line ; star ++ ){  // inner loop is used for to control columns and items.

            System.out.print("*");
        }
        System.out.println();
    }
    for ( int l = 1  ; l <= 4 ; l ++ ){
    for(int j = 1 ; j <= 5 - l; j++ ){
        System.out.print("*");
    
   


    }
    System.out.println();
}
}    
}





