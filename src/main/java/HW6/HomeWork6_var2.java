package HW6;

import java.util.Scanner;

public class HomeWork6_var2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть кількість елементів масиву: ");
        int size = in.nextInt();
        int[] numbers = new int[size];
        System.out.print("Введіть масив (через пробіл): ");
        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();
        }

        System.out.println("Середнє значення массиву дорівнює " + averageValue(numbers));
        System.out.println("Максимальний елемент массиву дорівнює " + maxValue(numbers));
        System.out.println("Мінімальний елемент массиву дорівнює " + minValue(numbers));
        reverseOrder(numbers);
        System.out.println("Введіть число для перевірки його у наявності:");
        int numb = in.nextInt();
        if (availabilityEnteredNumber(numbers, numb)) {
            System.out.println("Введене число " + numb + " є у масиві.");
        } else {
            System.out.println("Введене число " + numb + " відсутнє у масиві.");
        }
    }

    public static int averageValue(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        int averageSum = sum / numbers.length;
        return averageSum;
    }

    public static int maxValue(int[] numbers) {
        int maxVal = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxVal) {
                maxVal = numbers[i];
            }
        }
       return maxVal;
    }

    public static int minValue(int[] numbers) {
        int minVal = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minVal) {
                minVal = numbers[i];
            }
        }
        return minVal;

    }
    public static void reverseOrder(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
    public static boolean  availabilityEnteredNumber (int[] numbers, int numb){

        for (int num : numbers) {
            if (num == numb) {
                return true;
            }
        }
            return false;
        }
    }


