
import java.util.ArrayList;

/**
 * An implementation of the Priority Queue interface using an array list.
 * 
 * @author Matt Boutell and <Cooper Anderson>. Created Mar 29, 2014.
 * 
 * @param <T>
 *            Generic type of PQ elements
 */
public class PQArrayListMin<T extends Comparable<T>> {
	// Requirement: You must use this instance variable without changes.
	private ArrayList<T> items;

	public PQArrayListMin() {
		this.items = new ArrayList<T>();
	}

	public T findMin() {
		return this.isEmpty() ? null : this.items.get(this.items.size()-1);
	}

	public T deleteMin() {
		return this.isEmpty() ? null : this.items.remove(this.items.size()-1);
	}

	public void insert(T item) {
		// This implementation is O(n), as it traverses the whole list:
		for (int i = 0; i < this.items.size(); i++) {
			if (item.compareTo(this.items.get(i)) > 0) {
				this.items.add(i, item);
				return;
			}
		}
		this.items.add(item);

		// This implementation is O(log(n)), as it uses a binary search to find where to put the new item:
		/*int length = this.items.size();
		if (length == 0) {
			this.items.add(item);
			return;
		}
		int index = Math.floorDiv(length - 1, 2);
		System.out.println("Initial Index: " + index + " " + Math.ceil(Math.log(length) / Math.log(2)));
		for (int i = 0; i <= Math.ceil(Math.log(length) / Math.log(2)); i++) {
			int compare = this.items.get(index).compareTo(item);
			int direction = -1;
			if (compare == 0) {
				break;
			} else if (compare > 0) {
				direction = 1;
			}
			index += direction * Math.ceil(length / Math.pow(2, i + 2));
			if (index < 0)
				index = 0;
				break;
		}
		this.items.add(index, item);*/
	}

	public int size() {
		return this.items.size();
	}

	public boolean isEmpty() {
		return this.items.isEmpty();
	}

	public void clear() {
		this.items.clear();
	}
}
