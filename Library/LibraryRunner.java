public class LibraryRunner {
	
	public static void main (String[] arguments){

		Library library = new Library();

		library.addBook(new Book("John's Book", "John Ferguson"));
		library.addBook(new Book("Tom's Book", "Tom Tester"));
        library.addBook(new Book("Jim's Book", "Jim Tester"));


		library.printCurrentStatus();
	}

}