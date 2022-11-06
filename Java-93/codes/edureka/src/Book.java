
public class Book extends java.lang.Object {
	private int bookId;
	private String bookName;
	private float bookPrice;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [Book ID= " + bookId + " | Book Title= " + bookName + " | Book Price= " + bookPrice + "]";
	}
	
	
}
