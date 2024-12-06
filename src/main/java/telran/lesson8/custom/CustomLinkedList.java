package telran.lesson8.custom;

public class CustomLinkedList {

    private Node head;

    //Time complexity 0(1)
    public void addFirst(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            return;
        }

        node.setNext(head);
        head = node;
    }

    //Time complexity 0(n)
    public void addLast(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        while (current.getNext() != null ) {
            current = current.getNext();
        }
        current.setNext(node);
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(" " + current.getData() + " ->");
            current = current.getNext();
        }
    }

    public int get(int index) {
        Node current = head;
        int i = 0;
        while (current != null) {
            if (i == index) {
                return current.getData();
            }
            current = current.getNext();
            i++;
        }
        throw new IndexOutOfBoundsException("Index out of range");
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.getNext() == null) {
                throw new IndexOutOfBoundsException("Index out of range");
            }
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
    }

    public void addIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of range");
            }
            current = current.getNext();
        }
        Node node = new Node(data, current.getNext());
        current.setNext(node);
    }

    public void removeFirst() {
        if (head != null) {
            head = head.getNext();
        }
    }

    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.getNext() == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }


}
