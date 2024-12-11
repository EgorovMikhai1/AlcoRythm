package org.example._11_12_2024;

public class Go {
    static int counter = 0;

    public int way(int n, int m) {
        counter++;
        if (n < 1 || m < 1) {
            return 0;
        }

        if (n == 1 && m == 1) {
            return 1;
        }

        return way(n - 1, m) + way(n, m - 1);
    }

    public static void main(String[] args) {
        System.out.println(new Go().way(22, 11));
        System.out.println("MOVE: " + counter);
    }
}