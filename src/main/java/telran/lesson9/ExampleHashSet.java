package telran.lesson9;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {

    public static void main(String[] args) {
        //Порядка хранения элементов для нас нет
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("D");
        set.add("F");
        set.add("D");
        set.add("c");
        set.add("B");

        System.out.println(set);
        boolean contains = set.contains("F");
        System.out.println("Set contains F? " + contains);
    }
}
