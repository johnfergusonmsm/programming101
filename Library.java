import java.util.ArrayList;

public class Library {
	
	private ArrayList<Book> books;

	Library(){
		books = new ArrayList<book>();
	}

	public void addBook (Book book){
		books.add(book);
	}

	public void printCurrentStatus(){
		System.out.println("Current Number of books: " + books.size());

		for(int i=0; <books.length; i++) {
			System.out.println("Book No" + i + ": " + books.get(i).getName());
		}
	}
}