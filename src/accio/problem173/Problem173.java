package accio.problem173;

/**
 * Created by Yuhuan Jiang (jyuhuan@gmail.com) on 10/30/15.
 */
public class Problem173 {
    public static void main(String[] args) {


        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(2);
        TreeNode n5 = new TreeNode(5);
        TreeNode n11 = new TreeNode(11);
        TreeNode n12 = new TreeNode(12);
        TreeNode n20 = new TreeNode(20);
        TreeNode n18 = new TreeNode(18);
        TreeNode n15 = new TreeNode(15);
        TreeNode n10 = new TreeNode(10);

        n10.left = n5;
        n10.right = n15;

        n5.left = n2;
        n5.right = n3;

        n2.left = n1;

        n3.right = n4;

        n15.left = n12;
        n15.right = n18;

        n12.left = n11;

        n18.right = n20;

        BSTIterator iter = new BSTIterator(n10);

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
