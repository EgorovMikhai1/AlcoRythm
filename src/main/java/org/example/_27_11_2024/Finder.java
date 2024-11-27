package org.example._27_11_2024;

public class Finder {
    public static void main(String[] args) {
        int[] arr = {1, 4, 0, -3, -6, 44, 12, 13, -6};

        int k;
    }

    // O(n2)
    public int[] findSum1(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return null;
    }

    public int[] findSumSortedArray2(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];

            if (sum == k) {
                return new int[]{arr[l], arr[r]};
            }
            if (sum < k) {
                l++;
            }
            if (sum > k) {
                r--;
            }
        }
        return null;
    }
}
