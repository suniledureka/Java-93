package co.edureka.threads;

class Bank{
	private int bal=10000;
	synchronized public void deposit(float amt) {
		this.bal += amt;
		System.out.println("Rs."+amt+" Credited | Balance: "+ this.bal);
		this.notify();
	}
	
	synchronized public void withdraw(float amt) {
		if(this.bal < amt) {
			try {
				this.wait();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}			
		}
		this.bal -= amt;
		System.out.println("Rs."+amt+" Debited | Balance: "+ this.bal);
	}
}

class DepositThread extends Thread{
	Bank bank;
	DepositThread(Bank bank){
		this.bank = bank;
	}
	public void run() {
		bank.deposit(5000);
	}
}

class WithdrawThread extends Thread{
	Bank bank;
	WithdrawThread(Bank bank){
		this.bank = bank;
	}
	public void run() {
		bank.withdraw(15000);
	}
}

public class InterThreadComm {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		WithdrawThread wt = new WithdrawThread(bank);
		wt.start();
		
		DepositThread dt = new DepositThread(bank);
		dt.start();
	}

}
