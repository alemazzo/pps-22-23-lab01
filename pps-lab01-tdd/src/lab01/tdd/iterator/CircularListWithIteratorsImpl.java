package lab01.tdd.iterator;

import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import lab01.tdd.iterator.CircularListWithIterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class CircularListWithIteratorsImpl implements CircularListWithIterators {

    private final List<Integer> elements = new ArrayList<>();

    @Override
    public void add(int element) {
        this.elements.add(element);
    }

    @Override
    public int size() {
        return this.elements.size();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Iterator<Integer> forwardIterator() {
        return this.isEmpty() ?
                IntStream.of().iterator() :
                IntStream.iterate(0, i -> i + 1)
                        .map(i -> this.elements.get(i % this.elements.size()))
                        .iterator();
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        return this.isEmpty() ?
                IntStream.of().iterator() :
                IntStream.iterate(0, i -> i + 1)
                        .map(i -> this.elements.get(this.elements.size() - 1 - (i % this.elements.size())))
                        .iterator();
    }
}
