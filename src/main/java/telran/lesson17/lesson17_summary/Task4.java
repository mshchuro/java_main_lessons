package telran.lesson17.lesson17_summary;

import java.util.stream.IntStream;

/**
 * 3. Посчитать сумму квадратов чисел от 1 до 100
 */
public class Task4 {

    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 100).map(elem -> elem * elem).sum());
    }
}
