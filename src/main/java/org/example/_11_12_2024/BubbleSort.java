package org.example._11_12_2024;

public class BubbleSort {

    public static void bubbleSortOpt(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int[] getArr() {
        int n = 100_000_000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        int[] arrOO = getArr();

        long bsStartTime = System.currentTimeMillis();
        bubbleSortOpt(arr);
        long bsEndTime = System.currentTimeMillis();
        System.out.println("BS: " + (bsEndTime - bsStartTime));

        long bsOOStartTime = System.currentTimeMillis();
        bubbleSortOpt(arrOO);
        long bsOOEndTime = System.currentTimeMillis();
        System.out.println("BS OO: " + (bsOOEndTime - bsOOStartTime));
    }
}
