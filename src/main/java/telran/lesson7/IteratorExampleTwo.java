package telran.lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Иерархия коллекций:
 * Iterable -> Collection -> List -> ArrayList, LinkedList iterator + listIterator
 */

public class IteratorExampleTwo {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

//        System.out.println(integers);

//        for (int i = 0; i< integers.size(); i++) {
//            if (integers.get(i) % 2 != 0) {
//                integers.remove(i);
//            }
//        }

//        for (Integer value : integers) {
//            if (value % 2 != 0) {
//               integers.remove(value);
//            }
//        } // error

//        System.out.println(integers);

        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
            if(iterator.next() % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println("\n" + integers);
    }
}
