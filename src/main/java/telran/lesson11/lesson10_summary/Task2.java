package telran.lesson11.lesson10_summary;

import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class Task2 {
    //2. На основе библиотечного класса LinkedList реализовать такую структуру данных, как стек:
    //Создать класс CustomStack с методами push(), pop(), peek(). Протестировать работу класса.
    public static void main(String[] args) {

        Stack<String> st = new Stack();

        CustomStack customStack = new CustomStack();
        customStack.push("Hello");
        customStack.push("Java");
        customStack.push("Class");

        System.out.println();
        System.out.println(customStack.peek());
    }
}
