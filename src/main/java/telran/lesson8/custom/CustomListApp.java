package telran.lesson8.custom;

public class CustomListApp {

    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        // 5 -> 10 -> 1 -> 4 -> 25 -> 7
        // head : 5
        // get(index), addFirst(int data), addLast(), toString
        //to HW : get(index), remove(index), add(index, data)
        //removeFirst(), removeLast(), size()
        //* Add iterator, add second direction

        customLinkedList.addFirst(7);
        customLinkedList.addFirst(25);
        customLinkedList.addFirst(4);
        customLinkedList.addFirst(1);
        customLinkedList.addFirst(5);
        // 5 -> 10 -> 1 -> 4 -> 25 -> 7
        customLinkedList.addLast(43);
        // 5 -> 10 -> 1 -> 4 -> 25 -> 7 -> 43
        customLinkedList.print();

        //5 -> 10 -> 1 -> null
//        Node three = new Node(1, null);
//        Node two = new Node(10, three);
//        Node one = new Node(5, two);

//        Node current = one;
//        while (current != null) {
//            System.out.print(" " + current.getData() + " ->");
//            current = current.getNext();
//        }
    }
}
