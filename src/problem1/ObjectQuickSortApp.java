package problem1;

public class ObjectQuickSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = {"Zeb", "Deb", "Will", "Karen", "Aaron", "Chris", "Barb", "Kenny"};
		System.out.println("Original order:");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Sorted order:");
		ObjectQuickSorter.quickSort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
