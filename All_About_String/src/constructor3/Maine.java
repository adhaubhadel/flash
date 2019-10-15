package constructor3;

public class Maine {

	public static void main(String[] args) {
		
		// Here we are constructing a string with a character array.
		// Basically we are taking data from a character array and creating a new string.
		
		char [] charArr = new char [] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		
		String str = new String(charArr);
		System.out.println(str);
	}

}
