package com.company;

public class hw5 {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 1, 4, 3, 2, 1};
        int b = 4;
        int [] c = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6};

        remove (a, b, c);
        for (int v : c)
            System.out.print (v + " ");
    }

    static void remove (int [] in, int x, int [] out) {
        int zeros = in.length - 1;
        for (int i = 0, o = 0; i < in.length; i++) {
            if (x == in [i]) {
                out[zeros] = 0;
                zeros--;
            }
            else {
                out [o] = in [i];
                o++;
            }
        }
    }
}
