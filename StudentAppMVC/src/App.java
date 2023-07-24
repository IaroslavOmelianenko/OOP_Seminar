import controller.Controller;
import controller.Language;
import controller.iGetModel;
import controller.iGetView;
import model.ModelFile;
import model.ModelHash;
import model.Student;
import view.ViewEng;
import view.ViewRus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", 21, 101);
        Student s2 = new Student("Андрей", 22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша", 25, 171);
        Student s6 = new Student("Лена", 23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);


        // Using ModelHash to store students
        HashMap<Long, Student> hashStudents = new HashMap<Long, Student>();
        hashStudents.put((long) 101, s1);
        hashStudents.put((long) 111, s2);
        hashStudents.put((long) 121, s3);
        hashStudents.put((long) 301, s4);
        hashStudents.put((long) 171, s5);
        hashStudents.put((long) 104, s6);
        iGetModel modelHash = new ModelHash(hashStudents);

        ModelFile fModel = new ModelFile("StudentDB.txt");
        fModel.saveAllStudentToFile(students);

        // Language request
        Language chosenLanguage;
        System.out.println("Choose language. Enter the number: RUS - 1 / ENG - 2: ");
        Scanner scanner = new Scanner(System.in);
        int languageChoice = scanner.nextInt();
        scanner.nextLine();

        // Creating view with chosen language
        iGetView view;
        if (languageChoice == 1) {
            System.out.println("Language set to Rus");
            chosenLanguage = Language.RUS;
            view = new ViewRus();
        } else {
            System.out.println("Language set to Eng");
            chosenLanguage = Language.ENG;
            view = new ViewEng();
        }

        Controller control = new Controller(modelHash, view);
        // Run with chosen language
        control.run(chosenLanguage);
    }
}
