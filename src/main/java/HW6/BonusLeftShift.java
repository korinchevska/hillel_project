package HW6;

import java.util.Arrays;

public class BonusLeftShift {
    public static int[] leftShiftArray(int[] nums) {

        // твій код тут
        if (nums.length == 0) return nums;
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }
    public static void main(String[] args) {
       // System.out.println(leftShiftArray(new int[]{})); // 0
        System.out.println(java.util.Arrays.toString(leftShiftArray(new int[]{6, 2, 5, 3}))); // Очікувано: [2, 5, 3, 6]
        System.out.println(java.util.Arrays.toString(leftShiftArray(new int[]{}))); // Очікувано: []
        System.out.println(java.util.Arrays.toString(leftShiftArray(new int[]{1}))); // Очікувано: [1]
        System.out.println(java.util.Arrays.toString(leftShiftArray(new int[]{7, 9}))); // Очікувано: [9, 7]
    }
}
