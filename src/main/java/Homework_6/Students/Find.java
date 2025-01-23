package Homework_6.Students;

import java.util.Map;
import java.util.Scanner;

public class Find {

    public static void getStudentById(Map<Integer, Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        Integer id = scanner.nextInt();

        Student student = students.get(id);

        if (student != null) {
            System.out.println("Student with " + id + " found " + student);
        } else {
            System.out.println("Student not found");
        }
    }
}
