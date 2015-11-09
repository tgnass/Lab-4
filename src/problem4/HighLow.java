package problem4;

import java.util.Arrays;

public class HighLow <T extends Comparable<T>> {
	private T[] array;
	
	public HighLow(T[] values) {
		array = values;
	}
	
	public T getHighest() {
		GenericQuickSorter.quickSort(array);
		return array[array.length - 1];		
	}
	
	public T getLowest() {
		GenericQuickSorter.quickSort(array);		
		return array[0];
	}

	@Override
	public String toString() {
		return "HighLow [array=" + Arrays.toString(array) + "]";
	}
}
