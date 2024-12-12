package telran.summary_lessons.lesson12_summary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TopKTask {

    public static void main(String[] args) {

        List<Item> items = List.of
                (new Item("book", 12),
                new Item("snickers", 23),
                new Item("newspaper", 4),
                new Item("stick", 2),
                new Item("cup", 25),
                new Item("jounral", 23));

        List<Item> topItems = findTopK(items, 1);
        System.out.println(topItems);
    }

    public static List<Item> findTopK(List<Item> items, int k) {
        List<Item> copy = new ArrayList<>(items);
        Collections.sort(copy);
        List<Item> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(copy.get(k - 1));
        }
        return result;
    }

    static class Item implements Comparable<Item>{
        private String name;

        private int price;

        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public int compareTo(Item o) {
            return this.price - o.price;
        }
    }
}
