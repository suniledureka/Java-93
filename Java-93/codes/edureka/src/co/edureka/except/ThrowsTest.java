package co.edureka.except;

class UserService{
	public void findUserById(int n) throws InterruptedException {
		//logic to get user details
		System.out.println("find user by id....");
	}
}

public class ThrowsTest {
	public static void main(String[] args) throws InterruptedException {
		UserService service = new UserService();
		try {
			service.findUserById(101);
		}catch(Exception ex) {}
		
		System.out.println("please wait for 5 seconds");
		Thread.sleep(5000); //5000ms - 5 seconds
		System.out.println("thanks for waiting!");
	}
}
