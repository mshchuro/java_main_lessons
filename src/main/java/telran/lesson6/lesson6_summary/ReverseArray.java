package telran.lesson6.lesson6_summary;

//2. Напишите метод, который меняет местами элементы одномерного списка из String в обратном порядке.
//Не используйте дополнительный список для хранения результатов.
//Input:
//data = {"One", "Two", "Three"}
//Result:
//data = {"Three", "Two", "One"}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        reverseList(list);
        System.out.println("Reversed list: " + list);
    }

    private static void reverseList(List<String> list) {

        //Collections.reverse(list);

        for (int i = 0; i < list.size() / 2; i++) {
            String temp = list.get(list.size() - 1 - i);
            list.set(list.size() - 1 - i, list.get(i));
            list.set(i, temp);
        }
    }
}
