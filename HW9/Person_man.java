public class Person_man extends Person{
    public static final String GENDER = "Man";

    public Person_man(String name, Profession profession, int year) {
        super(name, profession, year);
    }
    public void displayInfo() {
        System.out.println("Gender: " + GENDER + ", Name: " + name + ", Age: " + getAge() + ", Profession: " + profession);
    }

}
