package telran.lesson17.lesson17_summary;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 1. Из списка имен вывести первое по алфавиту, предпоследнее по алфавиту
 */
public class Task2 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "Max", "Roman,");

        String s = names.stream().sorted().findFirst().get();
        System.out.println(s);

        String s1 = names.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(s1);
    }
}
