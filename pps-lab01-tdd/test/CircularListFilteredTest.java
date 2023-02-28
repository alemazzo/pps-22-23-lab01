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
        final Optional<Integer> next = this.circularList.filteredNext(i -> true);
    }

}
