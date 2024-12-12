package telran.lesson12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * (Previous : List -> value, Set -> value, Queue -> value)
 * Map :
 * Одно значение в мапе это пара элементов key -> value
 * Пара неделимая, одному ключу соотвествует свое значение
 * Map -> HashMap -> LinkedHashMap
 * Map -> SortedMap -> TreeMap
 * для параллельной работы - ConcurrentHashMap
 *
 * put(key, value) - помещает пару в мапу
 * Значение в мапу помещаются по ключу
 * map.put("apple", 100) - это значит, что по ключу "apple"
 * помещаются значение 100
 *
 * Для получение значения по ключу используется метод
 * value = get(key), в параметры метода передаются ключ,
 * ответом будет то значение, что есть по ключу
 *
 * Ключ это уникальное значение - дублей быть не может
 * Ключ в мапе это и есть тот объект, у которого вычисляется
 * hashcode и на основании которого ищется место во внутреннем
 * массиве куда положить нашу пару
 *
 * Значения по разным ключам могут быть одинаковые
 *
 * put, get, containsKey - Time complexity 0(1)
 *
 * null - может быть ключем в мапе
 * помещается всегда во внутренний массив table[0]
 */
public class MapExample {

    public static void main(String[] args) {
        //key -> String, value -> Integer
        Map<String, Integer> map = new HashMap<>();
        // good : price
        // apple - 100
        // pineapple - 150
        // lemon - 50
        // carrot - 20

        map.put("apple", 100);
        map.put("pineapple", 150);
        map.put("lemon", 50);
        map.put("carrot", 20);

        //System.out.println(map);

        //Integer carrotPrice = map.get("carrot");
        //System.out.println("Carrot price is " + carrotPrice);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println("Pair : key = " + key + ", value = " + value);
        }

        System.out.println();

        map.forEach((k, v) -> System.out.println("Pair : key = " + k + ", value = " + v));
    }
}
