public class Person_woman extends Person{
    public static final String GENDER = "Woman";

    public Person_woman(String name, Profession profession, int year) throws ExceptionHandle {
        super(name, profession, year);
    }
    public void displayInfo() {
        System.out.println("Gender: " + GENDER + ", Name: " + name + ", Age: " + getAge() + ", Profession: " + profession);
    }

}
