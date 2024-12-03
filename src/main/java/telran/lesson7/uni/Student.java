package telran.lesson7.uni;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int age;
    private int rate;
    List<Phone> phone;

    public Student(String name, int age, int rate, List<Phone> numbers) {
        this.name = name;
        this.age = age;
        this.rate = rate;
        this.phone = numbers;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRate() {
        return rate;
    }

    public List<Phone> getNumbers() {
        return phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                ", numbers=" + phone +
                '}';
    }
}
