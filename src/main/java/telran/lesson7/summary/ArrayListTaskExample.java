package telran.lesson7.summary;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTaskExample {

    public static void main(String[] args) {
        //add(value)
        //add(index, value)
        //get(index)
        //contains(value)
        List<String> cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("Bonn");
        cities.add("Paris");
        cities.add("Amsterdam");
        cities.add("Rome");
        cities.add("Riga");

        //[Berlin, Bonn, Paris, Amsterdam, Rome]
        //[Rome, Amsterdam, Paris, Bonn, Berlin]
        System.out.println(cities);

        reverseList(cities);
        System.out.println(cities);
    }

    private static void reverseList (List<String> cities) {
        int firstIndex = 0;
        int lastIndex = cities.size() - 1;

        while (firstIndex <= lastIndex) {
            swap(cities, firstIndex++, lastIndex--);
        }
    }

    private static void swap(List<String> cities, int firstIndex, int lastIndex) {
        String temp = cities.get(firstIndex);

        cities.set(firstIndex, cities.get(lastIndex));
        cities.set(lastIndex, temp);
    }
}
