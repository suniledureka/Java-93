
public class Library {

	public static void main(String[] args) {
		Book book = new Book();
		
		book.setBookId(100123);
		book.setBookName("Java Complete Reference");
		book.setBookPrice(750.50f);
		
		System.out.println(book.getBookId() + " | " + book.getBookName() + " | " + book.getBookPrice());
		
		System.out.println("book is an instance of type ----> " + book.getClass().getName());
		
		System.out.println("hashCode of book ----> " + book.hashCode());
		
		System.out.println("hashCode of book in hex decimal form ----> " + Integer.toHexString(book.hashCode()));
		
		System.out.println(book); //toString()
	}

}
