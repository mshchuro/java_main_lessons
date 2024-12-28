package telran.lesson15.lesson15_summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Написать метод, который на вход принимает список String и производит фильтрацию данных согласно реализации
//интерфейса Filter (например, через лямбда-выражение)
//Интерфейс Filter имеет метод apply (String data), с помощью которого можно будет указывать способ фильтрации.
//interface Filter {
//    boolean apply(String data);
//}
//Отфильтрованные данные возвращаются в новом списке.
public class Task6 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "dog", "cucumber");
        //Filter filter = word -> word.length() > 5;

        List<String> filteredOne = getFiltration(strings, data -> data.startsWith("a"));
        System.out.println(filteredOne);

        List<String> filteredTwo = usePredicate(strings, data -> data.startsWith("b"));
        System.out.println(filteredTwo);
    }

    private static List<String> getFiltration(List<String> strings, Filter filter) {
        List<String> newList = new ArrayList<>();
        for (String string : strings) {
            if (filter.apply(string)) {
                newList.add(string);
            }
        }
        return newList;
    }

    private static List<String> usePredicate(List<String> strings, Predicate<String> predicate) {
        List<String> newList = new ArrayList<>();
        for (String string : strings) {
            if (predicate.test(string)) {
                newList.add(string);
            }
        }
        return newList;
    }
}
