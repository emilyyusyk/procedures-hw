package com.company;

public class hw7 {

    public static void main(String[] args) {
        hundred_primes ();
    }

    // 7.1
    static boolean prime (int n) {
        if (n == 2 || n == 3)
            return true;
        else if (n % 2 == 0 || n % 3 == 0)
            return false;
        else
            for (int i = 5; i <= Math.sqrt(n); i = i + 2)
                if (n % i == 0)
                    return false;
        return true;
    }

    // 7.2
    static void primes_smaller_than_100 () {
        for (int i = 2; i < 100; i++)
            if (prime (i))
                System.out.print (i + " ");
    }

    // 7.3
    static void hundred_primes () {
        primes_smaller_than_100();
        for (int i = 100, counter = 0; counter < 75; i++)
            if (prime (i)) {
                System.out.print (i + " ");
                counter++;
            }
    }
}
