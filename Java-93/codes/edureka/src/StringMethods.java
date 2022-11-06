
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka limited";

		System.out.println("size/ no of characters = " + str.length());
		
		System.out.println("character @ index 0 = " + str.charAt(0));
		System.out.println("character @ index 14 = " + str.charAt(14));
		//System.out.println("character @ index 15 = " + str.charAt(15)); //java.lang.StringIndexOutOfBoundsException
		
		System.out.println("index of \"e\" from start = " + str.indexOf("e"));
		System.out.println("index of \"e\" from index 2 = " + str.indexOf("e", 2));
		System.out.println("index of \"e\" from last = " + str.lastIndexOf("e"));
		System.out.println("index of \"limited\" from start = " + str.indexOf("limited"));
		System.out.println("index of \"java\" from start = " + str.indexOf("java")); //-1
		
		System.out.println(str.replace('e', '*'));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());		
		System.out.println(str);
		System.out.println();
		
		String s1 = new String("Java");
		//String s2 = new String("Java");
		String s2 = new String("java");
		System.out.println("equals() = " + s1.equals(s2));
		System.out.println("contentEquals() = " + s1.contentEquals(s2));
		System.out.println("equalsIgnoreCase() = " + s1.equalsIgnoreCase(s2));
	}
}
