//import java.util.Date;
import java.time.Year;

public class Person {
    String name;
    //Date dob;
    String profession;
    int year;

    public Person(String name, String profession, int year) {
        this.name = name;
        this.profession = profession;
        this.year = year;
    }
    public int getAge() {
        int currentYear = Year.now().getValue(); // Отримуємо поточний рік
        return currentYear - year; // Обчислюємо вік
    }
    public void setModel(String newName) {
        name = newName;
    }
    public String getModel() {
        return name;
    }
    public void setProfession(String newProfession) {
        profession = newProfession;
    }
    public String getProfession() {
        return profession;
    }
    public void setBirthYear(int birthYear) {
        this.year = birthYear;
    }
    public int getBirthYear() {
        return year;
    }
    public void changeProfession(String newProfession) {
        this.profession = newProfession;
        System.out.println(name + " changed his/her profession to: " + newProfession);
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + getAge() + ", Profession: " + profession);
    }
    public static void main(String[] args) {
        Person person1 = new Person("Julia", "Accountant", 1994);
        Person person2 = new Person("Agata", "Dantist", 1985);
        Person person3 = new Person("Alex", "Barista", 2005);

        System.out.println("Initial data:");
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        person3.changeProfession("QA");

        System.out.println("After change:");
        person3.displayInfo();
    }

    }
