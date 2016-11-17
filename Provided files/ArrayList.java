import java.util.Arrays;

/**
 * A class that implements the ADT list using a resizable array.
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @author William C. Garrison III
 * @version 4.1
 */
public class ArrayList<T> implements ListInterface<T> {

    private T[] list;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            initialCapacity = DEFAULT_CAPACITY;
        }

        @SuppressWarnings("unchecked")
        T[] tempList = (T[])new Object[initialCapacity];
        list = tempList;
        size = 0;
    }

    public void add(T newEntry) {
        add(size, newEntry);
    }

    public void add(int newPosition, T newEntry) {
        if (newPosition >= 0 && newPosition <= size) {
            if (newPosition <= size - 1) {
                makeRoom(newPosition);
            }
            list[newPosition] = newEntry;
            size++;
            ensureCapacity();
        } else {
            throw new IndexOutOfBoundsException("Illegal position " + newPosition +
                    " given for add operation.");
        }
    }

    public T remove(int position) {
        if (position >= 0 && position <= size - 1) {
            assert !isEmpty();
            T result = list[position];

            if (position < size - 1) {
                removeGap(position);
            }

            size--;
            return result;
        } else {
            throw new IndexOutOfBoundsException("Illegal position " + position +
                    " given to remove operation.");
        }
    }

    public void clear() {
        for (int index = 0; index < size; index++) {
            list[index] = null;
        }

        size = 0;
    }

    public T replace(int position, T newEntry) {
        if (position >= 0 && position < size) {
            assert !isEmpty();
            T originalEntry = list[position];
            list[position] = newEntry;
            return originalEntry;
        } else {
            throw new IndexOutOfBoundsException("Illegal position " + position +
                    " given to replace operation.");
        }
    }

    public T get(int position) {
        if (position >= 0 && position < size) {
            assert !isEmpty();
            return list[position];
        } else {
            throw new IndexOutOfBoundsException("Illegal position " + position +
                    " given to get operation.");
        }
    }

    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[size];

        for (int index = 0; index < size; index++) {
            result[index] = list[index];
        }

        return result;
    }

    public boolean contains(T entry) {
        return indexOf(entry) >= 0;
    }

    public int indexOf(T entry) {
        int result = -1;

        for (int index = 0; result < 0 && index < size; index++) {
            if ((entry == null && list[index] == null) ||
                    (entry != null && entry.equals(list[index]))) {
                result = index;
            }
        }

        return result;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        int capacity = list.length;
        if (size >= capacity) {
            int newCapacity = 2 * capacity;
            list = Arrays.copyOf(list, newCapacity);
        }
    }

    private void makeRoom(int newPosition) {
        assert (newPosition >= 0) && (newPosition < size);

        for (int index = size - 1; index >= newPosition; index--) {
            list[index + 1] = list[index];
        }
    }

    private void removeGap(int position) {
        assert (position >= 0) && (position < size);

        int removedIndex = position;
        int lastIndex = size;

        for (int index = removedIndex; index < lastIndex; index++) {
            list[index] = list[index + 1];
        }
    }

    /**
     * This implementation uses O(n) additional memory. You should reimplement
     * this method in-place: without using O(n) extra memory (Hint: swaps). Be
     * sure to test with both even and odd lengths!
     */
    public void reverse() {
        @SuppressWarnings("unchecked")
        T[] temp = (T[])new Object[list.length];
        for (int i = 0; i < size; i++) {
            temp[i] = list[size-1-i];
        }
        list = temp;
    }

}

