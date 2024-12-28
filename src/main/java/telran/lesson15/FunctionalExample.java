package telran.lesson15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @FunctionalInterface - данная аннотация говорит о том, что данный
 * интерфейс является функциональным, и его основной особенностью
 * является то, что он имеет только один абстрактный метод,
 * который можно переопределить
 *
 * Examples : Comparable, Comparator, Runnable
 *
 * Если интерфейс попадает под правило функционального, то не обязательно,
 * но желательно, что бы он был помечен аннотацтей FunctionalInterface
 *
 * Если у нас есть интерфейс, который мы можем раелизовать в виде анонимного класса
 * например Comparator, и если мы будем уверены в том, что в этом интерфейсе, будет всего лишь
 * один абстрактный метод, те он будет соответствовать правилам функционального интерфейса :
 *
 * Comparator<Student> byAgeComparator = new Comparator<Student>() {
 *             @Override
 *             public int compare(Student o1, Student o2) {
 *                 return o1.getAge() - o2.getAge();
 *             }
 *         };
 *
 * 1) Вместо отдельного класса для реализации интерфейса, сделали реализацию через анонимный класс
 * 2) Когда убедились, что у нас есть в интерфейсе тот самый, единственный метод для переопределения,
 * мы убрали из записи имя метода, название интерфейса с new и return, базовые сдлва, которые и так очевидны
 * И получили запись вида :
 * Comparator<Student> byAgeComparator = (o1, o2) -> o1.getAge() - o2.getAge();
 *
 * Синтаксис лямбда выражения : левая часть с параметрами -> правая часть с кодом из метода
 * void print() : () -> System.out.println("Hello");
 * int checkNumber() : () -> 5 > 3;
 * void print(String text) : (text) -> System.out.println(text);
 * int getAge(Student student) : (student) -> student.getAge;
 * void print(String text, String name) : (text, name) -> System.out.println(text + name);
 * void print(String text, String name) : (text, name) -> {
 *                                                              System.out.println(text + name);
 *                                                              StringBuilder sb = new StringBuilder();
 *                                                              sb.append(text).append(name);
 *                                                              System.out.println(sb);
 *                                                        }
 * int getAge(Student student) : (student) -> {
 *                                              if("Alex".equals(student.getName())) {
 *                                                  return students.getAge();
 *                                              }
 *                                              return 0;
 *                                             };
 * @FunctionalInterface - ругается при попытке создать второй абстрактный метод
 * В любом FunctionalInterface может быть только один абстрактный метод, но может
 * быть сколько угодно дефолтных, статических или методов из класса Object
 */
public class FunctionalExample {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alex", 15),
                new Student("Oleg", 20),
                new Student("Max", 18));

        Comparator<Student> byAgeComparator = (o1, o2) -> o1.getAge() - o2.getAge();

        Comparator<Student> byNameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Printer printerOne = () -> System.out.println("Hello!");
        printerOne.print();
    }
}
