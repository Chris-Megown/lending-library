import java.util.ArrayList;

public class Book {

	private String title;
	private String author;
	private String bookISBN;
	private String category;

	public Book(String title, String author, String bookISBN, String category) {
		this.title = title;
		this.author = author;
		this.bookISBN = bookISBN;
		this.category = category;

		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add("BillsAdventure", "Bill", "1234", "Adventure");
	}

}
