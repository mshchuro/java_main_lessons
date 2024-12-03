package telran.lesson7.uni;

import java.util.ArrayList;
import java.util.List;

public class UniApp {

    public static void main(String[] args) {

        University university = new University();

        university.generateStudents();

        List<Phone> list1 = new ArrayList<>();
        Student studentOne = new Student("Max", 24, 1, list1);
        list1.add(new Phone("+371", "12345678"));

        List<Phone> list2 = new ArrayList<>();
        Student studentTwo = new Student("Oleg", 30, 3, list2);
        list2.add(new Phone("+371", "87654321"));

        List<Phone> list3 = new ArrayList<>();
        Student studentThree = new Student("Oleg", 30, 3, list2);
        list3.add(new Phone("+371", "87654321"));

        university.addStudent(studentOne);
        university.addStudent(studentTwo);
        university.addStudent(studentThree);
        university.printAllStudents();

        System.out.println();

        university.removeStudents(studentOne);
        university.removeStudents(studentTwo);
        System.out.println();
        university.printAllStudents();

        System.out.println();

        university.printBlackList();

        System.out.println();

        university.upgradeRate(university.getStudentList());
        university.printAllStudents();
    }
}
