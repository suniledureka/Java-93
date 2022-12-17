package co.edureka.threads;

class Naturals extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName().toUpperCase() + " ---> " + i);
		}
	}
}

public class ThreadTest3 {

	public static void main(String[] args) throws InterruptedException {
		Naturals nat = new Naturals();
		Evens eve = new Evens();
		
		nat.setName("natural");
		eve.setName("even   ");
		
		nat.start();
		eve.start();
		System.out.println("no of threads = " + Thread.activeCount());
		
		Thread.sleep(5000);
		System.out.println("no of threads = " + Thread.activeCount());
	}
}

class Evens extends Thread{
	public void run() {
		for(int i=2; i<=20; i+=2) {
			System.out.println(Thread.currentThread().getName().toUpperCase() + " ---> " + i);
		}
	}
}