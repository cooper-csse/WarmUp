

/**
 * 
 * @author anderson
 * 
 * @param <T>
 *            Any Comparable type
 * 
 *            A linked list whose elements are kept in sorted order.
 */
public class SortedLinkedList<T extends Comparable<T>> extends
		DLL<T> {

	/**
	 * Create an empty list
	 * 
	 */
	public SortedLinkedList() {
		super();
	}

	/**
	 * Creates a sorted list containing the same elements as the parameter
	 * 
	 * @param list
	 *            the input list
	 */
	public SortedLinkedList(DLL<T> list) {
		super();
		DLLIterator<T> i = list.iterator();
		while (i.hasNext()) {
			this.add(i.next());
		}
	}

	/**
	 * Adds the given element to the list, keeping it sorted.
	 */
	@Override
	public void add(T element) {
		Node item = this.head;
		while (item.next.data != null) {
			if (item.next.data.compareTo(element) > 0) break;
			item = item.next;
		}
		item.addAfter(element);
	}

	@Override
	public void addFirst(T element) {
		throw new UnsupportedOperationException("Cannot prepend item to sorted list.");
	}

	@Override
	public void addLast(T element) {
		throw new UnsupportedOperationException("Cannot append item to sorted list.");
	}
}
