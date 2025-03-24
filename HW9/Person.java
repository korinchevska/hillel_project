//import java.util.Date;
import java.time.Year;

public class Person implements Displayable{
    String name;
    //Date dob;
    Profession profession;
    int year;

    public Person(String name, Profession profession, int year) throws ExceptionHandle  {
        if (name == null || name.trim().isEmpty()) {
            throw new ExceptionHandle("Name cannot be empty or null");
        }
        int currentYear = Year.now().getValue();
        if (year < 1900 || year > currentYear) {
            throw new ExceptionHandle("Incorrect year of birth for user: " + name + " " + year);
        }
        this.name = name;
        this.profession = profession;
        this.year = year;
    }
    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - year;
    }
    public void setName(String newName) throws ExceptionHandle {
        if (newName == null || newName.trim().isEmpty()) {
            throw new ExceptionHandle("Name cannot be empty or null");
        }
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setProfession(Profession newProfession) throws ExceptionHandle {
        this.profession = newProfession;
    }
    public Profession getProfession() {
        return profession;
    }
    public void setBirthYear(int birthYear) throws ExceptionHandle {
        int currentYear = Year.now().getValue();
        if (year < 1900 || year > currentYear) {
            throw new ExceptionHandle("Incorrect year of birth for user: " + name + " " + year);
        }
        this.year = birthYear;
    }
    public int getBirthYear() {
        return year;
    }
    public void displayInfo (){
        System.out.println("Name: " + name + ", Age: " + getAge() + ", Profession: " + profession);


    }
    }
