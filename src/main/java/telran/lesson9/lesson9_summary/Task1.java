package telran.lesson9.lesson9_summary;

import java.util.*;

// 1. Создать TreeSet<Integer>. Из него:
// Найти заданное число 10, самое большое, самое маленькое
// Вывести все четные числа
// Получить список всех чисел в обратном порядке
// Получить список всех чисел меньше 7
// 2. Из изначально данного Set<String> names получить Set длин имен
// 3. Имеется текст "Hello world!!!". Получить и вывести уникальный набор символов
public class Task1 {

    public static void main(String[] args) {

        SortedSet<Integer> integers = new TreeSet<>();
        integers.add(3);
        integers.add(2);
        integers.add(4);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(10);

        // Найти заданное число 10
        if (integers.contains(10)) {
            System.out.println("Set contains " + 10);
        }
        // Самое большое, самое маленькое
        System.out.println(integers.last());
        System.out.println(integers.first());

        // Вывести все четные числа
        for (Integer value : integers) {
            if (value % 2 == 0){
                System.out.println(value);
            }
        }

        // Получить список всех чисел в обратном порядке
        List<Integer> integers1 = new ArrayList<>(integers.reversed());
        System.out.println(integers1);

        // Получить список всех чисел меньше 7
        List<Integer> integers2 = new ArrayList<>(integers.headSet(7));
        System.out.println(integers2);

        // Из изначально данного Set<String> names получить Set длин имен
        Set<String> names = new HashSet<>();
        names.add("Alex");
        names.add("Max");
        names.add("Konstantin");
        names.add("Marija");

        Set<Integer> namesLength = new HashSet<>();

        for (String value : names) {
            namesLength.add(value.length());
        }

        System.out.println(namesLength);

        //Имеется текст "Hello world!!!". Получить и вывести уникальный набор символов
        String text = "Hello world!!!";

        Set<Character> characters = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            characters.add(c);
        }
        System.out.println(characters);

        //Имеется список уникальных слов. Написать метод сортировки списка слов через Set.
        //Оценить алгоритмическую сложность такой сортировки по времени и памяти.
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Sun");
        strings.add("Country");
        strings.add("Space");

        sortedList(strings);
        System.out.println(strings);
        //Time complexity 0(n)(log(n))
        //Memory 0(n)
    }

    private static void sortedList (List<String> strings) {
        Set<String> sorted = new TreeSet<>(strings);
        Iterator<String> iterator = sorted.iterator();

        for (int i = 0; i < sorted.size(); i++) {
            strings.set(i, iterator.next());
        }
    }
}