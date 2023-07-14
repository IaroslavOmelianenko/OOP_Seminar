package services;

import domen.PersonComparator;
import domen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iPersonService<Student> {

    private int count;
    private List<Student> students;

    //Constructor
    public StudentService() {
        this.students = new ArrayList<Student>();
    }


    //iPersonService methods
    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, int age) {
        Student per = new Student(firstName,age,count);
        count++;
        students.add(per);
    }


    //Sort method
    public void sortByFIOStdLst()
    {
        students.sort( new PersonComparator<Student>());
    }

}
