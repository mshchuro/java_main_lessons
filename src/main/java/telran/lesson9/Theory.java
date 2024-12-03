package telran.lesson9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * List - Линейная структура данных, хранит элементы в порядке добавления
 *
 * Set - Неупорядоченный набор элементов, это набор уникальных элементов
 * Неупородоченная коллекция уникальных(без повторяющихся) объектов
 *
 *                              Interfaces                      Implementations
 * Iterable -> Collection -> Set -> SortedSet -> NavigableSet : TreeSet
 * Iterable -> Collection -> Set -> HashSet
 */
public class Theory {

    public static void main(String[] args) {
        //TreeSet -- хранит только уникальные элементы, добавлет сортировку элементов
        //TreeSet -- основа этого класса красно черное самобалансирующееся дерево
        //TreeSet -> TreeMap -> красно черное самобалансирующееся дерево
        //add(value), remove(value), contains(value) - O(log n)

        //HashSet -- хранит только уникальные элементы, хранит хатично
        //HashSet -- основан на работе Hash таблицы
        //HashSet - HashMap -> на массиве, элементами которого являются связные списки
        //add(value), remove(value), contains(value) - O(1)

        Set<Integer> setOne = new TreeSet<>();
        Set<Integer> setTwo = new HashSet<>();
    }
}
