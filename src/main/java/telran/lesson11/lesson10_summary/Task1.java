package telran.lesson11.lesson10_summary;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task1 {

    //1. Имеется очередь Queue<String>. Написать метод, возвращающий очередь Queue<String>,
    //в которой элементы расположены в обратном порядке.

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");

        System.out.println("Original queue" + queue);

        System.out.println("Reversed queue" + reverseQueue(queue));

    }

    private static Queue<String> reverseQueue (Queue<String> queue) {
        Deque<String> queueNew = new LinkedList<>();

        //int size = queue.size();
        //for (int i = 0; i < size; i++) {
        //    queueNew.offerFirst(queue.poll());
        //}

        while(!queue.isEmpty()) {
            queueNew.offerFirst(queue.poll());
        }
        return queueNew;
    }
}
