package telran.lesson12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TranslateMap {

    public static void main(String[] args) {
        System.out.println("1 - English, 2 - Deutsch, 3 - French");
        Scanner scanner = new Scanner(System.in);
        System.out.println(getGreeting(scanner.nextInt()));
        scanner.close();

    }

    private static String getGreeting(int language) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "Hallo");
        map.put(3, "Bonjour");

        String greetings = map.getOrDefault(language, "No such number");
        return greetings;
    }
}
