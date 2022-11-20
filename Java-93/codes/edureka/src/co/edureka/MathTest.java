package co.edureka;

import static java.lang.Math.*;
import static java.lang.System.out;

public class MathTest {

	public static void main(String[] args) {
		out.println(PI);
		out.println(E);
		
		out.println(sin(0));
		System.out.println(cos(0));
		
		System.out.println(sqrt(25));
		System.out.println(max(10,20));
		System.out.println(min(10,20));
		
		System.out.println(round(10.567));
		System.out.println(round(10.4567));
		
		System.out.println(ceil(10.1)); //11.0
		System.out.println(floor(10.1)); //10.0
		
		double rand = random();
		System.out.println(rand);
		int otp = (int)(rand * 10000);
		System.out.println("otp = " + otp);
	}

}
