package telran.lesson7.lesson7_summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Написать метод, который проверяет, является ли список отсортированным.

//Имеется колода карт, сохраненная в виде списка.
//Написать метод по случайному перемешиванию карт колоды.


public class Task2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList(null, "Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(8);
        numbers.add(4);
        numbers.add(5);

        System.out.println(isSorted(numbers));
    }

    private static boolean isSorted(List<Integer> numbers) {
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) > numbers.get(i)) {
                return false;
            }
        }
        return true;
    }
}
