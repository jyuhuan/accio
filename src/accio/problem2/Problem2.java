package accio.problem2;


/**
 * Created by Yuhuan Jiang (jyuhuan@gmail.com) on 10/31/15.
 */


public class Problem2 {
    public static void main(String[] args) {
        ListNode addee0 = new ListNode(6);
        ListNode addee1 = new ListNode(5);
        ListNode addee2 = new ListNode(4);
        ListNode addee3 = new ListNode(3);

        addee0.next = addee1;
        addee1.next = addee2;
        addee2.next = addee3;

        ListNode adder0 = new ListNode(7);
        ListNode adder1 = new ListNode(4);

        adder0.next = adder1;


        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(addee0, adder0);


//        ListNode addee0 = new ListNode(6);
//        ListNode addee1 = new ListNode(5);
//
//        addee0.next = addee1;
//
//        ListNode adder0 = new ListNode(7);
//        ListNode adder1 = new ListNode(4);
//
//        adder0.next = adder1;

//
//        Solution solution = new Solution();
//        ListNode result = solution.addTwoNumbers(addee0, adder0);


        int bp = 0;
    }
}
