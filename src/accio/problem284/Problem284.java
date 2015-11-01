package accio.problem284;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yuhuan Jiang (jyuhuan@gmail.com) on 10/30/15.
 */
public class Problem284 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
//        l.add(0);
//        l.add(1);
//        l.add(1);
//        l.add(2);
//        l.add(2);
//        l.add(1);
//        l.add(1);
//        l.add(2);
//        l.add(0);
//        l.add(1);
//        l.add(0);
//        l.add(2);
//        l.add(0);

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        PeekingIterator pi = new PeekingIterator(l.iterator());


        while (pi.hasNext()) {
            System.out.println(pi.hasNext());
            System.out.println(pi.peek());
            System.out.println(pi.hasNext());
            System.out.println(pi.next());
            System.out.println(pi.hasNext());
            System.out.println();
        }



    }
}
