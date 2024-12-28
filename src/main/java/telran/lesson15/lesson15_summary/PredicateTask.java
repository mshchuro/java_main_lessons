package telran.lesson15.lesson15_summary;

import java.util.function.Predicate;

public class PredicateTask {

    public static void main(String[] args) {
        Predicate<String> isYellowMonkey = (color) -> "yellow".equals(color);

        String monkey1Color = "yellow";
        String monkey2Color = "brown";

        System.out.println(isYellowMonkey.test(monkey1Color));
        System.out.println(isYellowMonkey.test(monkey2Color));
    }
}
