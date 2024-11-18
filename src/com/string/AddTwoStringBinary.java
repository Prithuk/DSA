package com.string;

public class AddTwoStringBinary {
    public static void main(String[] args) {
        String x = "10";
        String y = "01";
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int i = x.length() - 1;
        int j = y.length() - 1;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += x.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += y.charAt(j) - '0';
            }
            if (sum == 0 || sum == 1) {
                result.append(sum);
                carry = 0;
            }
            else if (sum == 2) {
                result.append("0");
                carry = 1;
            }
            else {
                result.append("1");
                carry = 1;
            }
            i--;
            j--;
        }
        if (carry == 1) {
            result.append("1");
        }

        System.out.println(result.reverse().toString());




    }
}
