package com.character;

import java.util.*;

public class RealVanitySoln {

    public static void main(String[] args) {
        List<String> codes = Arrays.asList("TWLO", "CODE", "HTCH");
        List<String> numbers = Arrays.asList("+17474824380", "+14157088956", "+919810155555", "+15109926333", "+1415123456");

        List<String> result = vanity(codes, numbers);
        for (String phoneNumber : result) {
            System.out.println(phoneNumber);
        }

    }
    public static List<String> vanity(List<String> codes, List<String> numbers) {
        Map<Character, Integer> vMap = new HashMap<>();
        Set<String> extractedNumber = new HashSet<>();
        char ch = 'A';
        for (int i = 2; i < 10; i++) {
            int nums;
            if (i == 7 || i == 9) {
                nums = 4;
            } else {
                nums = 3;
            }
            for (int j = 0; j < nums; j++) {
                vMap.put(ch++, i);
            }
        }

        //extract numbers from codes and put it in sb
        for (String codeData : codes) {
            StringBuilder sb = new StringBuilder();
            //extract num from code
            char[] charCode = codeData.toCharArray();
            for (char v : charCode) {
                sb.append(vMap.get(v));
            }
            //for each vanity code match with num
            String str = sb.toString();
            for (String numData : numbers) {
                if (numData.contains(str)) {
                    extractedNumber.add(numData);
                }
            }
        }
        List<String> finalRsult = new ArrayList<>(extractedNumber);
        Collections.sort(finalRsult);
        return finalRsult;
    }
}
