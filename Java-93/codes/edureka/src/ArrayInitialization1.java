
public class ArrayInitialization1 {

	public static void main(String[] args) {
		int[][] n = {{1,2,3}, {4,5}, {6,7,8,9}};
		
		System.out.println("size of array = " + n.length);
		System.out.println();
		
		for(int i=0;i<n.length;i++) {
			System.out.println("size of n["+i+"] = " + n[i].length);
		}
		System.out.println();
		
		//-- display the elements of array in matrix form
		for(int[] x : n) {
			for(int y : x) {
				System.out.print(y + "     ");
			}
			System.out.println();
		}

	}

}
