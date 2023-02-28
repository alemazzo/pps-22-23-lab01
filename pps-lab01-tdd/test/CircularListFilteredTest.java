import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import lab01.tdd.filtered.CircularListFiltered;
import lab01.tdd.filtered.CircularListFilteredImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListFilteredTest {

    private CircularListFiltered circularList;

    @BeforeEach
    void beforeEach() {
        this.circularList = new CircularListFilteredImpl();
    }

    @Test
    void testFilterOnEmptyList() {
        final Optional<Integer> next = this.circularList.filteredNext(this::filterIdentity);
        assertFalse(next.isPresent());
    }

    private void addElements(int ...args) {
        for (int element : args){
            this.circularList.add(element);
        }
    }

    @Test
    void testEvenNumbers() {
        this.addElements(1, 2, 3, 4);
        Optional<Integer> next = this.circularList.filteredNext(this::filterEven);
        assertTrue(next.isPresent());
        assertEquals(2, next.get());
        next = this.circularList.filteredNext(this::filterEven);
        assertTrue(next.isPresent());
        assertEquals(4, next.get());
    }

    private boolean filterEven(int element){
        return element % 2 == 0;
    }
    private boolean filterIdentity(int element) {
        return true;
    }

}
