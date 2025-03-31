package HW4;

public class MathThree {

    public static void main(String[] args ) {
        System.out.println("Квадрат числа дорівнює " + squareNumber(5));

        //System.out.println("Об'єм циліндра з радіусом " + cylinderVolume(3.5) + " і висотою " +  cylinderVolume(10)+ " дорівнює " + volumeCylinder + ".");
        System.out.println("Об'єм циліндра з радіусом  і висотою дорівнює " + cylinderVolume(3.5, 10));

        //System.out.println("Результат  " + numberDegree(args[0]) + "^" + numberDegree(2, args[1]) + " дорівнює " + result + ".");
        System.out.println("Результат  дорівнює " +  numberDegree(2, 3));
    }
    public static int  squareNumber(int numKvadrat) {
        int squareResult = numKvadrat * numKvadrat;
        return squareResult;
    }

    public static double cylinderVolume(double numRadius, double numHeight) {
        double volumeCylinder = java.lang.Math.PI * java.lang.Math.pow(numRadius, 2) * numHeight;
        return volumeCylinder;
    }

    public static double numberDegree(int numA, int numB) {
        double result = java.lang.Math.pow(numA, numB);
        return result;
    }
}