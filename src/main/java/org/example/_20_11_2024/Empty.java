package org.example;

public class Empty {

    public static void main(String[] args) {
        int[] nums = {23, 4, 53, 62, 345, 5, 0};
        System.out.println(findMin(nums));
    }

    private static int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}