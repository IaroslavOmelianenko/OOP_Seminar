package services;

import domen.Person;

import java.util.List;


public class AverageAge <T extends Person>{

    private List<T> persons;

    public AverageAge(List<T> persons) {
        this.persons = persons;
    }

    /***
     * Method for calculation of average age of teachers, students, employees, etc.
     * @return average age of all persons as int value
     */
    public int calculateAverageAge() {
        int sum = 0;
        for (T person : persons) {
            sum += person.getAge();
        }
        return sum / persons.size();
    }
}
