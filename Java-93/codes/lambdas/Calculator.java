package co.edureka.lambdas;

@FunctionalInterface
interface Nums{
	void add(int x, int y);
}

public class Calculator {
	
	public static void main(String[] args) {
		
		Nums ref = (x, y) -> System.out.println("sum = " + (x+y));
		
		ref.add(10,20);
	}

}
