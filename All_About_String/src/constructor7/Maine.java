package constructor7;

public class Maine {

	public static void main(String[] args) {
		
		//byte array with ASCII numbers get converted into string
		//Here we are creating a string with ASCII numbers of 'byte' datatype
		
		byte [] arr = new byte [] {65, 66, 67, 68, 69, 70, 71, 72};
		
		String str = new String(arr, 0, 5);
		System.out.println(str);
	}

}
