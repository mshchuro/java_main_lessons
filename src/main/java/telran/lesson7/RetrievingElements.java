package telran.lesson7;

import java.util.*;

public class RetrievingElements {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");

//        //Вернется объект встроенного класса в ArrayList
//        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
//        System.out.println(list);
//
//        strings.addAll(list);
//        System.out.println(strings);
//
//        //Вернется объект класса ImmutableCollection
//        List<String> listOf = List.of("A", "B", "C", "D", "E");

        //1 for with index
        for (int i = 0; i < strings.size(); i++) {
            String value = strings.get(i);
            System.out.print(value + " ");
        }

        System.out.println();

        //2 for-each
        for (String value : strings) {
            System.out.print(value + " ");
        }

        System.out.println();

        //3 iterator
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        //4 iterator + for
        for (Iterator<String> i = strings.iterator(); i.hasNext();) {
            System.out.print(i.next() + " ");
        }

        System.out.println();

        //5 for-each with lambda
        strings.forEach(value -> System.out.print(value + " "));

        System.out.println();

        //5 (add with full body)
        strings.forEach(value -> {
            String newValue = value.toLowerCase();
            System.out.print(newValue + " ");
        });
    }
}
