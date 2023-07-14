package domen;

public class Employee extends Person{

    private String special;

    //Constructor
    public Employee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }


    //ToString
    @Override
    public String toString() {
        return "\t\tEmployee " + super.getName() + "(age=" + super.getAge() + "; " + special + ")";
    }
}
