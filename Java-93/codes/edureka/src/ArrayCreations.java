
public class ArrayCreations {

	public static void main(String[] args) {
		int[] marks = new int[10];
		marks[0] = 98;
		marks[1] = 87;

		System.out.println("size of array = " + marks.length);
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i]+"\t");
		}
		System.out.println();
		
		float []salaries = new float[8];
		for(float sal : salaries) {
			System.out.print(sal+"\t");
		}
		System.out.println();
		
		boolean status[] = new boolean[10];
		for(boolean stat : status) {
			System.out.print(stat+"\t");
		}
		System.out.println();
		
		String[] names = new String[10];
		for(String name : names) {
			System.out.print(name + "\t");
		}
	}

}
