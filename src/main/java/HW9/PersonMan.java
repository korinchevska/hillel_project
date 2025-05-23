package HW9;

public class PersonMan extends Person{
    public static final String GENDER = "Man";

    public PersonMan(String name, Profession profession, int year) throws ExceptionHandle {

        super(name, profession, year);
    }
    public void displayInfo() {
        System.out.println("Gender: " + GENDER + ", Name: " + name + ", Age: " + getAge() + ", Profession: " + profession);
    }
}
