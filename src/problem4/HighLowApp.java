package problem4;

public class HighLowApp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"Zeb", "Deb", "Will", "Karen", "Aaron", "Chris", "Barb", "Kenny"};
		System.out.println("Original order:");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		HighLow<String> highLow = new HighLow<String>(array);
		System.out.println("The lowest value:");
		System.out.println(highLow.getLowest());
		System.out.println("The highest value:");
		System.out.println(highLow.getHighest());
	}

}
