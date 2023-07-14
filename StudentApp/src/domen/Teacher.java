package domen;

public class Teacher extends Person{

    private String acadDegree;

    //Constructor
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }


    //ToString
    @Override
    public String toString() {
        return "\t\tTeacher " + super.getName() + "(age=" + super.getAge() + "; " + acadDegree + ")";
    }
}
