package telran.lesson15.baseFI;

import java.util.function.BiFunction;

/**
 * BiFunction :
 * method apply
 * Принимает два параметра и возвращает два параметра
 * Тип принимаемого и возвращаемого значения могут быть одинаковые или разные
 * Function<Тип принимаемого, Тип принимаемого, Тип возвращаемого>
 */

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        BiFunction<Integer, Integer, Long> mult = (a, b) -> Long.valueOf(a * b);
        BiFunction<Integer, Integer, Double> div = (a, b) -> (a / (double)b);
        BiFunction<Integer, Integer, Integer> sub = (a, b) -> (a - b);

        System.out.println(sum.apply(5, 7));
        System.out.println(mult.apply(5, 7));
        System.out.println(div.apply(5, 7));
        System.out.println(sub.apply(5, 7));
    }
}
