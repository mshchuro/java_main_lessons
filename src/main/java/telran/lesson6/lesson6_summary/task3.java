package telran.lesson6.lesson6_summary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//3. Имеется заданный список имен студентов:
//List<String> names = Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, "");
//   - Написать метод findNameStartingWith(), который бы возвращал список имен, начинающихся на определенную букву

public class task3 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, "");

        System.out.println(findNameStartingWith(names, 'M'));
    }

    private static List<String> findNameStartingWith(List<String> names, char character) {

        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (name != null && !name.isEmpty() && name.charAt(0) == character) {
                filteredNames.add(name);
            }
        }
        return filteredNames;
    }
}
