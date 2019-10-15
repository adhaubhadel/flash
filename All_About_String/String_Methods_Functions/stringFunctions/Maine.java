package stringFunctions;

public class Maine {

	public static void main(String[] args) {
		
		String str = "ABCDEFGHIJ";
		
		System.out.println("1. The length of the string is: " + str.length());
		System.out.println("2. Printing out from the '4th' string: " + str.substring(4));
		System.out.println("3. Printing out '0' to '5th' index not including '5th': " + str.substring(0, 5)); //end index is 5 but not including 5
		System.out.println("4. The index value of 'F' is: " + str.indexOf("F"));
		
		if (str.equals("ABCDEFGHIJ")) {
			System.out.println("5. The string 'str' is equal to the given argument of string.");
		}
		
		if (str.equalsIgnoreCase("abcdefghij")) {
			System.out.println("6. The string 'str' is equal to the given argument ignoring the case.");
		}
		
		System.out.println("7. The character at 4th index is: " + str.charAt(4));
		System.out.println("8. The index of 'E' but we started checking only form '3rd': " + str.indexOf("E", 3));
		
		System.out.println("9. The index of 'G' when checking from right to left: " + str.lastIndexOf("G"));
		System.out.println("10. Does the str contain a part: 'DEF'? Ans is: " + str.contains("DEF"));
		System.out.println("11. Converting the string to lower case: " + str.toLowerCase());
		System.out.println("12. Checking whether the '4th' index value starts with 'E': " + str.startsWith("E", 4));
		System.out.println("13. Checking whether the string starts with 'A': " + str.startsWith("A"));
		System.out.println("14. Checking whether the string ends with 'k': " + str.endsWith("K"));
		System.out.println("15. Concatenating the string with 'xyz': " + str + "xyz");
		System.out.println("16. Converting the string to lower case: " + str.toLowerCase());
		
		String str1 = " ";
		
		System.out.println("17. Checking whether string 'str1' is empty: " + str1.isEmpty());
		
		
		
	}

}
