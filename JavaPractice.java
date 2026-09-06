public class JavaPractice {

    // Factorial method
    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Binomial coefficient method
    public static int binomialCoefficient(int n, int r) {
        if (r < 0 || r > n) {
            return 0;
        }
        //bionomail cofficient

        int factN = factorial(n);
        int factR = factorial(r);
        int factNMinusR = factorial(n - r);

        return factN / (factR * factNMinusR);
    }

    // Method overloading: two int parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Method overloading: three int parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method overloading: two double parameters
    public static double add(double a, double b) {
        return a + b;
    }

    // Prime-checking method
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Print prime numbers from 1 to n
    public static void printPrimesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Binomial coefficient
        System.out.println("5C2 = " + binomialCoefficient(5, 2));

        // Function overloading
        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 4));
        System.out.println(add(2.5, 3.5));

        // Prime check
        System.out.println("Is 5 prime? " + isPrime(5));

        // Prime numbers from 1 to 300
        printPrimesInRange(300);
    }
}