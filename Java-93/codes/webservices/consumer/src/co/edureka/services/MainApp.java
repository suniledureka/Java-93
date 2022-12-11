package co.edureka.services;

public class MainApp {

	public static void main(String[] args) throws Exception {
		NumsServiceLocator locator = new NumsServiceLocator();
		Nums numsRef = locator.getNums();
		
		int x = 10;
		int y = 20;
		
		System.out.println("sum = " + numsRef.add(x, y));
		System.out.println("diff = " + numsRef.sub(x, y));
	}
}