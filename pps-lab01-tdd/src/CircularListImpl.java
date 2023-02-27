import lab01.tdd.CircularList;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {

    private final List<Integer> items = new ArrayList<>();

    @Override
    public void add(int element) {
        this.items.add(element);
    }

    @Override
    public int size() {
        return this.items.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Optional<Integer> next() {
        return Optional.empty();
    }

    @Override
    public Optional<Integer> previous() {
        return Optional.empty();
    }

    @Override
    public void reset() {

    }
}