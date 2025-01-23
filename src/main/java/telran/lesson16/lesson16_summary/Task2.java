package telran.lesson16.lesson16_summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. Из списка чисел типа Integer с помощью стримов создать список их строковых представлений
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<String> collect = list.stream().map(i -> i.toString()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
