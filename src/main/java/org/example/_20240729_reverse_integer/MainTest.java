package org.example._20240729_reverse_integer;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {

    }

    public int reverse(int x){
        try {

        } catch (NumberFormatException numberFormatException) {
            return 0;
        }
        int sign = 1;
        if (x < 0) {
            sign = -1;
        }

        int absValue = Math.abs(x);
        String digits = Integer.toString(absValue, 10);
        StringBuilder stringBuilder = new StringBuilder(30);
        for (int i = digits.length()-1; i >= 0; i--) {
            char digit = digits.charAt(i);
            stringBuilder.append(digit);
        }
        return sign*Integer.parseInt(stringBuilder.toString());
    }
}
