package org.example._04_12_2024;

public class Rec2 {
    public static int power(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    public static int powerRec(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return base * powerRec(base, exponent - 1);
    }
}