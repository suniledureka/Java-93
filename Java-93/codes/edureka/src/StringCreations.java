
public class StringCreations {

	public static void main(String[] args) {
		String s1 = "edureka";
		String s2 = "edureka";
		System.out.println("s1 == s2 -----> " + (s1==s2));
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println("s3 == s4 -----> " + (s3==s4));
		
		//s1.concat(" ltd");
		s1 = s1.concat(" ltd");
		System.out.println(s1);
	}

}
