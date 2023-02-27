import lab01.tdd.CircularList;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        return Optional.of(this.items.get(this.nextElement++ % this.size()));
    }

    @Override
    public Optional<Integer> previous() {
        if (this.isEmpty()) {
            return Optional.empty();
        }
        if (this.nextElement == 0) {
            this.nextElement = this.items.size() - 1;
        } else {
            this.nextElement--;
        }
        return Optional.of(this.items.get(this.nextElement % this.size()));
    }

    @Override
    public void reset() {

    }
}
