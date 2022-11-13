package co.edureka.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		List<Book> library = new ArrayList<Book>();
		
		Scanner sc = new Scanner(System.in);
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y")) {
			System.out.print("enter book id: ");
			int bookId = sc.nextInt();
			sc.nextLine();
			
			System.out.print("enter book title: ");
			String title = sc.nextLine();
			
			Book book = new Book(bookId, title);
			library.add(book);
			
			System.out.print("\n do you want to add more books[Y/N]: ");
			req = sc.nextLine();
		}//while
		System.out.println();
		
		displayLibraryStock(library);
	}

	private static void displayLibraryStock(List<Book> library) {
		System.out.println("================ EDUREA LIBRARY ================");
		
		for(Book bk : library) {
			System.out.println(bk);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		
	}

}
