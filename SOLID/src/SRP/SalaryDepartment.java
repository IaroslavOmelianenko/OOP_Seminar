package SRP;

public class SalaryDepartment {

    /***
     * @param employee - using specific employee for calculation
     * @return employee salary
     */
    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25);
        return employee.getBaseSalary() - tax;
    }
}
