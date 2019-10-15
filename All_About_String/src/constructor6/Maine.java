package constructor6;

public class Maine {
	public static void main(String args[]) {
		
		//Byte array of ASCII numbers get converted into string
		
		//Here we are creating a string with an array of 'byte' datatype.
		//the byte ASCII numbers are converted to characters implicitly.
		
		byte [] arr = new byte [] {65, 66, 67, 68, 69, 70, 71, 72};
		
		String str = new String(arr);
		System.out.println(str);
		
		
	}
}
