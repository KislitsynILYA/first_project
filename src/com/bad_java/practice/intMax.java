package com.bad_java.practice;

public class intMax {
    public static void main(String[] args) {
        int a = 5;
        int c = 6;
        int b = 7;
        int res = intMax(a,b,c);
        System.out.println(res);
    }
    public static int intMax(int a, int b, int c) {
        if (a>b && a>c)
            return a;
        else if (b>a && b>c)
            return b;
        else
            return c;
    }
}
