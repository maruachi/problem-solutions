package org.example._20240831_study_word;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String toUpperCase = input.toUpperCase();

        int[] freq = new int[26];
        for (int i = 0; i < toUpperCase.length(); i++) {
            char ch = toUpperCase.charAt(i);
            int index = ch - 65;
            freq[index] += 1;
        }

        OptionalInt max = Arrays.stream(freq).max();
        int maxValue = max.getAsInt();
        int maxIndex = -1;
        int maxCount = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxValue) {
                maxIndex = i;
                maxCount++;
            }
        }

        if (maxCount == 1) {
            System.out.println((char) (65+maxIndex));
        } else {
            System.out.println("?");
        }
    }
}
