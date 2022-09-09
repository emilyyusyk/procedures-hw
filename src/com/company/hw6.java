package com.company;

public class hw6 {

    public static void main (String[] args) {
        int [] ex = {9, 7, 5, 3, 1, 2, 4, 6, 8};
        int [] l = alternate (ex);

        for (int v : l)
            System.out.print (v + " ");
    }

    static int [] alternate (int [] a) {
        int [] altered = new int [a.length];
        int f = 0;
        for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
            altered [f] = a [i];
            if (i != j) {
                altered [f + 1] = a [j];
                f = f + 2;
            }
        }
        return altered;
    }
}
