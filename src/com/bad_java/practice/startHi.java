package com.bad_java.practice;

public class startHi {
    public static void main(String[] args) {
        String str = "hissss";
        boolean res = Fun(str);
        System.out.println(res);
    }

    public static boolean Fun(String str){
        if (str.length()>=2){
            if (str.substring(0,2).equals("hi"))
                return true;
            else
                return false;
        }
        else return false;
    }
}
