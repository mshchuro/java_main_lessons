package telran.lesson17;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {17, 13, 15}, {7, 9, 25}};
        Stream<int[]> stream = Arrays.stream(array);
        stream.flatMapToInt(element -> Arrays.stream(element)).forEach(s -> System.out.print(s + " "));
    }
}
