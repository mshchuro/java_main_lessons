package telran.lesson16.lesson16_summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 4. Имеется два списка элементов.
 *            List<Integer> list1 = Arrays.asList(1, 2, 3);
 *            List<Integer> list2 = Arrays.asList(4, 5, 6);
 *
 * С помощью flatMap():
 * a). Получить все возможные значения сумм чисел из обоих списков
 * b). Получить все возможные комбинации пар чисел из обоих списков [1, 4] [2, 6]
 * с). Найти все пары чисел, сумма которых будет равна заданному значению sum
 */
public class Task4 {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        List<Integer> collect = list1.stream().flatMap(element -> list2.stream().map(element2 -> element2 + element)).collect(Collectors.toList());
        System.out.println(collect);

        List<List<Integer>> collect1 = list1.stream()
                .flatMap(element -> list2.stream().map(element2 -> Arrays.asList(element, element2))).collect(Collectors.toList());
        System.out.println(collect1);

        int sum = 7;
        List<List<Integer>> collect2 = list1.stream()
                .flatMap(element -> list2.stream()
                .map(element2 -> Arrays.asList(element, element2)))
                .filter(elems -> elems.get(0) + elems.get(1) == sum)
                .collect(Collectors.toList());
        System.out.println(collect2);
    }
}
