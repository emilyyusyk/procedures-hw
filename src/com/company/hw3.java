package com.company;

public class hw3 {

    public static void main (String[] args) {
        int[] r = {6, 23, -1, -13, 7};
        int[] s = {4, 5, 1, 13, 7};
        System.out.println(any(r, s));
    }

    // 3.1
    static boolean contains (int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i])
                return true;
        }
        return false;
    }

    // 3.2
    static boolean any (int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (contains (b, a [i]))
                return true;
        }
        return false;
    }
}
