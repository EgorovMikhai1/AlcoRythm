package org.example._04_12_2024;

public class Prime1 {
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static boolean isPrimeOpt(int n) {
        if (n < 2) {
            return false;
        }

        if (n % 2 == 0) {
            return n == 2;
        }

        if (n % 3 == 0) {
            return n == 3;
        }

        for (int i = 5; i * i < n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 112;
        System.out.println(isPrime(n));
    }
}
