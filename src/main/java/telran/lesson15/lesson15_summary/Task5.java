package telran.lesson15.lesson15_summary;

import java.util.Arrays;
import java.util.function.BiFunction;

//Написать метод, который на вход принимает два массива одинакового размера типа Integer и функцию.
//Метод возвращает массив, в котором хранятся результаты попарных вычислений согласно переданной функции.
public class Task5 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> (a + b);
        BiFunction<Integer, Integer, Integer> mult = (a, b) -> (a * b);

        int[] arrayOne = {1, 3, 5, 6};
        int[] arrayTwo = {1, 2, 9, 6};

        System.out.println(Arrays.toString(getResult(sum, arrayOne, arrayTwo)));

        System.out.println(Arrays.toString(getResult(mult, arrayOne, arrayTwo)));
    }

    private static int[] getResult (BiFunction<Integer, Integer, Integer> sum, int[] arrayOne, int[] arrayTwo) {
        int[] result = new int[arrayOne.length];
        for (int i = 0; i < arrayOne.length; i++) {
            result[i] = sum.apply(arrayOne[i], arrayTwo[i]);
        }
        return result;
    }
}
