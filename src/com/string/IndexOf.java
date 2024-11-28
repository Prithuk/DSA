package com.string;

import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value just 0 and 1");
        int a = sc.nextInt();
        System.out.println("Enter value  b just 0 and 1");
        int b = sc.nextInt();
        if((a>1 || a<0) || (b>1 ||  b<0)){
            System.out.println("Invalid integer");
        } else{
            System.out.println("The value you have entered is:"+ a +" "+ b);
        }
    }
}
