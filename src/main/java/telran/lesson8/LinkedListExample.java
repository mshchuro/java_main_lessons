package telran.lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Связный список - элементы связаны ссылками между собой
 * Linked List - однонаправленный связный список как структура данных
 *
 * LinkedList in Java - двунаправленный связный список
 *
 * Что лучше использовать ArrayList or LinkedList для добавлениея
 * элементов в конец списка?
 * Linked List (structure) - добавление элемента в конец займет 0(n)
 * LinkedList (Java class) - добавление элемента в конец займет 0(1)
 *
 */

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> listOne = new LinkedList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();

        List<Integer> one = new LinkedList<>();
        List<Integer> two  = new ArrayList<>();

        printList(one);
        printList(two);

        //ArrayList - array
        //LinkedList - objects linked to each other
    }

    private static void printList(List<Integer> integers) {
        for (Integer value : integers) {
            System.out.println(value);
        }
    }
}
