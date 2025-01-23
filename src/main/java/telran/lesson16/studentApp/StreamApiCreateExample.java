package telran.lesson16.studentApp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamApiCreateExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Stream<Integer> stream = list.stream();
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        int[] ints = {1, 2, 3, 4};
        Stream<Integer> boxed = Arrays.stream(ints).boxed();

        Integer integer = list.stream()
                .filter(element -> element < 2)
                .findFirst()
                .orElse(0);

        System.out.println(integer);
    }
}
