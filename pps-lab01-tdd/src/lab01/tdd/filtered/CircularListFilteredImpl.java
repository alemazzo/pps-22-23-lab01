package lab01.tdd.filtered;

import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CircularListFilteredImpl implements CircularListFiltered {

    private final List<Integer> items = new ArrayList<>();
    private final CircularList list = new CircularListImpl();

    @Override
    public void add(final Integer element) {
        this.items.add(element);
        this.list.add(element);
    }

    @Override
    public Optional<Integer> filteredNext(final Predicate<Integer> filter) {
        if (this.items.stream().noneMatch(filter)) {
            return Optional.empty();
        }
        return Stream.generate(this.list::next)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .filter(filter)
                .findFirst();
    }

}
