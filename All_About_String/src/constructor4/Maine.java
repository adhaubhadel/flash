package constructor4;

public class Maine {

	public static void main(String[] args) {
		
	// here we are creating a string with character Array but we are only taking some elements from array.
	// index value 0 dekhi suru garne ani total	5 ota characters liney.
		
		char [] charArr = new char [] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		
		String str = new String(charArr, 4, 4); //start from index 0, take 5 characters total. it should give a, b, c, d, e.
		System.out.println(str);
		
	}

}
