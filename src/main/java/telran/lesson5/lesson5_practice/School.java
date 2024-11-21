package telran.lesson5.lesson5_practice;

import java.util.Arrays;

public class School {

    public static void main(String[] args) {

        Teacher teacherOne = new Teacher(Subject.MATH);
        Teacher teacherTwo = new Teacher(Subject.ENGLISH);
        Teacher teacherThree = new Teacher(Subject.BIOLOGY);
        Teacher teacherFour = new Teacher(Subject.HISTORY);
        Teacher teacherFive = new Teacher(Subject.LITERATURE);
        Teacher teacherSix = new Teacher(Subject.SPORT);

        Student studentOne = new Student();
        Student studentTwo = new Student();
        Student studentThree = new Student();
        Student studentFour = new Student();

        Student[] students = {studentOne, studentTwo, studentThree};

        teacherOne.teach(studentOne);
        teacherFive.teach(students);

        System.out.println(Arrays.toString(studentOne.getSubjects()));
        System.out.println(Arrays.toString(studentTwo.getSubjects()));
        System.out.println(Arrays.toString(studentThree.getSubjects()));

        System.out.println(studentOne.knows(Subject.MATH));
        System.out.println(studentTwo.knows(Subject.MATH));
    }
}
