import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {
        //ДЗ 8.1. Повернути кількість парних цілих чисел у заданому масиві
        int[] numbers = {1, 2, 3, 4, 5, 8};
        System.out.println("ДЗ 8.1 - " + countEvenInts(numbers));
        int[] numbers2 = {-10, -4, -2, -4, -2, 0};
        System.out.println("ДЗ 8.2 - " + centeredAverage(numbers2));
        int[] numbers3 = {1, 2, 2, 6, 99, 99, 7};
        System.out.println("ДЗ 8.3 - " + sumIgnoreSections(numbers3));
        int[] numbers4 = {1, 2, 2, 1, 13, 45};
        System.out.println("ДЗ 8.4 - " + sumWithoutUnlucky13(numbers4));
        int[] numbers5 = {3, 2, 10, 7, 2};
        System.out.println("ДЗ 8.5 - " + differenceLargestSmallest(numbers5));
        System.out.println("ДЗ 8.6 - " + doubleChars("Hi-There"));
        System.out.println("ДЗ 8.7 - " + countHi("ABChi hi"));
        System.out.println("ДЗ 8.8 - " + countCode("cozexxcopecopco1e"));
        System.out.println("ДЗ 8.9 - " + endsWith("AbC", "HiaBc"));
        System.out.println("ДЗ 8.1 - " + catDog("1cat1cadodog"));

    }
    //ДЗ 8.1. CatDog
    public static boolean catDog(String sstring){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i <= sstring.length() - 3; i++) {
            String sub = sstring.substring(i, i + 3);
            if (sub.equals("cat")) {
                count1++;
            }
            if (sub.equals("dog")) {
                count2++;
            }
        }
        return count1 == count2;
    }


    //ДЗ 8.9. Порівняння двох рядків
    public static boolean endsWith(String sstring, String sstring2){
        sstring = sstring.toLowerCase();
        sstring2 = sstring2.toLowerCase();
        return sstring.endsWith(sstring2) || sstring2.endsWith(sstring);
    }
    //ДЗ 8.8. Code
    public static int countCode(String sstring){
        int count = 0;
        for (int i = 0; i<sstring.length()-1; i++){
            if(sstring.substring(i,i+2).equals("co") && sstring.substring(i+3,i+4).equals("e")){
                count++;
            }
        }
        return count;
    }

    //ДЗ 8.7. Підрахувати кількость входжень підрядка "hi"
    public static int countHi(String sstring){
        int count = 0;
        for (int i = 0; i<sstring.length()-1; i++){
            if(sstring.substring(i,i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }
    //ДЗ 8.6. Повернути рядок, де кожен елемент дублюється
    public static String doubleChars(String sstring){
        String newStr = "";
        for(int i = 0; i < sstring.length(); i++) {
            newStr = newStr + sstring.charAt(i)+ sstring.charAt(i);
        }
        return newStr;
    }
    //ДЗ 8.5. Різниця між найбільшим і найменшим значеннями у масиві
    public static int differenceLargestSmallest(int[] numbers5){
        int min = numbers5[0];
        int max = numbers5[0];
        for (int i = 0; i < numbers5.length; i++) {
            if (numbers5[i] < min) {
                min = numbers5[i];
            }
            if (numbers5[i] > max) {
                max = numbers5[i];
            }
        }
        return max - min;
    }
    //ДЗ 8.4. Повернути суму чисел у масиві
    public static int sumWithoutUnlucky13(int[] numbers4) {
        int sum = 0;
        for (int num : numbers4) {
            if (num == 13) {
                break;
            }
            sum += num;
        }
        return sum;
    }
    //ДЗ 8.3. Повернути суму чисел у масиві оминаючи ділянки між 6 та 7
    public static int sumIgnoreSections(int[] numbers3) {
        int first = 6;
        int second = 7;
        int sum = 0;
        int index1 = -1, index2 = -1;
        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] == first && index1 == -1) {
                index1 = i;
            }
            if (numbers3[i] == second && index2 == -1) {
                index2 = i;
            }
        }
        for (int i = 0; i < index1; i++) {
            sum += numbers3[i];
        }
        for (int i = index2 + 1; i < numbers3.length; i++) {
            sum += numbers3[i];
        }
        return sum;
    }
    //ДЗ 8.2. Повернути "центроване" середнє значення масиву цілих чисел
    public static int centeredAverage(int[] numbers2) {
        int sum = 0;
        int min = numbers2[0];
        int max = numbers2[0];
        Arrays.sort(numbers2);
        for (int i = 1; i<numbers2.length-1; i++){
            sum += numbers2[i];
        }
        return sum / (numbers2.length - 2);
    }
    //ДЗ 8.1. Повернути кількість парних цілих чисел у заданому масиві
    public static int countEvenInts(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    }
    /*public static String countEvenIntus(String str) {
        if(str.length() >= 3){
            String word = str.substring(0, 3);
            return word + word + word;
        }
        return str + str + str;
    }
    public static String notString(String str) {
        if (str.startsWith("not"))
            return str;
        else
            return "not " + str;
    }*/


