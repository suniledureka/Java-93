package co.edureka.util;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		Set<Book> books = new TreeSet<Book>(new BookIdComparator());
		
		Book bk1 = new Book(11234, "Java Reference");
		Book bk2 = new Book(11238, "Python Reference");
		Book bk3 = new Book(11232, "Angular Reference");
		Book bk4 = new Book(11236, "React Reference");
		
		books.add(bk1);
		books.add(bk2);
		books.add(bk3);
		books.add(bk4);
		
		//System.out.println(books);
		for(Book bk : books) {
			System.out.println(bk);
		}
	}
}

class BookIdComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {		
		//return 0;
		//return 1;
		//return -1;
		
		if(o1.getBookId() > o2.getBookId())
			return 1;
		else if(o1.getBookId() < o2.getBookId())
			return -1;
		else
			return 0;
	}
	
}
