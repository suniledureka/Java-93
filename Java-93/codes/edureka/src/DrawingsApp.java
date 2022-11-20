import java.util.Scanner;

public class DrawingsApp {

	public static void main(String[] args) {
		Shape sh;
		//sh = new Shape();//Cannot instantiate the type Shape
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which shape do you want to work with [1.Rect | 2.Circle]: ");
		int shapeType = sc.nextInt();
		
		System.out.println();
		
		switch(shapeType) {
		 case 1:
			 sh = new Rectangle("Yellow", 12, 8);
			 break;
		 case 2:
			 sh = new Circle("Blue", 12.5f);
			 break;
		 default:
			 System.out.println("INVALID SHAPE SELECTED ... TRY AGAIN");
			 return; //System.exit(0)
		}//switch
		
		System.out.println();
		
		System.out.println("=============== YOU SELECTED : " + sh.getClass().getName().toUpperCase() + " ===============\n");
		
		System.out.println("color of " + sh.getClass().getName() + " = " + sh.getColor());
		sh.area();
	}

}
