package telran.lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {

    public static void main(String[] args) {
        String[][] strings = {{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Stream.of(strings).flatMap(element -> Stream.of(element))
                .filter(a -> !a.equals("a"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
