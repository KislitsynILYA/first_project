package com.bad_java.practice;

public class max1020 {
    public static void main(String[] args) {
        int a = 11;
        int b = 19;
        int res = max1020(a,b);
        System.out.println(res);
    }
    public static int max1020(int a, int b) {
        if (b>a){
            int temp = a;
            a = b;
            b = temp;
        }

        if (a>=10 && a<=20) return a;
        if (b>=10 && b<=20) return b;
        return 0;
    }
}
