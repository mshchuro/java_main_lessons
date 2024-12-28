package telran.lesson15.lesson15_summary;

import java.util.function.BiFunction;

//Создать BiFunction, которая возводит первый аргумент типа int в степень второго аргумента типа int
public class BiFunctionTask {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> power = (a, b) -> (int)Math.pow(a, b);

        System.out.println(power.apply(2, 3));
    }
}
