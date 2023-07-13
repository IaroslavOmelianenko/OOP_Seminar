package domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    //Constructor
    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }


    //ToString
    @Override
    public String toString() {
        return "\tGROUP "
                + idGroup
                + " (" + group.size()
                + " students):\n"
                + group.toString()
                    .replace(", ", "\n" )
                    .replace("[","")
                    .replace("]", "\n");
    }


    //Getters, setters
    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }


    //Iterable method
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {

            private int counter;

            @Override
            public boolean hasNext() {

                if (counter < group.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Student next() {
                return group.get(counter++);
            }
        };
    }


    //Comparable method
    //Sort by group size, from max to min
    //Then sort by idGroup, from min to max
    @Override
    public int compareTo(StudentGroup studentGroup) {
            if (group.size() == studentGroup.getGroup().size()){
                if (idGroup.equals(studentGroup.idGroup)) return 0;
                if (idGroup > studentGroup.idGroup) return 1;
                else return -1;
            }
            if (group.size() < studentGroup.getGroup().size()) return 1;
            else return -1;
        }
}
