package com.company;

public class hw4 {

    public static void main (String[] args) {
        int [] t = {26, -1, 92, 34, -67, 8};
        int [] t2 = {26, -1, 92, 34, -67, 8};
        int [] t3 = {8, -67, 4, -6, 8};
        int[] l = reverse (t);

        for (int v : l)
            System.out.print (v + " ");
        System.out.println ();

        System.out.println (equal (t, t2));

        System.out.println (palindrome (t3));
    }

    // 4.1
    static int [] reverse(int[] a) {
        int [] reversed = new int[a.length];
        for (int i = 0; i < a.length; i++)
            reversed[i] = a[a.length - 1 - i];
        return reversed;
    }

    // 4.2
    static boolean equal (int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        else
            for (int i = 0; i < a.length; i++)
                if (a[i] != b[i])
                    return false;
        return true;
    }

    // 4.3
    static boolean palindrome (int [] a) {
        int [] b = reverse (a);
        if (equal (a, b))
            return true;
        else
            return false;
    }
}
