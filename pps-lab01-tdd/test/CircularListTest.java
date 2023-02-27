import lab01.tdd.CircularList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    private CircularList circularList;

    @BeforeEach
    void beforeEach() {
        this.circularList = new CircularListImpl();
    }

    @Test
    void testInitialSizeToBeZero() {
        assertEquals(0, this.circularList.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(this.circularList.isEmpty());
    }

    @Test
    void testItemsCanBeAdded() {
        this.circularList.add(1);
        assertEquals(1, this.circularList.size());
    }

    @Test
    void testNextElement() {
        this.circularList.add(1);
        final Optional<Integer> nextElement = this.circularList.next();
        assertTrue(nextElement.isPresent());
        assertEquals(1, nextElement.get());
    }

    @Test
    void testPreviousElement() {
        this.circularList.add(1);
        this.circularList.add(2);
        this.circularList.next();
        final Optional<Integer> prevElement = this.circularList.previous();
        assertTrue(prevElement.isPresent());
        assertEquals(1, prevElement.get());
    }

    @Test
    void testListCanBeResetted() {
        this.circularList.add(1);
        this.circularList.add(2);
        this.circularList.next();
        this.circularList.reset();
        final Optional<Integer> nextElement = this.circularList.next();
        assertTrue(nextElement.isPresent());
        assertEquals(1, nextElement.get());
    }

    @Test
    void testNextOnEmptyListGiveAnEmptyItem() {
        assertFalse(this.circularList.next().isPresent());
    }

    
}
