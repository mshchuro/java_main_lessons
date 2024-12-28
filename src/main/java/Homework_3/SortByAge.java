package Homework_3;

import java.util.Comparator;

public class SortByAge implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getAge() - o2.getAge();
    }
}
