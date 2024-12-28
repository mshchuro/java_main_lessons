package telran.lesson15.baseFI;

import telran.lesson7.uni.Student;

import java.util.function.Function;

public class FunctionExample {

    /**
     * Function :
     * method apply
     * Принимает один параметра и возвращает один параметр
     * Тип принимаемого и возвращаемого значения может быть один и тот же или разный
     * Function<Тип принимаемого, Тип возвращаемого>
     */
    public static void main(String[] args) {
        Function<Integer, Double> half = (a) -> a / 2.0;
        Double result = half.apply(5);
        System.out.println(result);

        Function<String, String> translator = (text) -> text.toLowerCase();
        System.out.println(translator.apply("HELLO"));



    }
}
