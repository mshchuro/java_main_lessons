package Homework_6.Students.Task3;
/**
 * Загрузить в строку текст (скопируйте пару страниц из книги), найдите самое популярное слово в этом тексте , за исключением пробела
 */

import java.util.HashMap;
import java.util.Map;

public class Task_3 {

    public static void main(String[] args) {
        String text = "As we can see, the key declaration has the final keyword. Therefore, we cannot reassign a key object after we put it into a HashMap.\n" +
                "\n" +
                "Although we cannot simply replace a key, we can still achieve our expected result in other ways. Next, Let’s look at our problem from a different angle.";

        text = text.toLowerCase();
        String[] words = text.split(" ");

        Map<String, Integer> count = new HashMap<>();
        for (String word : words) {
            if (!word.isBlank()) {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }
        }
        
        String mostPopularWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostPopularWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Most popular word is - " + mostPopularWord);
    }
}
