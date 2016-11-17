/**
 * A class that implements the ADT list using a chain of
 * linked nodes that has a head reference.
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @author William C. Garrison III
 * @version 4.1
 */
public class LinkedList<T> implements ListInterface<T> {
    private Node head;
    private int size;

    private class Node {
        private T data;
        private Node next;

        private Node(T dataPortion) {
            data = dataPortion;
            next = null;
        }

        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }
    }

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(T newEntry) {
        Node newNode = new Node(newEntry);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node lastNode = getNodeAt(size-1);
            lastNode.next = newNode;
        }

        size++;
    }

    public void add(int newPosition, T newEntry) {
        if (newPosition >= 0 && newPosition <= size) {
            Node newNode = new Node(newEntry);
            if (newPosition == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node prev = getNodeAt(newPosition - 1);
                newNode.next = prev.next;
                prev.next = newNode;
            }
            size++;
        } else
            throw new IndexOutOfBoundsException("Illegal position " +
                    newPosition + " given for add operation.");
    }

    public T remove(int position) {
        T result = null;

        if (position >= 0 && position < size) {
            assert !isEmpty();

            if (position == 0) {
                result = head.data;
                head = head.next;
            } else {
                Node prev = getNodeAt(position - 1);
                result = prev.next.data;
                prev.next = prev.next.next;
            }
            size--;
            return result;
        } else {
            throw new IndexOutOfBoundsException("Illegal position " + position +
                    " given to remove operation.");
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public T replace(int position, T newEntry) {
        if (position >= 0 && position < size) {
            assert !isEmpty();

            Node replaceNode = getNodeAt(position);
            T oldEntry = replaceNode.data;
            replaceNode.data = newEntry;
            return oldEntry;
        } else {
            throw new IndexOutOfBoundsException("Illegal position " + position +
                    " given to replace operation.");
        }
    }

    public T get(int position) {
        if (position >= 0 && position < size) {
            assert !isEmpty();
            return getNodeAt(position).data;
        } else {
            throw new IndexOutOfBoundsException("Illegal position " + position +
                    " given to get operation.");
        }
    }

    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[size];

        Node current = head;
        for (int index = 0; index < size; index++) {
            result[index] = current.data;
            current = current.next;
        }
        assert current == null;

        return result;
    }

    public boolean contains(T entry) {
        return indexOf(entry) >= 0;
    }

    public int indexOf(T entry) {
        int result = -1;
        Node current = head;

        for (int index = 0; result < 0 && index < size; index++) {
            if ((entry == null && current.data == null) ||
                    (entry != null && entry.equals(current.data))) {
                result = index;
            } else {
                current = current.next;
            }
        }

        return result;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        boolean result;

        if (size == 0) {
            assert head == null;
            result = true;
        } else {
            assert head != null;
            result = false;
        }

        return result;
    }

    private Node getNodeAt(int position) {
        assert !isEmpty() && (0 <= position) && (position < size);
        Node currentNode = head;

        for (int counter = 0; counter < position; counter++) {
            currentNode = currentNode.next;
        }
        assert currentNode != null;

        return currentNode;
    }

    /**
     * THIS IS THE O(n) SOLUTION
     */
    public void reverse() {
        Node newHead = null;

        for (int i = 0; i < size; i++) {
            Node prev = newHead;
            newHead = head;
            head = head.next;
            newHead.next = prev;
        }
        head = newHead;
    }
}

