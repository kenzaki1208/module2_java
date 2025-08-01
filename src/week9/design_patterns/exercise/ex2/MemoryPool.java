package week9.design_patterns.exercise.ex2;

import java.util.LinkedList;

public abstract class MemoryPool<T> {
    private LinkedList<T> free_items = new LinkedList<>();

    public void freeIntem(T item) {
        free_items.add(item);
    }

    protected abstract T allocate();

    public T newItem() {
        T out = null;
        if (free_items.size() == 0) {
            out = allocate();
        } else {
            out = free_items.getFirst();
            free_items.removeFirst();
        }
        return out;
    }
}
