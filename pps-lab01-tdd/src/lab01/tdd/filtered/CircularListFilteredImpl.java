package lab01.tdd.filtered;

import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class CircularListFilteredImpl implements CircularListFiltered {

    private final CircularList list = new CircularListImpl();

    @Override
    public void add(Integer element) {
        this.list.add(element);
    }

    @Override
    public Optional<Integer> filteredNext(Predicate<Integer> filter) {
        Optional<Integer> next;
        for (int i = 0; i < this.list.size(); i++) {
            next = this.list.next();

            if (next.isEmpty()) {
                return Optional.empty();
            }

            if (filter.test(next.get())){
                return next;
            }
        }
        return Optional.empty();
    }

}
