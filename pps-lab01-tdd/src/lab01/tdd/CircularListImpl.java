package lab01.tdd;

import lab01.tdd.CircularList;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class CircularListImpl implements CircularList {

    private final List<Integer> items = new ArrayList<>();
    private int nextElement = 0;

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
        return this.size() == 0;
    }

    @Override
    public Optional<Integer> next() {
        if (this.isEmpty()) {
            return Optional.empty();
        }
        final int element = this.items.get(this.nextElement);
        this.nextElement = (this.nextElement + 1) % this.items.size();
        return Optional.of(element);
    }

    @Override
    public Optional<Integer> previous() {
        if (this.isEmpty()) {
            return Optional.empty();
        }
        this.nextElement = this.nextElement == 0 ?
                this.items.size() - 1 :
                this.nextElement - 1;
        return Optional.of(this.items.get(nextElement));
    }

    @Override
    public void reset() {
        this.nextElement = 0;
    }
}
