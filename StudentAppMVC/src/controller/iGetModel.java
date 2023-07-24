package controller;

import model.Student;

import java.util.List;

public interface iGetModel {

    //Get list of students
    public List<Student> getAllStudents();

    //Delete student by id
    public int deleteStudent(Long id);

}

