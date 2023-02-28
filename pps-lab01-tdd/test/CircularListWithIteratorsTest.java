import lab01.tdd.iterator.CircularListWithIterators;
import lab01.tdd.iterator.CircularListWithIteratorsImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;

public class CircularListWithIteratorsTest {

    private CircularListWithIterators list;

    @BeforeEach
    void beforeEach() {
        list = new CircularListWithIteratorsImpl();
    }

    private void addElements(int ...elements){
        for (int elem : elements) {
            this.list.add(elem);
        }
    }

    @Test
    void testForwardIterator() {
        this.addElements(1, 2);
        final Iterator<Integer> iterator = this.list.forwardIterator();
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
    }

    @Test
    void testBackwardIterator() {
        this.addElements(1, 2);
        final Iterator<Integer> iterator = this.list.backwardIterator();
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
    }

    @Test
    void testEmptyForwardIterator() {
        assertFalse(this.list.forwardIterator().hasNext());
    }

    @Test
    void testEmptyBackwardIterator() {
        assertFalse(this.list.backwardIterator().hasNext());
    }


}
