//import java.util.Date;
import java.time.Year;

abstract class Person implements Displayable{
    String name;
    //Date dob;
    Profession profession;
    int year;

    public Person(String name, Profession profession, int year) {
        this.name = name;
        this.profession = profession;
        this.year = year;
    }
    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - year;
    }
    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setProfession(Profession newProfession) {
        this.profession = newProfession;
    }
    public Profession getProfession() {
        return profession;
    }
    public void setBirthYear(int birthYear) {
        this.year = birthYear;
    }
    public int getBirthYear() {
        return year;
    }
    public abstract void displayInfo();

   /* public void displayInfo(boolean showBirthYear) {
        if (showBirthYear) {
            System.out.println("Ім'я: " + name + ", Рік народження: " + getAge() + ", Професія: " + profession);
        } else {
            displayInfo(); // Викликаємо стандартний варіант
        }*/
    //System.out.println("Name: " + name + ", Age: " + getAge() + ", Profession: " + profession);

    }
