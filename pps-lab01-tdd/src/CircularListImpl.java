import lab01.tdd.CircularList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CircularListImpl implements CircularList {

    private final List<Integer> items = new ArrayList<>();
    private Iterator<Optional<Integer>> itemsIterator;

    @Override
    public void add(int element) {
        this.items.add(element);
        this.itemsIterator = IntStream.iterate(0, x -> x + 1)
                .boxed()
                .map(el -> Optional.ofNullable(this.items.get(el % this.items.size())))
                .iterator();
    }

    @Override
    public int size() {
        return this.items.size();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Optional<Integer> next() {
        return this.itemsIterator.next();
    }

    @Override
    public Optional<Integer> previous() {
        return Optional.empty();
    }

    @Override
    public void reset() {

    }
}
