import java.util.ArrayList;

public class Library {

	private ArrayList<Book> books = new ArrayList<Book>();

	public void addBook (Book book){

		books.add(book);
	}

	public void printCurrentStatus (){
		System.out.println("Number of Books in Library: " + books.size());

		        for(int a = 0; a < books.size(); a++) {

		System.out.println("Title: " + books.get(a).getTitle() + " Author: " + books.get(a).getAuthor());
		}

	 }
}