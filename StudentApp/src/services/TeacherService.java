package services;

import domen.PersonComparator;
import domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService{

    private int count;
    private String acadDegree;
    private List<Teacher> teachers;

    //Constructor
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    //iPersonService methods
    @Override
    public void create(String firstName, int age) {
        Teacher per = new Teacher(firstName,age,acadDegree);
        count++;
        teachers.add(per);
    }
    @Override
    public List getAll() {
        return teachers;
    }

    //Sort method
    public void sortByFIOTchrLst()
    {
        teachers.sort( new PersonComparator<Teacher>());
    }
}
