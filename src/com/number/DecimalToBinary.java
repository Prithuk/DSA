package com.number;

public class DecimalToBinary {

    public static void main(String[] args) {
        int decimal = 50;
        int temp = decimal;
        int remainder=0;
        StringBuilder sb = new StringBuilder();
        while (temp >= 2) {
            remainder= temp % 2;
            sb.append(remainder);
            temp = temp /2 ;
        }
        sb.append(temp);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
