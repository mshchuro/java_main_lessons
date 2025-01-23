package telran.lesson16;

import telran.lesson16.studentApp.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiMapExample {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Oleg", 25),
                new Student("Max", 35),
                new Student("Petr", 18)
        );

        //List<String> names = new ArrayList<>();
        //for (Student student : list) {
        //    names.add(student.getName());
        //}

        //Function<Student, String> stringFunction = new Function<Student, String>() {
        //    @Override
        //    public String apply(Student student) {
        //        return student.getName();
        //    }
        //};

        List<String> collect = list.stream().map(s -> s.getName()).sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
