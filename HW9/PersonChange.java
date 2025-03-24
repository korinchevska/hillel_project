public class PersonChange {
    public void displayPersonInfo(Person person) {
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", Profession: " + person.getProfession());
    }

    public void changeProfession(Person person,  Profession newProfession) throws ExceptionHandle {
        //this.newProfession = newProfession;
        person.setProfession(newProfession);
        System.out.println(person.getName() + " changed her/his profession to: " + newProfession);
    }

}
