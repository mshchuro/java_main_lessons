package telran.lesson_10.example;

import java.util.Objects;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
