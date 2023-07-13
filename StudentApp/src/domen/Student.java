package domen;

public class Student extends Person implements Comparable<Student> {

    private int id;

    //Constructor
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }


    //ToString
    @Override
    public String toString() {
        return "\t\tStudent " + super.getName() + "(age=" + super.getAge() + "; id=" + id + ")";
    }


    //Getters, setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    //Comparable method
    @Override
    public int compareTo(Student o) {
        //System.out.println(super.getName() + " - " + o.getName());
        if (super.getAge() == o.getAge()) {
            if (id == o.id) return 0;
            if (id > o.id) return 1;
            else return -1;
        }
        if (super.getAge() > o.getAge())
            return 1;
        else
            return -1;
    }
}
