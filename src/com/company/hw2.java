package com.company;

public class hw2 {

    public static void main (String[] args) {
        sumUpTo20();
    }

    // 2.1
    static int sumUpTo (int n) {
        return ((n * (n + 1)) / 2);
    }

    // 2.2
    static void sumUpTo20() {
        for (int n = 1; n <= 20; n++)
            System.out.print(sumUpTo(n) + " ");
    }
}
