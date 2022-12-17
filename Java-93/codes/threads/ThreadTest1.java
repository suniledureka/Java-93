package co.edureka.threads;

class MyTask1 implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("thread in run() ---> " + t);
	}	
}

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("no of threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println("thread in main() ---> " + t);
		
		MyTask1 task1 = new MyTask1();
		Thread ct = new Thread(task1); //new thread
		ct.start(); //runnable thread
		
		System.out.println("no of threads = " + Thread.activeCount());
	}

}
