package telran.lesson17.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static telran.lesson17.Task4.Color.*;

public class Main {

    public static void main(String[] args) {
        List<Cat> cats = Arrays.asList(
                new Cat("Bob", 12, true, WHITE),
                new Cat("Alex", 11, false, BLACK),
                new Cat("Tom", 12, true, BROWN),
                new Cat("Max", 13, false, RED),
                new Cat("Lisa", 7, true, WHITE),
                new Cat("Bob", 15, false, BLACK),
                new Cat("Bob", 16, false, BROWN),
                new Cat("Bob", 17, true, RED),
                new Cat("Lisa", 12, true, WHITE)
        );

        List<Cat> collect = cats.stream()
                .filter(cat -> cat.getAge() > 10)
                .filter(Cat::isHungry)
                .collect(Collectors.toList());

        System.out.println(collect);

        List<Color> collect1 = cats.stream()
                .map(Cat::getColor)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}
