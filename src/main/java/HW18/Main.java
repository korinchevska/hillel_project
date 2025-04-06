package HW18;

public class Main {
        public static void main(String[] args) {
            Calculator calc = new Calculator();

            System.out.println("Add: " + calc.add(10, 5));
            System.out.println("Subtract: " + calc.subtract(10, 5));
            System.out.println("Multiply: " + calc.multiply(10, 5));
            try{
                double result = calc.divide(10, 0);
                System.out.println("Divide: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

        }
    }

