package Homework_3;

import java.util.Comparator;

public class SortByRating implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getRating().compareTo(o2.getRating());
    }
}
