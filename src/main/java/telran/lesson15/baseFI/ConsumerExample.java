package telran.lesson15.baseFI;

import java.util.function.Consumer;

/**
 * Consumer :
 * method accept
 * Принимает один параметр и ничего не возвращает
 */
public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> printer = (text) -> System.out.println(text);
        printer.accept("Hello");

        Consumer<String> splitter = (text) -> {
            for (int i = 0; i < text.length(); i++) {
                System.out.println(text.charAt(i));
            }
        };
        splitter.accept("Java");

        Consumer<Integer> loopPrinter = (count) -> {
            for (int i = 0; i < count; i++) {
                System.out.println("Hi!");
            }
        };
        loopPrinter.accept(5);


    }
}
