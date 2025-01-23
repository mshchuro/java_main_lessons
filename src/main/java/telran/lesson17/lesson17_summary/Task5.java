package telran.lesson17.lesson17_summary;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 4. Дан список кошек
 * class Cat {
 *         private String name;
 *         private int age;
 *         private String colour;
 *         private boolean isHungry;
 * }
 * Cat cat1 = new Cat("Tom", 2, "black", true);
 * Cat cat2 = new Cat("Mikky", 1, "white", false);
 * Cat cat3 = new Cat("Vasya", 3, "white", true);
 * Cat cat4 = new Cat("Steve", 1, "grey", false);
 * Cat cat5 = new Cat("Bob", 2, "black", true);
 * List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5);
 *     a. Получить Map<String, Boolean> имя / информация, голодна ли кошка
 *     b. Получить Map<String, Long> цвет / количество кошек данного цвета
 *     c. Получить Map<String, Set<String>> цвет / список имен кошек данного цвета
 *     d. Получить Map<Integer, Integer> возраст / количество голодных кошек данного возраста
 */
public class Task5 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Tom", 2, "black", true);
        Cat cat2 = new Cat("Mikky", 1, "white", false);
        Cat cat3 = new Cat("Vasya", 3, "white", true);
        Cat cat4 = new Cat("Steve", 1, "grey", false);
        Cat cat5 = new Cat("Bob", 2, "black", true);

        List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5);

        Map<String, Boolean> collect = catList
                .stream()
                .collect(Collectors.toMap(Cat::getName, Cat::isHungry));
        System.out.println(collect);

        Map<String, Long> collect1 = catList
                .stream()
                .collect(Collectors.toMap(Cat::getColour, cat -> 1l, (first, second) -> first + second));
        System.out.println(collect1);

        Map<String, Long> collect2 = catList
                .stream()
                .collect(Collectors.groupingBy(Cat::getColour, Collectors.counting()));
        System.out.println(collect2);

        Map<String, List<Cat>> collect3 = catList
                .stream()
                .collect(Collectors.groupingBy(Cat::getColour, Collectors.toList()));
        System.out.println(collect3);

        Map<Integer, Integer> collect4 = catList.stream()
                .collect(Collectors.groupingBy(Cat::getAge, Collectors.mapping(Cat::isHungry, Collectors.summingInt(isHungry -> isHungry ? 1 : 0))));
        System.out.println(collect4);
    }
}
