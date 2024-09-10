package org.example._20240826_longest_common_prefix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String[] words = new String[]{"flower", "flow", "flight"};
//        String[] words = new String[]{"dog", "racecar", "car"};
        String[] words = new String[]{"technically", "technic", "technology", "technical"};
        String minLengthWord = Arrays.stream(words).max((a, b) -> b.length() - a.length()).get();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < minLengthWord.length(); i++) {
            final int index = i;
            boolean isAllMatched = Arrays.stream(words).allMatch(word -> word.charAt(index) == minLengthWord.charAt(index));
            if (isAllMatched) {
                stringBuilder.append(minLengthWord.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }
}
