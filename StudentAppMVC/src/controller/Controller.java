package controller;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<>();

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students) {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        //MVP
        students = model.getAllStudents();
        if (testData(students)) {
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }


    public void run(Language language) {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        String commandMsg;
        String exitMsg;

        // Message depends on chosen language
        if (language == Language.RUS){
            commandMsg = "Команды: NONE / READ / CREATE / UPDATE / LIST / DELETE / EXIT\n" + "Введите команду: ";
            exitMsg = "Выход из программы!";
        }
        else {
            commandMsg = "Commands: NONE / READ / CREATE / UPDATE / LIST / DELETE / EXIT\n" + "Enter command: ";
            exitMsg = "Closing program!";
        }

        while (getNewIteration) {
            String command = view.prompt(commandMsg);
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println(exitMsg);
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    model.deleteStudent(view.getStudentIdToDelete());
                    view.printAllStudents(model.getAllStudents());
                    break;
            }
        }
    }


}
