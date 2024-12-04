package org.example._04_12_2024;

public class FibClassic {
    private static int findFibonacci(int index) {
        int result = 0;
        int first = 0;
        int second = 1;

        for (int i = 0; i < index; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}

class FibRec {
    private static int findFibonacciRec(int index) {
        if(index == 0) {
            return 0;
        }

        if(index == 1) {
            return 1;
        }

        return findFibonacciRec(index - 1) + findFibonacciRec(index - 2);
    }
}