package telran.lesson17.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        Student studentOne = new Student(1, "John");
        Student studentTwo = new Student(2, "Bob");

        studentOne.addBook("BookOne");
        studentOne.addBook("BookTwo");
        studentOne.addBook("BookThree");

        studentTwo.addBook("BookOne");
        studentTwo.addBook("BookFour");
        studentTwo.addBook("BookFive");

        List<Student> students = Arrays.asList(studentOne, studentTwo);

        Set<String> collect = students.stream()
                .map(student -> student.getBooks())
                .flatMap(book -> book.stream())
                .collect(Collectors.toSet());

        System.out.println(collect);
    }
}
