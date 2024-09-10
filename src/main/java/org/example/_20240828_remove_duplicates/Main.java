package org.example._20240828_remove_duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int postIndex = 0;
        List<Integer> validIndexes = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[postIndex]) {
                validIndexes.add(i);
            }
            postIndex++;
        }

        int index = 1;
        for (int validIndex : validIndexes) {
            nums[index] = nums[validIndex];
            index++;
        }
        int validLength = validIndexes.size() + 1;
        System.out.println("validLength = " + validLength);
        System.out.println("nums = " + Arrays.toString(nums));
    }
}
