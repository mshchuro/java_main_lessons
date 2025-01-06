package Homework_5;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TreeNode {
    private  int value;

    private TreeNode left;

    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode() {

    }
}
