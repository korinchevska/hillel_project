package HW5;

import java.util.Scanner;
public class HomeWork5 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Виберіть номер задачі:");
        System.out.println("1 - Чи ти дорослий? \n2 - Квадрат числа \n3 - Числовий ряд \n4 - Оцінка студента \n5 - Просте число");
        int numTask = in.nextInt();

        switch (numTask){
            case (1):
                checkAge();
                break;
            case 2:
                squareNumber();
                break;
            case 3:
                numberLine();
                break;
            case 4:
                scorestudent();
                break;
            case 5:
                isPrimeNumber();

                break;
            default:
                System.out.println("Така задача відсутня");
        }
        }

    //1
    public static void checkAge() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть Ваш вік:");
        int age = in.nextInt();
    if (age >= 18) {
        System.out.println("Ви доросла особа");
    } else {
        System.out.println("Ви не є дорослою особою");
    }
    }
    //2
    public static void squareNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть число");
        int squareNum = in.nextInt();
        if (squareNum < 0)
        {
            System.out.println("Введіть число");
        } else
        {
            double result = Math.sqrt(squareNum);
            double round = Math.ceil(result);
            double pow = round*round;
            if (pow == squareNum){
                System.out.println("true - це квадрат цілого числа");
            } else {
                System.out.println("false - це не квадрат цілого числа");
            }
        }

    }
    //3
    public static void numberLine() {
         Scanner in = new Scanner(System.in);
         System.out.println("Введіть число:");
         int sumNumber = in.nextInt();
         if (sumNumber<=0){
             System.out.println("Хибні вхідні параметри");
         } else {
             int sum = 0;
             for (int i = 1; i <= sumNumber; i++) {
                 sum += i;
             }
             System.out.println(sum);
         }
    }
    //4
    public static void scorestudent() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть оцінку від 1 до 5:");
        int score = in.nextInt();
        switch (score) {
            case (1):
                System.out.println("Погано");
                break;
            case 2:
                System.out.println("Незадовільно");
                break;
            case 3:
                System.out.println("Задовільно");
                break;
            case 4:
                System.out.println("Добре");
                break;
            case 5:
                System.out.println("Відмінно");
                break;
            default:
                System.out.println("Неправильна оцінка");
        }
    }
    //5
    public static boolean isPrimeNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть число:");
        int number = in.nextInt();

        if (number < 2) {
            System.out.println("false");
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;


    }

        }

