package accio.problem2;

/**
 * Created by Yuhuan Jiang (jyuhuan@gmail.com) on 10/31/15.
 */
public class Solution {

    private int valueOf(ListNode n) {
        if (n == null) return 0; else return n.val;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);

        ListNode addeeFront = l1;
        ListNode adderFront = l2;
        ListNode sumFront = result;

        while (!(addeeFront == null && adderFront == null)) {
            int singleSum = valueOf(addeeFront) + valueOf(adderFront) + valueOf(sumFront);

            if (addeeFront != null) addeeFront = addeeFront.next;
            if (adderFront != null) adderFront = adderFront.next;

            int carry = singleSum / 10;
            int remains = singleSum % 10;

            sumFront.val = remains;
            if (!(addeeFront == null && adderFront == null && carry == 0)) sumFront.next = new ListNode(carry);

            sumFront = sumFront.next;
        }

        return result;
    }
}