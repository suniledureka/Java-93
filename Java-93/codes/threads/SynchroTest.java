package co.edureka.threads;

class Printer{
	//public void printTable(int n) {
	  synchronized public void printTable(int n) {
		for(int i=1;i<=10;i++) {
			int p = n * i;
			System.out.println(Thread.currentThread().getName()+" ---> "+ n + "  x " + i + " = " + p);
			try {
				Thread.sleep(500);
			}catch(Exception ex) {}
		}
		System.out.println("--------------------------------------------------------------\n");
		try {
			Thread.sleep(4000);
		}catch(Exception ex) {}		
	}
}

class Computer1 extends Thread{
	Printer printer;

	public Computer1(Printer printer) {
		super();
		this.printer = printer;
	}
	
	public void run() {
		printer.printTable(5);
	}
}

class Computer2 extends Thread{
	Printer printer;

	public Computer2(Printer printer) {
		super();
		this.printer = printer;
	}
	
	public void run() {
		printer.printTable(6);
	}
}

class Computer3 extends Thread{
	Printer printer;

	public Computer3(Printer printer) {
		super();
		this.printer = printer;
	}
	
	public void run() {
		printer.printTable(7);
	}
}


public class SynchroTest {

	public static void main(String[] args) {
		Printer p = new Printer();
		
		Computer1 comp1 = new Computer1(p);
		Computer2 comp2 = new Computer2(p);
		Computer3 comp3 = new Computer3(p);
		
		comp1.start();
		comp2.start();
		comp3.start();
	}

}
