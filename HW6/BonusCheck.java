public class BonusCheck {
    public static boolean checkAdjacentTwos(int[] nums) {
        boolean hasTwo = false;
        boolean twoIsAdjacent = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                hasTwo = true;
                if (i > 0 && nums[i - 1] == 2) twoIsAdjacent = true;
                if (i < nums.length - 1 && nums[i + 1] == 2) twoIsAdjacent = true;
            }
        }

        return !hasTwo || twoIsAdjacent;
    }

    public static void main(String[] args) {
        // System.out.println(leftShiftArray(new int[]{})); // 0
        System.out.println(checkAdjacentTwos(new int[]{2, 2, 2})); // Очікувано: true
        System.out.println(checkAdjacentTwos(new int[]{2, 1, 2})); // Очікувано: false
        System.out.println(checkAdjacentTwos(new int[]{2})); // Очікувано: false
        System.out.println(checkAdjacentTwos(new int[]{})); // Очікувано: true
        System.out.println(checkAdjacentTwos(new int[]{1, 3, 4, 5})); // Очікувано: true
        System.out.println(checkAdjacentTwos(new int[]{1, 2, 2, 3, 4, 2, 2})); // Очікувано: true
        System.out.println(checkAdjacentTwos(new int[]{2, 3, 2, 2, 5})); // Очікувано: false
    }
}