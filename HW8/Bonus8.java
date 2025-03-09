public class Bonus8 {
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(fizzBuzz(1, 6)));
        System.out.println(java.util.Arrays.toString(fizzBuzz(1, 8)));
        System.out.println(java.util.Arrays.toString(fizzBuzz(1, 11)));

        // Простий позитивний тест: загальний випадок, коли в масиві є і парні, і непарні числа.
        int[] input1 = {1, 0, 1, 0, 0, 1, 1};
        int[] expected1 = {0, 0, 0, 1, 1, 1, 1};
        int[] result1 = separateEvenOdd(input1);
        System.out.println("Test 1 (General case): "
                + java.util.Arrays.toString(result1)
                + " Expected: "
                + java.util.Arrays.toString(expected1));

        // Простий позитивний тест, що містить тільки непарні числа.
        int[] input2 = {3, 5, 7};
        int[] expected2 = {3, 5, 7};
        int[] result2 = separateEvenOdd(input2);
        System.out.println("Test 2 (Only odd numbers): "
                + java.util.Arrays.toString(result2)
                + " Expected: "
                + java.util.Arrays.toString(expected2));

        // Простий позитивний тест, що містить тільки парні числа.
        int[] input3 = {2, 4, 6};
        int[] expected3 = {2, 4, 6};
        int[] result3 = separateEvenOdd(input3);
        System.out.println("Test 3 (Only even numbers): "
                + java.util.Arrays.toString(result3)
                + " Expected: "
                + java.util.Arrays.toString(expected3));
    }

    public static int[] separateEvenOdd(int[] nums) {

        int[] result = new int[nums.length];
        int index = 0;

        // Спочатку додаємо парні числа
        for (int num : nums) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        // Потім додаємо непарні числа
        for (int num : nums) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }
        return result;

    }

    public static String[] fizzBuzz(int start, int end) {
        int size = end - start;         // Визначаємо розмір масиву
        String[] result = new String[size];

        for (int i = start, index = 0; i < end; i++, index++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[index] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[index] = "Fizz";
            } else if (i % 5 == 0) {
                result[index] = "Buzz";
            } else {
                result[index] = String.valueOf(i);
            }
        }
        return result;
    }
}
