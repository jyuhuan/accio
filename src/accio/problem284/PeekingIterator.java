package accio.problem284;

import java.util.Iterator;

/**
 * Created by Yuhuan Jiang (jyuhuan@gmail.com) on 10/30/15.
 */
class PeekingIterator implements Iterator<Integer> {

    Iterator<Integer> iter;
    Integer nextItem = null;
    Boolean isLast = false;

    public PeekingIterator(Iterator<Integer> iterator) {
        iter = iterator;
        if (iter.hasNext()) nextItem = iter.next();
    }

    public Integer peek() {
        return nextItem;
    }

    @Override
    public Integer next() {
        Integer oldItem = nextItem;
        if (iter.hasNext()) nextItem = iter.next();
        else isLast = true;
        return oldItem;
    }

    @Override
    public boolean hasNext() {
        return !isLast;
    }
}
