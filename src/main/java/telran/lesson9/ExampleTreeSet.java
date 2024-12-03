package telran.lesson9;

import telran.lesson1.Student;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExampleTreeSet {

    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        //add - add element
        set.add("D");
        set.add("B");
        set.add("A");
        set.add("C");
        set.add("B");

        System.out.println(set);
        //SortedSet : first, last
        System.out.println("First elem: " + set.first());
        System.out.println("Last elem: " + set.last());

        //contains - check that element exists in set
        String e = "E";
        System.out.println("Set contains " + e + " ? " + set.contains(e));

        //remove - remove element
        set.remove("B");
        System.out.println(set);

        //1
        System.out.println("Use foreach: ");
        for (String value : set) {
            System.out.print(value + " ");
        }

        //2
        System.out.println("\nUse iterator: ");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        //
        System.out.println("\nUse foreach with lambda ");
        set.forEach(value -> System.out.print(value + " "));

        System.out.println();

        SortedSet<Integer> integers = new TreeSet<>();
        integers.add(4);
        integers.add(1);
        System.out.println(integers);

        System.out.println("Tail set: " + set.tailSet("D"));
        System.out.println("Head set: " + set.headSet("D"));
    }
}
