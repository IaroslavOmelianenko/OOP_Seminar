package model;

import controller.iGetModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModelHash implements iGetModel {

    private HashMap<Long, Student> students;

    //Constructor
    public ModelHash(HashMap<Long, Student> students) {
        this.students = students;
    }

    //Get all students
    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<Student>(students.values());
        return studentList;
    }

    //Delete student by ID
    @Override
    public int deleteStudent(Long id) {
        if (students.containsKey(id)) {
            System.out.println("Student with id " + id + " removed");
            students.remove(id);
            return 1;
        }
        System.out.println("Student " + id + " not found");
        return -1;
    }
}
