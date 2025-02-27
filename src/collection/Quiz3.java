package collection;

import java.util.ArrayList;
import java.util.List;

public class Quiz3 {

	public static void main(String[] args) {

		List<Book> list = new ArrayList<Book>();

		list.add(new Book(1, "삼국지"));
		list.add(new Book(2, "파과"));
		list.add(new Book(3, "모순"));

		for (Book book : list) {
			System.out.println(book); // book.toString() 과 같음
		}

	}

}

class Book {

	int bookNumber; // 책번호
	String bookTitle; // 제목

	public Book(int bookNumber, String bookTitle) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}

}