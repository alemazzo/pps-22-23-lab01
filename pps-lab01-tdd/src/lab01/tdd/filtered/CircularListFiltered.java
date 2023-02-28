package lab01.tdd.filtered;

import java.util.Optional;
import java.util.function.Predicate;

public interface CircularListFiltered {

    Optional<Integer> filteredNext(final Predicate<Integer> filter);

}
