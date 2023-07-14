package controllers;

import domen.Student;
import services.StudentService;

public class StudentController implements iPersonController<Student> {

    private final StudentService dataService = new StudentService();

    //Student database registration method
    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName,age); //Registration
        dataService.sortByFIOStdLst();
    }

}
