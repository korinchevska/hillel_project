public class PersonWoman extends Person{
    public static final String GENDER = "Woman";

    public PersonWoman(String name, Profession profession, int year) {
        super(name, profession, year);
    }
    public void displayInfo() {
        System.out.println("Gender: " + GENDER + ", Name: " + name + ", Age: " + getAge() + ", Profession: " + profession);
    }

}
