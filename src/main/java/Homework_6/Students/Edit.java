package Homework_6.Students;

import java.util.Map;
import java.util.Scanner;

public class Edit {

    public static void editStudentById(Map<Integer, Student> students) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please student id");
        int id = scanner.nextInt();
        scanner.nextLine();

        Student student = students.get(id);
        if (student != null) {
            System.out.println("Please enter new surname for " + student);
            String newSurname = scanner.nextLine();

            student.setSurname(newSurname);
            System.out.println("Surname changed to " + newSurname);
        } else {
            System.out.println("Cannot find student with this ID");
        }
    }
}
