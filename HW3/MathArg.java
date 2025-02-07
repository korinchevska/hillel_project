import java.util.Scanner;

public class MathArg {


    public static void main(String[] args) {
        int numKvadrat = Integer.parseInt(args [0]);
        squareNumber(numKvadrat);

        double numRadius = Double.parseDouble(args [1]);
        double numHeight = Double.parseDouble(args [2]);
        cylinderVolume(numRadius, numHeight);

        int numA = Integer.parseInt(args [3]);
        int numB = Integer.parseInt(args [4]);
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
