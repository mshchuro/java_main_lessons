package telran.lesson11.lesson10_summary;

import java.util.LinkedList;

public class CustomStack {

    //push, pop, peek

    private final LinkedList<String> linkedList = new LinkedList();

    public void push(String str) {

        linkedList.addLast(str);
    }

    public String peek() {

        return linkedList.getLast();
    }

    public String pop() {

        return linkedList.removeLast();
    }

    @Override
    public String toString() {
        return "CustomStack = " + linkedList;
    }
}
