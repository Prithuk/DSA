package com.array;

public class Sort0_1_2 {

    public static void main(String[] args) {

        int[] value = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 0, 1};
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < value.length; i++) {
            if (value[i] == 0) {
                count0++;
            } else if (value[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        for (int i = 0; i < count0; i++) {
            value[i] = 0;
        }

        for (int i = count0; i < count1+ count0; i++) {
            value[i] = 1;
        }

        for (int i = count1+ count0; i <count0+count1+count2 ; i++) {
            value[i] = 2;
        }

        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
    }
}
