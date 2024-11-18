package com.string;

public class Concat {
    public static void main(String[] args) {
        String s1 = "Prithu";
        String s2 = "Kathet";
//        s1.concat("def");
        s1.concat(s2);
        System.out.println(s1);

        String str = "abc";
        str ="def";
        System.out.println(str);
        str = str+'c' ;
        System.out.println(str);
        str = str + 10;
        System.out.println(str);
        int a = 10;
        String data = Integer.toString(a);
        String data1 = "" + a;
        String data2 = String.valueOf(a);



    }
}
