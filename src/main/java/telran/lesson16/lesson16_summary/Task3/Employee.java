package telran.lesson16.lesson16_summary.Task3;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Employee {

        private String name;

        private String surname;

        private int age;

        private int workingHoursInMonth;

    public Employee(String name, String surname, int age, int workingHoursInMonth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workingHoursInMonth = workingHoursInMonth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", workingHoursInMonth=" + workingHoursInMonth +
                '}';
    }
}
