import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import controllers.EmployeeController;
import domen.*;
import services.AverageAge;

public class App {
    public static void main(String[] args) throws Exception {

        //Students
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        //Teachers
        Teacher t1 = new Teacher("Иван Игоревич", 40, "Доцент");
        Teacher t2 = new Teacher("Игорь Евгеньевич", 45, "Профессор");
        Teacher t3 = new Teacher("Федор Иванович", 39, "Доцент");
        //Employees
        Employee e1 = new Employee("Петрович", 60, "Сантехник");
        Employee e2 = new Employee("Саныч", 55, "Электрик");
        Employee e3 = new Employee("Сергеич", 62, "Электрик");


        //Adding students to lists
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);

        //Adding teachers to lists
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);

        //Adding employees to lists
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);


        //Print students
        System.out.println("\n============== Students ==============");
        for (Student student : studentList) {
            System.out.println(student);
        }

        //Print teachers
        System.out.println("\n============== Teachers ==============");
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }

        //Print employees
        System.out.println("\n============== Employees ==============");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }


        //Average age calculation
        System.out.println("\n============== Average age ==============");
        AverageAge<Student> averageAgeOfStudents = new AverageAge<>(studentList);
        System.out.println("Average age of students: " + averageAgeOfStudents.calculateAverageAge());

        AverageAge<Teacher> averageAgeOfTeachers = new AverageAge<>(teacherList);
        System.out.println("Average age of teachers: " + averageAgeOfTeachers.calculateAverageAge());

        AverageAge<Employee> averageAgeOfEmployees = new AverageAge<>(employeeList);
        System.out.println("Average age of employees: " + averageAgeOfEmployees.calculateAverageAge());



//        //Students
//        Student s1 = new Student("Иван", 25, 121);
//        Student s2 = new Student("Игорь", 23, 301);
//        Student s3 = new Student("Иван", 22, 121);
//        Student s4 = new Student("Игорь",  23, 444);
//        Student s5 = new Student("Даша",  23, 171);
//        Student s6 = new Student("Лена",  23, 104);
//        Student s7 = new Student("Магомед",  19, 204);
//        Student s8 = new Student("Женесбек",  20, 206);
//        Student s9 = new Student("Умиджон",  21, 215);
//        Student s10 = new Student("Айгуль",  24, 322);
//        Student s11 = new Student("Фарануш",  25, 333);
//        Student s12 = new Student("Гульнара",  26, 344);
//
//
//        //Adding students to lists
//        List<Student> studentList1 = new ArrayList<Student>();
//        studentList1.add(s1);
//        studentList1.add(s2);
//
//        List<Student> studentList2 = new ArrayList<Student>();
//        studentList2.add(s3);
//        studentList2.add(s4);
//        studentList2.add(s5);
//        studentList2.add(s6);
//
//        List<Student> studentList3 = new ArrayList<Student>();
//        studentList3.add(s7);
//        studentList3.add(s8);
//        studentList3.add(s9);
//
//        List<Student> studentList4 = new ArrayList<Student>();
//        studentList4.add(s10);
//        studentList4.add(s11);
//        studentList4.add(s12);
//
//
//        //Creating student groups
//        StudentGroup group4580 = new StudentGroup(studentList1, 4580);
//        StudentGroup group8080 = new StudentGroup(studentList2, 8080);
//        StudentGroup group7070 = new StudentGroup(studentList3,7070);
//        StudentGroup group6060 = new StudentGroup(studentList4,6060);
//
//
//        //Adding student groups to lists
//        List<StudentGroup> groupList1 = new ArrayList<StudentGroup>();
//        groupList1.add(group4580);
//
//        List<StudentGroup> groupList2 = new ArrayList<StudentGroup>();
//        groupList2.add(group7070);
//        groupList2.add(group8080);
//        groupList2.add(group6060);
//
//
//        //Creating student streams
//        StudentStream mathStream = new StudentStream("Math stream", groupList1);
//        StudentStream economicStream = new StudentStream("Economic stream", groupList2);


//        //Testing StudentStream Iterable
//        for(StudentGroup stdGrp : economicStream)
//        {
//            System.out.println(stdGrp);
//        }
//
//
//        //Sort and print student streams
//        System.out.println("\n============= before sort =============");
//        System.out.println(economicStream);
//
//        System.out.println("============= after sort ==============");
//        Collections.sort(economicStream.getStudentStream());
//        System.out.println(economicStream);
    }
}
