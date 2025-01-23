package telran.lesson16.lesson16_summary;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. Отсортировать с помощью стримов список из строк
 * - по алфавиту
 * - в обратном порядке
 */
public class Task1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "D", "E", "M", "L", "O", "X", "C");

        List<String> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list " + collect);

        List<String> collect1 = list.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println("Reversed " + collect1);

    }
}
