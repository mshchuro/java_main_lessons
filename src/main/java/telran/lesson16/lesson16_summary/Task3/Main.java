package telran.lesson16.lesson16_summary.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 3. Создать список из экземпляров класса Employee.
 * public class Employee {
 *     private String name;
 *     private String surname;
 *     private int age;
 *     private int workingHoursInMonth;
 * }
 * С помощью стримов:
 * - вывести список активных сотрудников старше 20 лет
 * - вывести список сотрудников, работающих более 30 часов, с именем, начинающимся на J
 * - вывести список фамилий сотрудников с именем John
 * - вывести список всех уникальных имен сотрудников
 */

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Roman", "Dogoda", 35, 40),
                new Employee("Max", "Shchurovskiy", 24, 30),
                new Employee("Kostya", "Sierikov", 35, 40),
                new Employee("Roman", "Dogoda", 35, 40),
                new Employee("Max", "Shchurovskiy", 24, 30),
                new Employee("Kostya", "Sierikov", 35, 40)

        );

        //List<Employee> collect = employees.stream().filter(employee -> employee.getAge() > 20).collect(Collectors.toList());
        //System.out.println(collect);
//
        //System.out.println();
//
        //List<Employee> collect1 = employees.stream()
        //        .filter(employee -> employee.getWorkingHoursInMonth() > 30 && employee.getName().startsWith("J"))
        //        .collect(Collectors.toList());
        //System.out.println(collect1);
//
        //System.out.println();
//
        //List<Employee> collect2 = employees.stream()
        //        .filter(employee -> employee.getName().contains("John")).collect(Collectors.toList());
        //System.out.println(collect2);
//
        //System.out.println();

        List<String> collect3 = employees.stream().map(employee -> employee.getName()).distinct().collect(Collectors.toList());
        System.out.println(collect3);
    }
}
