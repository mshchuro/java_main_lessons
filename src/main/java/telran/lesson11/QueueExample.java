package telran.lesson11;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> strings = new LinkedList<>();
        //add element
        // ->
        strings.offer("Java");
        // Java ->
        strings.offer("Hello");
        // Java -> Hello

        System.out.println(strings);

        System.out.println();

        //peek (element) - return element, but not delete
        System.out.println(strings.peek());
        System.out.println(strings.peek());

        System.out.println();

        //poll(), (remove) - return element and delete from queue
        strings.poll();
        System.out.println(strings.peek());
    }
}
