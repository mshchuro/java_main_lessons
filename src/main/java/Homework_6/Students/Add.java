package Homework_6.Students;

import java.util.Map;

public class Add {

    public static void addStudent(Map<Integer, Student> students, Integer id, String name, String surname) {
        students.put(id, new Student(name, surname));
    }
}
