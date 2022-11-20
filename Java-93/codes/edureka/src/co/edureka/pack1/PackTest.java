package co.edureka.pack1;

import co.edureka.pack2.Nums;

class PackTest {

	public static void main(String[] args) {
		Nums numsObj = new Nums();
		
		numsObj.add(10, 20);
		System.out.println("diff = " + numsObj.sub(10, 20));
	}

}
