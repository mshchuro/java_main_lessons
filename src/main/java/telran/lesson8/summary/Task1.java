package telran.lesson8.summary;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        //1. Перебрать LinkedList<String> и найти самую короткую строку.
        List<String> strings = new LinkedList<>();
        strings.add("Hello");
        strings.add("My");
        strings.add("Name");
        strings.add("Is");
        strings.add("Max");

        int min = strings.getFirst().length();

        for (String result : strings) {
            min = Math.min(min, result.length());
        }
        System.out.println(min);

        //2. Перебрать LinkedList<String> и объединить все строки в одну
        // с использованием разделителя "|".
        String result1 = String.join("|", strings);
        System.out.println(result1);

        //3. Создать LinkedList с объектами вашего собственного класса и удалить все элементы,
        // удовлетворяющие определенному условию.
        List<Person> people = new LinkedList<>();
        people.add(new Person("Max", 24));
        people.add(new Person("Oleg", 48));
        people.add(new Person("Oleg", 20));
        people.add(new Person("Alex", 32));

//        people.removeIf(person -> person.getAge() > 30);
//
//        for (Person result : people) {
//            System.out.println(result);
//        }
        Iterator<Person> iterator = people.iterator();

        while (iterator.hasNext()) {
            Person correctPerson = iterator.next();
            if (correctPerson.getAge() > 30) {
                iterator.remove();
            }
        }

        for (Person result : people) {
            System.out.println(result);
        }
    }
}
