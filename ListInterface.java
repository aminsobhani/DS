/**
 * An interface for the ADT list.
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @author William C. Garrison III
 * @version 4.1
 */
public interface ListInterface<T> {
    /**
     * Adds a new entry to the end of this list.
     * Entries currently in the list are unaffected. The list's size is
     * increased by 1.
     * @param newEntry  The object to be added as a new entry.
     */
    public void add(T newEntry);

    /**
     * Adds a new entry at a specified position within this list.
     * Entries originally at and above the specified position are at the next
     * higher position within the list. The list's size is increased by 1.
     * @param newPosition  An integer that specifies the desired position of the
     * new entry.
     * @param newEntry  The object to be added as a new entry.
     * @throws  IndexOutOfBoundsException if newPosition < 0 or
     * newPosition > getSize().
     */
    public void add(int newPosition, T newEntry);

    /**
     * Removes the entry at a given position from this list.
     * Entries originally at positions higher than the given position are at the
     * next lower position within the list, and the list's size is decreased by
     * 1.
     * @param position  An integer that indicates the position of the entry to
     * be removed.
     * @return  A reference to the removed entry.
     * @throws  IndexOutOfBoundsException if position < 0 or
     * position >= getSize().
     */
    public T remove(int position);

    /**
     * Removes all entries from this list.
     */
    public void clear();

    /**
     * Replaces the entry at a given position in this list.
     * @param position  An integer that indicates the position of the entry to
     * be replaced.
     * @param newEntry  The object that will replace the entry at the position
     * position.
     * @return  The original entry that was replaced.
     * @throws  IndexOutOfBoundsException if position < 0 or
     * position >= getSize().
     */
    public T replace(int position, T newEntry);

    /**
     * Retrieves the entry at a given position in this list.
     * @param position  An integer that indicates the position of the desired
     * entry.
     * @return  A reference to the indicated entry.
     * @throws  IndexOutOfBoundsException if position < 0 or
     * position >= getSize().
     */
    public T get(int position);

    /**
     * Retrieves all entries that are in this list in the order in which they
     * occur in the list.
     * @return  A newly allocated array of all the entries in the list. If the
     * list is empty, the returned array is empty.
     */
    public T[] toArray();

    /**
     * Determines whether this list contains a given entry.
     * @param entry  The object that is the desired entry.
     * @return  True if the list contains entry, or false if not.
     */
    public boolean contains(T entry);

    /**
     * Determines the first index of a given entry.
     * @param entry  The object that is the desired entry.
     * @return  The first index of the entry if it is in the list; -1 if not.
     */
    public int indexOf(T entry);

    /**
     * Gets the size of this list.
     * @return  The integer number of entries currently in the list.
     */
    public int getSize();

    /**
     * Sees whether this list is empty.
     * @return  True if the list is empty, or false if not.
     */
    public boolean isEmpty();
}
