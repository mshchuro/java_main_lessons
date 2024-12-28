package Homework_3;

import lombok.Getter;
import java.util.Comparator;

@Getter
public class Patient {

    private String name;

    private int age;

    private String rating;

    public Patient(String name, int age, String rating) {
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rating='" + rating + '\'' +
                '}';
    }
}
