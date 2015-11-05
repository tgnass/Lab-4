package problem2;

import java.util.Scanner;

public class ObjectBinarySearcherApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		String[] array = {"Aaron", "Barb", "Chris", "Deb", "Karen", "Kenny", "Will", "Zeb"};
		System.out.println("Array contenets:");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter a value to search for: ");
			String value = input.nextLine();
			ObjectBinarySeacher objectBinarySearch = new ObjectBinarySeacher();
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
