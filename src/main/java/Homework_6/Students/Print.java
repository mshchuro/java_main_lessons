package Homework_6.Students;

import java.util.Map;

public class Print {

    public static void printStudents(Map<Integer, Student> students) {
        //System.out.println("ID" + students);

        for (Map.Entry<Integer, Student> print : students.entrySet()) {
            System.out.println("ID: " + print.getKey() + ", " + print.getValue());
        }
    }
}