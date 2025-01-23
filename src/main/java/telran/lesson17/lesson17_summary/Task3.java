package telran.lesson17.lesson17_summary;

import java.util.stream.IntStream;

/**
 * 2. Посчитать количество чисел от 1 до 1000, которые делятся на 7.
 */
public class Task3 {

    public static void main(String[] args) {
        long count = IntStream.rangeClosed(1, 1000)
                .filter(n -> n % 7 == 0)
                .count();

        System.out.println(count);
    }
}
