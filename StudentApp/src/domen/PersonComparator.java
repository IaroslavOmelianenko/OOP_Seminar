package domen;

import java.util.Comparator;

public class PersonComparator<T extends Person> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            if (o1.getAge() == o2.getAge()) {
                return 0;
            } else {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else return -1;
            }
        } else return result;
    }
}
