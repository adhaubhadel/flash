package constructor5;

public class Maine {

	public static void main(String[] args) {
		
		
		// Here integer ASCII numbers are converted to characters implicitly
		//for ASCII numbers to letters conversion, refer to ASCII table in favourites in chrome.
		//3 argument is compulsory while creating a String.
		
		int [] arr = new int [] {65, 66, 67, 68, 69, 70, 71, 72};
		
		String str = new String(arr, 0, 5);
		System.out.println(str);
		
		
	}

}
