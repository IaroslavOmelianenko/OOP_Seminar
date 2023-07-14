package services;

import domen.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iPersonService<Employee> {
    private int count;
    private List<Employee> emploees;

    //Constructor
    public EmployeeService() {
        this.emploees = new ArrayList<Employee>();
    }


    //iPersonService methods
    @Override
    public List<Employee> getAll() {
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    @Override
    public void create(String firstName, int age) {
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
}
