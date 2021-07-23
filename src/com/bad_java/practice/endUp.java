package com.bad_java.practice;

public class endUp {
    public static void main(String[] args) {
        String str = "hello";
        String res = Fun(str);
        System.out.println(res);
    }

        public static String Fun(String str) {
            //return new StringBuilder(str).reverse().toString();
            str = new StringBuilder(str).reverse().toString();
            if (str.length() >= 3){
                str = str.substring(0,3).toUpperCase() + str.substring(3);
                return str = new StringBuilder(str).reverse().toString();
            }
            else{
                str = str.toUpperCase();
                return str = new StringBuilder(str).reverse().toString();
            }
        }
}
