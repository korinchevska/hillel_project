import java.util.Scanner;

public class Bonus {
    public static int countDifferencesWithin2(int[] nums1, int[] nums2) {
        if (nums1.length != nums2.length) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff > 0 && diff <= 2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Тесты
        System.out.println(countDifferencesWithin2(new int[]{} , new int[]{})); // 0
        System.out.println(countDifferencesWithin2(new int[]{3}, new int[]{5})); // 1
        System.out.println(countDifferencesWithin2(new int[]{1, 2, 3}, new int[]{1, 2, 3})); // 0
        System.out.println(countDifferencesWithin2(new int[]{1, 5, 9}, new int[]{4, 8, 12})); // 0
        System.out.println(countDifferencesWithin2(new int[]{1, 3, 5, 7}, new int[]{2, 5, 7, 9})); // 2
    }
}
