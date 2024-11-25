package telran.lesson7.summary;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        int[] ints = {123, 12, 4, 6, 7,875,45};
        String s = Arrays.toString(ints);
        Arrays.sort(ints);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(integerList);
        //Перемешивание коллекции
        Collections.shuffle(integerList);
        System.out.println(integerList);

        //Сортировка коллекции
        Collections.sort(integerList);



    }
}
