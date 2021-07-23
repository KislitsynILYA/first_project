package com.bad_java.practice;

public class StringE {
    public static void main(String[] args) {
        String str = "hello";
        boolean res = Fun(str);
        System.out.println(res);
    }

    public static boolean Fun (String str){
        int e = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'e')
            e++;
        }
        if (e >=1 && e<=3)
            return true;
        else
            return false;
    }
}
