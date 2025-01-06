package Homework_5;

import telran.lesson13.TreeNode;

import java.util.*;

public class Homework {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(14);
        TreeNode one = new TreeNode(6);
        TreeNode two = new TreeNode(18);
        TreeNode three = new TreeNode(5);
        TreeNode four = new TreeNode(7);
        TreeNode five = new TreeNode(16);
        TreeNode six = new TreeNode(22);
        TreeNode seven = new TreeNode(4);
        TreeNode eight = new TreeNode(8);
        TreeNode nin = new TreeNode(15);
        TreeNode ten = new TreeNode(20);
        TreeNode eleven = new TreeNode(24);

        root.setLeft(one);
        root.setRight(two);

        one.setLeft(three);
        one.setRight(four);

        two.setLeft(five);
        two.setRight(six);

        three.setLeft(seven);

        four.setRight(eight);

        five.setLeft(nin);

        six.setLeft(ten);
        six.setRight(eleven);

        int element = 19;
        searchElement(root, element);

        int element1 = 15;
        searchElement(root, element1);

        System.out.println("Reversed tree");
        reverseTree(root);

        getSumLevel(root);
    }

    private static void searchElement(TreeNode root, int element) {
        if (root == null) {
            return;
        }

        TreeNode current = root;
        System.out.print("Path :");
        while (current != null) {
            System.out.print(current.getValue() + "->");
            if (current.getValue() == element) {
                System.out.println("\nElement " + element + " found\n");
                break;
            }
            if (current.getValue() > element) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
    }

    private static void reverseTree(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> listReversValue = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                assert node != null;
                listReversValue.add(node.getValue());
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
        }
        Collections.reverse(listReversValue);
        System.out.println(listReversValue);
    }

    private static void getSumLevel(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int levelSum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelSum += node.getValue();

                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }

            System.out.println("Sum is: " + levelSum);
        }
    }
}
