package telran.lesson_10.example;

import java.util.HashSet;
import java.util.Set;

public class ExampleApp {

    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        Person person = new Person("Alex");
        set.add(person);

        System.out.println(set);
        Student student = new Student("Alex");
        Student student1 = new Student("Oleg");

        System.out.println(person.hashCode());
        System.out.println(student.hashCode());

        System.out.println("Set contains Alex = " + set.contains(student));
        System.out.println("Set contains Oleg = " + set.contains(student1));
    }
}
