package telran.lesson13;

/**
 *  Слева меньше своей вершины
 *  Справа болье своей вершины
 *
 *             14
 *           /    \
 *         6      18
 *        / \     / \
 *       5  7    16  22
 *      /    \   /   /  \
 *     4     8  15  20  24
 *
 *      7 -> 8 -> 7
 */

public class BSTree {

    public static void main(String[] args) {
        //searchElement(TreeUtils.getBSTree(), 20);
    }

    private static void searchElement(TreeNode root, int element) {
        TreeNode current = root;
        System.out.println("Path : ");
        while (current != null) {
            System.out.println(current.getValue() + "->");
            if (current.getValue() == element) {
                System.out.println("Element " + element + " found");
                break;
            }
            if (current.getValue() > element) {
                current = current.getLeft();
                } else {
                current = current.getRight();
            }
        }
    }
}
