package HW9;

public class Employee {
    String surname;
    String firstName ;
    String position;
    double hourlySalary;
    public Employee(String surname, String firstName, String position, double hourlySalary) {
        this.surname = surname;
        this.firstName = firstName;
        this.position = position;
        this.hourlySalary = hourlySalary;
    }
    public String getLastName() {
        return surname;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getPosition() {
        return position;
    }
    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setLastName(String surname) {
        this.surname = surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void setHourlySalary(double hourlySalary) {
        if (hourlySalary > 0) {
            this.hourlySalary = hourlySalary;
        } else {
            System.out.println("Зарплата за годину повинна бути більше 0!");
        }}

    public double calculateMonthlySalary() {
        return hourlySalary * 160;
        }
        public void displayInfo() {
            System.out.println("Працівник: " + surname + " " + firstName);
            System.out.println("Посада: " + position);
            System.out.println("Ставка за годину: " + hourlySalary + " грн");
            System.out.println("Місячна зарплата: " + calculateMonthlySalary() + " грн");
        }

        public static void main(String[] args) {
            Employee employee = new Employee("Петренко", "Іван", "Програміст", 300);
            employee.displayInfo();
        }

    }
