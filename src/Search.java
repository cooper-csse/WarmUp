

public class Search {
	public static int search(int[] sortedArray, int searchTerm) {
		// TODO You recognize this starting code as a SEQUENTIAL (one at a time, in-order) search. 
		// It runs in O(n) worst-case time.
		// So if there are 1,000,000 items in the array, it will have to make that many comparisons in the worst case.
		// 
		// Since the array is sorted, 
		// replace it with the much-more efficient BINARY search, which runs in O(log n) worst case time. 
		// If there are 1,000,000 items in the array, it will only have to make ~20 comparisons.
		//
		// You can look up binary search algorithm from the CSSE220 materials
		// or here: https://en.wikipedia.org/wiki/Binary_search_algorithm#Procedure

		int index = Math.floorDiv(sortedArray.length-1, 2);
		for (int i = 0; i <= Math.ceil(Math.log(sortedArray.length) / Math.log(2)); i++) {
			if (sortedArray[index] == searchTerm)
				return index;
			int direction = sortedArray[index] < searchTerm ? 1 : -1;
			index += direction * Math.ceil(sortedArray.length / Math.pow(2, (i + 2)));
			if (index < 0)
				return -1;
		}
		return -1;
	}
}
