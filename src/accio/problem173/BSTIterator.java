package accio.problem173;

import java.util.Stack;

/**
 * Created by Yuhuan Jiang (jyuhuan@gmail.com) on 10/30/15.
 */
public class BSTIterator {
    TreeNode _root;
    Stack<TreeNode> _fringe = new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        _root = root;
        if (_root != null) pushLeft(_root);
    }

    private void pushLeft(TreeNode n) {
        TreeNode node = n;
        _fringe.push(node);
        while (node.left != null) {
            _fringe.push(node.left);
            node = node.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (_root == null) return false;
        else return !_fringe.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode top = _fringe.pop();
        TreeNode r = top.right;
        if (r != null) pushLeft(r);
        return top.val;
    }
}
