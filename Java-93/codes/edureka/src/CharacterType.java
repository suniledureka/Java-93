
public class CharacterType {

	public static void main(String[] args) {
		System.out.println("hexa decimal value of 65 = " + Integer.toHexString(65));
		
		char c = 'A';
		System.out.println(c);
		
		c = 65; //implicit type-casting
		System.out.println(c);
		
		c = '\u0041';
		System.out.println(c);
		
		c = '\u0905';
		System.out.println(c);
		
		c = '\u0c05';
		System.out.println(c);
	}
}
