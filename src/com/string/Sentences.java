package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentences {

    public static void main(String[] args) {

        String s1 = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis partu sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore ver rup. Li Europan lingues es membres del sam familie. Lor separat existentie es un myth. Por scientie, musica, sport etc, litot Europa.";
        List<String> segments = segments(s1);
        System.out.println(segments);
    }


    public static List<String> segments(String message) {
        if (message.length() <= 160) {
            return Arrays.asList(message);
        }

//        int maxSegments = 9; // maximum segments allowed as per the question
        List<String> segments = new ArrayList<>();
        String[] words = message.split(" ");
        StringBuilder sb = new StringBuilder();
        int segmentLength = 160;

        for (String word : words) {
            if (sb.length() + word.length() + 1 > segmentLength - ("(1/9)").length()) {
                // Add current segment to the list when it exceeds the limit
                segments.add(sb.toString().trim());
                sb.setLength(0); // Reset StringBuilder
            }
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(word);
        }

        // Add the last segment if not empty
        if (sb.length() > 0) {
            segments.add(sb.toString().trim());
        }

        List<String> finalResult = new ArrayList<>();
        for (int i = 0; i < segments.size(); i++) {
            String formattedSegment = segments.get(i) + " (" + (i + 1) + "/" + segments.size() + ")";
            finalResult.add(formattedSegment);
        }

        return finalResult;
    }

}