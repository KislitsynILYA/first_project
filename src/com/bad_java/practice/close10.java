package com.bad_java.practice;

public class close10 {
    public static void main(String[] args) {
        int a = 8; // commit #2
        int b = 13;
        int res = Fun(a,b);
        System.out.println(res);
    }

    public  static int Fun (int a, int b){
       if (Math.abs(10 - a) < Math.abs(10 - b))
           return a;
        if (Math.abs(10 - b) < Math.abs(10 - a))
            return b;
        else return 0;

    }
}
