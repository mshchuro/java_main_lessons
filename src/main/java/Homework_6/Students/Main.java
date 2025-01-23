package Homework_6.Students;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Используя хеш мап, написать мини приложение по работе со студентами в университете,
 * нужно хранить 10 студентов, получать студента по айди , добавлять студента , выводить список студентов и
 * !! исправлять фамилию выбранного студента (подсказка, в качестве ключа используйте айди студента)
 */

public class Main {

    public static void main(String[] args) {

        Map<Integer, Student> students = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        Add.addStudent(students,123, "Max", "Orlov");
        Add.addStudent(students,124, "Bob", "Smith");
        Add.addStudent(students,125, "Oleg", "Joshua");
        Add.addStudent(students,183, "Joshua", "Johnes");
        Add.addStudent(students,222, "Hector", "Piterson");
        Add.addStudent(students,333, "John", "Musk");
        Add.addStudent(students,444, "Jason", "Trump");
        Add.addStudent(students,555, "Richard", "Obama");
        Add.addStudent(students,666, "Elon", "Robertson");
        Add.addStudent(students,777, "Bill", "Waskerson");

        //Edit.editStudentById(students);
        //Find.getStudentById(students);

        //Print.printStudents(students);
        while (true){
            System.out.println("Enter what do you want:");
            System.out.println("1 - Print students");
            System.out.println("2 - Find student by ID");
            System.out.println("3 - Edit students Surname by ID");
            System.out.println("4 - Exit");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Print.printStudents(students);
                    break;
                case 2:
                    Find.getStudentById(students);
                    break;
                case 3:
                    Edit.editStudentById(students);
                    break;
                case 4:
                    System.out.println("Bye");
                    return;
                default:
                    System.out.println("There are no students with this id, try again");
            }
        }
    }
}
