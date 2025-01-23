package telran.lesson16;

import java.util.Arrays;
import java.util.List;

/**
 * "BigBen"
 * "BigBob"
 * "Big"
 * "Ben"
 * "Big Bob"
 */
public class TaskExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");

        long big = list.stream().filter(s -> s.contains("Big")).count();
        System.out.println(big);
    }
}
