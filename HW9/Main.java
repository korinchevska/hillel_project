public class Main {
    public static void main(String[] args) {
        //old
        Person person1 = new Person("Julia", Profession.ACCOUNTANT, 1994);
        Person person2 = new Person("Agata", Profession.DANTIST, 1985);
        Person person3 = new Person("Alex", Profession.BARISTA, 2005);
        //new
        Displayable man = new Person_man ("Alex", Profession.BARISTA, 2005);
        Displayable woman = new Person_woman ("Julia", Profession.ACCOUNTANT, 1994);
        Displayable woman1 = new Person_woman ("Agata", Profession.DANTIST, 1985);


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

        change.changeProfession(person3,Profession.QA); //old
        ((Person) man).setProfession(Profession.QA); //new


        System.out.println("After change:");
        System.out.println("old");
        change.displayPersonInfo(person3); //old
        System.out.println("new");
        man.displayInfo();  //new
    }
}
