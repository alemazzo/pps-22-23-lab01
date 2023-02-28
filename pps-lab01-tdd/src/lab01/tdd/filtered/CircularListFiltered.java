package lab01.tdd.filtered;

import java.util.Optional;
import java.util.function.Predicate;

public interface CircularListFiltered {

    void add(Integer element);

    Optional<Integer> filteredNext(final Predicate<Integer> filter);

}
