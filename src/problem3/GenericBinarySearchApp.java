package problem3;

import java.util.Scanner;

import problem1.ObjectQuickSorter;

public class GenericBinarySearchApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"Zeb", "Deb", "Will", "Karen", "Aaron", "Chris", "Barb", "Kenny"};
		System.out.println("Original order:");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		ObjectQuickSorter objectQuickSort = new ObjectQuickSorter();
		objectQuickSort.quickSort(array);		
		System.out.println("Array contenets:");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}		
		System.out.println();
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter a value to search for: ");
			String value = input.nextLine();
			ObjectBinarySeacher<String> objectBinarySearch = new ObjectBinarySeacher<String>();
			int position = objectBinarySearch.search(array, value);
			if(position > -1) {
				System.out.println(value +" was found at position " + position);
			} else {
				System.out.println(value + " was not found");
			}
			System.out.print("Do you want to search again? (Y or N): ");			
		} while(input.nextLine().toLowerCase().equals("y"));
		System.out.println();
	}		
}
