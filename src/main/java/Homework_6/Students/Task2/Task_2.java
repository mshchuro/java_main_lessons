package Homework_6.Students.Task2;
/**
 * Запустить в цикле 10000 раз генерацию случайного числа от 0 до 50 ,
 * после цикла вывести статистику какое число , сколько раз было сгенерировано
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Task_2 {

    public static void main(String[] args) {
        Map<Integer, Integer> numbers = new HashMap<>();
        Random random = new Random();

        for (int i = 0; i <= 50; i++) {
            numbers.put(i, 0);
        }

        for (int i = 0; i < 10000; i++) {
            int number = random.nextInt(51);
            numbers.put(number, numbers.get(number) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            System.out.println("Число: " + entry.getKey() + ", количество: " + entry.getValue());
        }
    }
}
