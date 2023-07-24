package model;

import controller.iGetModel;

import java.util.List;

public class ModelList implements iGetModel {
    private List<Student> students;

    public ModelList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }

    @Override
    public int deleteStudent(Long id) {
        return 0;
    }
}
