package controllers;

import domen.Employee;
import services.EmployeeService;

public class EmployeeController implements iPersonController<Employee> {

    private final EmployeeService empService = new EmployeeService();

    @Override
    public void create(String firstName, int age) {
        empService.create(firstName,age);
    }

    //<T extends Employee> prevent from using this method by other Person classes (for e.g. Students)
    public static <T extends Employee> void paySalary(T person)
    {
        System.out.println(person.getName()+" выплачена зарплата 10000р. ");
    }
}
