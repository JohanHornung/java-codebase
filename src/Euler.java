// https://projecteuler.net/
public class Euler {
    public static void main(String[] args) {
        // System.out.println(sumMultiples(1000));
        // System.out.println(evenFibNumbers(4_000_000));
        // System.out.println(largestPrimeFactor(600851475143l));
        System.out.println(smallestMultiple());
    }

    // Euler Problem 1
    public static int sumMultiples(int limit) {
        int sum = 0;
        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        return sum;
    };
    // Euler Problem 2
    public static int evenFibNumbers(int n) {
        if (n < 1) return 0;
        int sum = 0;
        // Starting with 1 and 2
        int a = 1;
        int b = 2;
        int temp = 0;
        
        while (b <= n) {
            temp = a + b;
            a = b;
            b = temp;
            if (b % 2 == 0) sum += b;
        }
        return sum;
        // int[] fibNumbers = new int[n];
        // // Generating first terms of fibonacci sequence which do not exceed n
        // fibNumbers[0] = 1;
        // fibNumbers[1] = 2;
        // for (int i = 2; i < n; i++) {
        //     // setting up buffer to check if n is exceeded
        //     int fib = fibNumbers[i - 1] + fibNumbers[i - 2];
        //     if (fib > n) break;
        //     fibNumbers[i] = fib;
        // }
        // // looping through each term and add it to sum if even
        // for (int fibNumber : fibNumbers) {
        //     if (fibNumber == 0) break; // all the numbers after this one will be null
        //     if (fibNumber % 2 == 0) sum += fibNumber;
        };
        // return sum;
    
    // Euler Problem 3
    public static long largestPrimeFactor(long n) {
        if (n <= 1) return 0;
        
        long div = 2;
        while (div < n) {
            if (n % div != 0) div++;
            else {
                n /= div;
                div = 2;
            }
        }; 
        return n;
    };
    // Euler Problem 5 (still doesnt work)
    // public static double smallestMultiple() {
    //     double n = 0;
    //     for (double i = 2520; i < Double.MAX_VALUE; i++) {
    //         for (int j = 1; j <= 20; j++) {
    //             if (!(i % j == 0)) break;
    //         }
    //         System.out.println(i);
    //     }
    //     return n;
    }
}
