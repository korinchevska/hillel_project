package HW4;

import java.util.Scanner;

public class Math {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int numKvadrat = in.nextInt();
        squareNumber(numKvadrat);

        System.out.print("Введіть радіус: ");
        double numRadius = in.nextDouble();
        System.out.print("Введіть висоту: ");
        double numHeight = in.nextDouble();
        cylinderVolume(numRadius, numHeight);

        System.out.print("Введіть a: ");
        int numA = in.nextInt();
        System.out.print("Введіть b: ");
        int numB = in.nextInt();
        numberDegree(numA, numB);
    }

    public static void squareNumber(int numKvadrat) {
        System.out.println("Квадрат числа " + numKvadrat +" дорівнює " + numKvadrat * numKvadrat + ".");
    }

    public static double cylinderVolume(double numRadius, double numHeight) {
        double volumeCylinder = java.lang.Math.PI * java.lang.Math.pow(numRadius, 2) * numHeight;
        System.out.println("Об'єм циліндра з радіусом " + numRadius + " і висотою " +  numHeight + " дорівнює " + volumeCylinder + ".");
        return volumeCylinder;
    }

    public static double numberDegree(int numA, int numB) {
        double result = java.lang.Math.pow(numA, numB);
        System.out.println("Результат  " + numA + "^" + numB + " дорівнює " + result + ".");
        return result;
    }
}