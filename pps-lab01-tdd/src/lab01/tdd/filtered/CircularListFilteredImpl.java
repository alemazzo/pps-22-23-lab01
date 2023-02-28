package lab01.tdd.filtered;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class CircularListFilteredImpl implements CircularListFiltered {

    private final List<Integer> elements = new ArrayList<>();

    @Override
    public void add(Integer element) {
        this.elements.add(element);
    }

    @Override
    public Optional<Integer> filteredNext(Predicate<Integer> filter) {
        return Optional.empty();
    }

}
