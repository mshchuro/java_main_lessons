package telran.lesson16;

import java.util.Arrays;
import java.util.List;

public class StreamApiFlatMap {

    public static void main(String[] args) {

        List<Integer> one = Arrays.asList(1, 2, 3, 4);
        List<Integer> two = Arrays.asList(5, 6, 7, 8);

        List<List<Integer>> all = Arrays.asList(one, two);
        //for (List<Integer> list : all) {
        //    for (Integer value : list) {
        //        System.out.print(" " + value * 2);
        //    }
        //}

        all.stream()
                .flatMap(s -> s.stream())
                .map(value -> value * 2)
                .forEach(value -> System.out.print(" " + value));


    }
}
