package telran.lesson13;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  BFS - Breadth First Search - поиск в ширину (горизонтальный поиск), обход дерева по уровням
 * (итеративный подход)
 *
 *  DFS - Depth First Search - поиск в глубину (вертикальный поиск), обход по веткам
 *  (рекурсивный подход) (Inorder, Preorder, Postorder)
 */
public class BTreeApp {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.getSampleTree();

        breadthFirstSearch(root);
        System.out.println();

        breadthFirstSearchWithLevelPrint(root);
        System.out.println();

        inOrderDepthFirstSearch(root);
        System.out.println();

        preOrderDepthFirstSearch(root);
        System.out.println();

        postOrderDepthFirstSearch(root);

    }

    /**
     * 1. Идем сначала по левому поддереву
     * 2. Идем по правому поддереву
     * 3. Посещаем корень
     * Корень в конце
     */
    private static void postOrderDepthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }

        preOrderDepthFirstSearch(root.getLeft());
        preOrderDepthFirstSearch(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    /**
     * 1. Посещаем корень
     * 2. Идем сначала по левому поддереву
     * 3. Идем по правому поддереву
     * Корень сразу
     */
    private static void preOrderDepthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.getValue() + " ");
        preOrderDepthFirstSearch(root.getLeft());
        preOrderDepthFirstSearch(root.getRight());
    }

    /**
     * 1. Идем сначала по левому поддереву
     * 2. Посещаем корень
     * 3. Идем по правому поддереву
     * Корень между левым и правым
     */
    private static void inOrderDepthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderDepthFirstSearch(root.getLeft());
        System.out.print(root.getValue() + " ");
        inOrderDepthFirstSearch(root.getRight());
    }

    private static void breadthFirstSearchWithLevelPrint(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>(); // queue
        queue.add(root); // queue: 8

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                System.out.println(node.getValue() + " ");
                //Add left element to queue
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                //Add right element to queue
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
            System.out.println();
        }
    }

    private static void breadthFirstSearch (TreeNode root){
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>(); // queue
        queue.add(root); // queue: 8
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); // 8 4 // queue: 3
            System.out.println(node.getValue() + " "); // 8 4
            //Add left element to queue
            if (node.getLeft() != null) {
                queue.add(node.getLeft()); // queue: 4
            }
            //Add right element to queue
            if (node.getRight() != null) {
                queue.add(node.getRight()); // queue: 4, 3
            }
        }
    }
}


