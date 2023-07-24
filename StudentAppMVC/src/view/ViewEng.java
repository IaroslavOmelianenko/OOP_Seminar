package view;

import controller.iGetView;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class ViewEng implements iGetView {

    public void printAllStudents(List<Student> students) {
        System.out.println("\n------List of students--------");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("===============================\n");
    }


    /***
     * Requesting action from user
     * @param msg - request message
     * @return chosen action from console
     */
    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }


    /***
     * Requesting student ID
     * @return student ID as Long
     */
    @Override
    public Long getStudentIdToDelete() {
        System.out.print("Enter the student ID to delete: ");
        Scanner scanner = new Scanner(System.in);
        long studentId = scanner.nextLong();
        scanner.nextLine();
        return studentId;
    }



    @Override
    public void displayStudents(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayStudents'");
    }

    @Override
    public Student readStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readStudent'");
    }

    @Override
    public Long getStudentIdToUpdate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToUpdate'");
    }

}
