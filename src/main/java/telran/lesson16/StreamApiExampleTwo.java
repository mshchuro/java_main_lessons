package telran.lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * stream() - создание потока у любой коллекции
 *
 * Intermediate - конвеерные операции, они могут идти подряд друг за другом
 * количество таких команд не ограничено
 *
 * После оператора stream мы получаем поток данных, но и после каждой
 * промежуточной операции, мы тоже получаем поток данных и только
 * после терминальной операции мы получаем результат
 *
 * Terminal - конечная операция, без нее никакой набор команд стрима не будет
 * выполнен
 *
 * collection.stream().Intermediate.Intermediate....Intermediate.Intermediate.Terminal
 *
 * Любые изменения стрима не изменяют оргинальный набор данных
 *
 * Intermediate :
 * filter(predicate) - filter for elements
 * sorted() - sort stream
 * skip(n) - skip n elements
 * limit(n) - limit n elements
 * distinct - only unique elements
 * peek(consumer) - any action for every element
 * map(function) - convert elements
 * flatmap(function)
 *
 * Terminal :
 * count() - count elements in stream
 * collect - collect elements to Collection, String ... etc
 * foreach(consumer) - any action for every element
 * findfirst() - get first element (optional type)
 * findAny() - get any (optional)
 * max(comparator), min (comparator) - (optional type) - return (optional type)
 */

public class StreamApiExampleTwo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("10", "20", "1", "15", "20", "10", "50", "25");
        long count = list.stream().count();
        System.out.println("Count = " + count);

        //"20"
        long count1 = list.stream().filter(s -> "20".equals(s)).count();
        System.out.println(count1);
        //filter
        //list.stream() <data stream>
        //<data stream> -> .filter(predicate). -> <data stream>
        //list.stream().filter(predicate)

        //collect
        //filter list, string startsWith("1") and add to new list
        List<String> collect = list.stream()
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());

        //sorted()
        List<String> collect1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list " + collect1);

        //skip
        List<String> collect2 = list.stream().skip(3).collect(Collectors.toList());
        System.out.println(collect2);

        //limit
        List<String> collect3 = list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(collect3);

        List<String> collect4 = list.stream().sorted().limit(1).collect(Collectors.toList());
        System.out.println(collect4);

        //distinct
        List<String> collect5 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect5);

        //peek
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + " ");
            }
        };

        List<String> collect6 = list.stream().peek(stringConsumer).sorted()
                .peek(stringConsumer)
                .filter(s -> s.startsWith("1"))
                .peek(stringConsumer)
                .collect(Collectors.toList());
        System.out.println(collect6);

        //foreach
        list.stream().sorted()
                .filter(s -> s.startsWith("1"))
                .forEach(s -> System.out.print(s + " "));
    }

    private List<String> getFilteredList(List<String> list) {
        return list.stream()
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
    }
}
