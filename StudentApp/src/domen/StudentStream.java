package domen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private String streamTitle;
    private List<StudentGroup> studentStream;

    //Constructor
    public StudentStream(String streamTitle, List<StudentGroup> studentStream) {
        this.streamTitle = streamTitle;
        this.studentStream = studentStream;
    }


    //Getter
    public List<StudentGroup> getStudentStream() {
        return studentStream;
    }


    //ToString
    @Override
    public String toString() {
        return '\n' + streamTitle
                + " (size: " + studentStream.size() + ")" + '\n'
                + studentStream.toString()
                    .replace(", ", "")
                    .replace("[", "")
                    .replace("]", "");
    }


    //Iterable method
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            int counter;

            @Override
            public boolean hasNext() {
                if (counter < studentStream.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public StudentGroup next() {
                return studentStream.get(counter++);
            }
        };
    }

}
