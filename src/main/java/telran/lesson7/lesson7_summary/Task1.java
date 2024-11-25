package telran.lesson7.lesson7_summary;

//Имеется заданный список имен студентов:
//List<String> names = new ArrayList<>(Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));
//С помощью итератора:
//a). Вывести имена, состоящие из 4 букв
//b). Удалить из списка null и пустые строки.
//С помощью listIterator:
//c). Удалить из списка все имена, начинающиеся на "T"
//d). Заменить в списке "Ann" на "student Ann"

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(null, "Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value != null && value.length() == 4) {
                System.out.println(value + " ");
            }
        }

        Iterator<String> iterator2 = names.iterator();
        while (iterator2.hasNext()) {
            String result = iterator2.next();
            if (result == null || result.isEmpty()) {
                iterator2.remove();
            }
        }
        System.out.println(names);

        ListIterator<String> iterator3 = names.listIterator();
        while(iterator3.hasNext()) {
            String result2 = iterator3.next();
            if (result2.charAt(0) == 'T'){
                iterator3.remove();
            }
        }
        System.out.println(names);


        while (iterator3.hasPrevious()) {
            String result3 = iterator3.previous();
            if (result3.equals("Ann")) {
                iterator3.set("student Ann");
            }
        }
        System.out.println(names);
    }
}
