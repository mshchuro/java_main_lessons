package telran.lesson15.lesson15_summary;

import java.util.function.Consumer;

public class ConsumerTask {

    public static void main(String[] args) {
        Consumer<Integer> check = (number) -> {
            if (number % 2 == 0) {
                System.out.println(number);
            } else {
                System.err.println(number);
            }
        };

        check.accept(4);
        check.accept(3);

        int b = 1234;
        String a  = "Max";
    }
}
