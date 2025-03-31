package HW9;

public class Main {
    public static void main(String[] args) {
        try {
        //old
        Person person1 = new Person("Julia", Profession.ACCOUNTANT, 1994);
        Person person2 = new Person("Agata", Profession.DANTIST, 1985);
        Person person3 = new Person("Alex", Profession.BARISTA, 2005);
        //new

        Displayable man = new PersonMan ("Alex", Profession.BARISTA, 2005);
        Displayable woman = new PersonMan ("Julia", Profession.ACCOUNTANT, 1994);
        Displayable woman1 = new PersonMan ("Agata", Profession.DANTIST, 1985);
        //incorrect user
        Displayable man2 = new PersonWoman ("", Profession.DANTIST, 1899);
        Displayable woman2 = new PersonWoman ("ErrorWoman", Profession.DANTIST, 2026);
        Displayable man1 = new PersonWoman ("ErrorMan", Profession.DANTIST, 1899);



        PersonChange change = new PersonChange();

        System.out.println("Initial data:");
        //old
        change.displayPersonInfo(person1);
        change.displayPersonInfo(person2);
        change.displayPersonInfo(person3);
        //new
        man.displayInfo();
        woman.displayInfo();
        woman1.displayInfo();
        man1.displayInfo();
        man2.displayInfo();
        woman2.displayInfo();

        change.changeProfession(person3,Profession.QA); //old
        ((Person) man).setProfession(Profession.QA); //new


        System.out.println("After change:");
        System.out.println("old");
        change.displayPersonInfo(person3); //old
        System.out.println("new");
        man.displayInfo();  //new
    } catch (ExceptionHandle e) {
        System.out.println("Error when creating user: " + e.getMessage());
    }
    }
}
