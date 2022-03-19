package Easy;

public class Solution_606 {
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "0";
        }
        StringBuilder str = new StringBuilder();
        str.append(root.val);
        if (root.left != null) {
            str.append("(");
            str.append(tree2str(root.left));
            str.append(")");
        }
        if (root.right != null) {
            if (root.left == null) {
                str.append("()");
            }
            str.append("(");
            str.append(tree2str(root.right));
            str.append(")");
        }
        return str.toString();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}