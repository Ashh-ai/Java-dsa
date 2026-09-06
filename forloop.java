// ============================================================
// JAVA LOOPS + PRACTICE
// ============================================================


// 1. FOR LOOP
//
// Interview answer:
// A for loop is a control-flow statement used to repeatedly
// execute a block of code as long as a specified condition is true.
//
// for (initialization; condition; updation) {
//     // code
// }


// Example of for loop:
//
// class ForLoop {
//     public static void main(String[] args) {
//
//         for (int i = 0; i <= 5; i++) {
//             System.out.println(i);
//         }
//
//     }
// }


// ============================================================
// FOR vs WHILE
//
// Interview answer:
// Both are looping statements.
// A for loop is generally preferred when initialization,
// condition, and update are closely related or the iteration
// pattern is known.
//
// A while loop is generally useful when repetition depends
// primarily on a condition.
// ============================================================


// ============================================================
// 2. DO-WHILE LOOP
//
// A do-while loop executes the loop body first and checks
// the condition afterward.
// Therefore, it executes at least once.
//
// Syntax:
//
// do {
//     // do something
// } while (condition);
// ============================================================


class DoWhile {

    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println("hello");
            i++;
        } while (i <= 5);

    }
}


// ============================================================
// BREAK STATEMENT
//
// break statement is used to exit the loop.
// ============================================================


// ============================================================
// 3. PRINT REVERSE OF THE NUMBER
//
// n = 29039
//
// Output:
// 9 3 0 9 2
// ============================================================


class Reverse {

    public static void main(String[] args) {

        int n = 29039;

        while (n > 0) {

            int lastdigit = n % 10;

            // % 10 gives the last digit
            System.out.print(lastdigit + " ");

            // / 10 removes the last digit
            n = n / 10;
        }

        System.out.println();
    }
}


// ============================================================
// 4. REVERSE THE GIVEN NUMBER
//
// n = 10899
//
// Output:
// 99801
// ============================================================


class Practice {

    public static void main(String[] args) {

        int n = 10899;

        // Variable to store the reversed number
        int rev = 0;

        while (n > 0) {

            // Get the last digit
            int lastdigit = n % 10;

            // Add the last digit to reversed number
            rev = (rev * 10) + lastdigit;

            // Remove the last digit from n
            n = n / 10;
        }

        // Print reversed number
        System.out.println(rev);
    }
}


// ============================================================
// 5. FACTORIAL OF A NUMBER
//
// 4! = 4 × 3 × 2 × 1
//
// 4! = 24
// ============================================================


class Fact {

    public static void main(String[] args) {

        int n = 4;

        int p = 1;

        for (int f = 1; f <= n; f++) {

            p = f * p;
        }

        System.out.println("Factorial = " + p);
    }
}