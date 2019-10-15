package string_Practice_12_27;

public class Maine {

	public static void main(String args[]) {
		
		String str1 = "Ayush";
		String str2 = "Patricia";
		
		//String new = str2.substring(str2.indexOf("c")) + str1;
		
		String naya = str2.substring(str2.indexOf("c")) + str1;
		System.out.println(naya.toUpperCase());
		
		String a = "Hello there yogi there";
		
		System.out.println(a.indexOf("there"));
		
		System.out.println(a.indexOf("there", a.indexOf("there") + 1));
		
		System.out.println(a.lastIndexOf("i"));
		
		int counter = 1;
		
		while (counter <= 10) {
			System.out.println(counter);
			counter++;
		}
		
	}

}
