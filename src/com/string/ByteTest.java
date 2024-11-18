package com.string;

import java.util.Arrays;

public class ByteTest {

    public static void main(String[] args) {

        byte []  b= {65,66,67};

        String s = new String(b);
        System.out.println(s);


        short []  data= {65,66,67};
        String s1 = new String(Arrays.toString(data));
        System.out.println(s1);
    }
}
