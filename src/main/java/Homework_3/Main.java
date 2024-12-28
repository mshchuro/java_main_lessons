package Homework_3;

import telran.lesson10.compare.SortByYear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Patient> queue = new ArrayList<>();
        Patient patientOne = new Patient("Max", 24, "A");
        Patient patientTwo = new Patient("Alex", 30, "B");
        Patient patientThree = new Patient("Oleg", 90, "C");
        Patient patientFour = new Patient("Mark", 45, "B");
        Patient patientFive = new Patient("Bob", 15, "C");

        queue.add(patientOne);
        queue.add(patientTwo);
        queue.add(patientThree);
        queue.add(patientFour);
        queue.add(patientFive);

        //Sort by age
        SortByAge sortByAge = new SortByAge();
        Collections.sort(queue, sortByAge);
        System.out.println(queue);

        //Sort by rating
        SortByRating sortByRating = new SortByRating();
        Collections.sort(queue, sortByRating);
        System.out.println(queue);
    }
}
