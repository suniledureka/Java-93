package co.edureka.except;

public class CmdTest {

	public static void main(String[] args) {
		System.out.println("no of cmd args = " + args.length);
		
		for(String arg : args) {
			System.out.println("\t----> " + arg);
		}
	}

}
