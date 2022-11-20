package co.edureka;

public class WrapperTest2 {

	public static void main(String[] args) {
		float f1 = 12.34f;
		Float f2 = f1; //auto-boxing
		float f3 = f2; //auto-unboxing
		System.out.println(f1 + " | " + f2 + " | " + f3);
		
		System.out.println(Float.parseFloat("12.345"));
	}
}
