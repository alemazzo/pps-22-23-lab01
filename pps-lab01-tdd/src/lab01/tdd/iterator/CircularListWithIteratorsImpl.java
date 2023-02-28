package lab01.tdd.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
                Stream.generate(this.elements::stream)
                        .flatMap(i -> i)
                        .iterator();
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        final List<Integer> reversed = new ArrayList<>(this.elements);
        Collections.reverse(reversed);
        return this.isEmpty() ?
                IntStream.of().iterator() :
                Stream.generate(reversed::stream)
                        .flatMap(i -> i)
                        .iterator();
    }

}
