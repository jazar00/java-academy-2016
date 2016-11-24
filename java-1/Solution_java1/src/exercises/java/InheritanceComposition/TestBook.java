package exercises.java.InheritanceComposition;

public class TestBook {
	public static void main(String[] args) {
	      // author instance
	      Author author = new Author("Author", "author@mail.com", 'M');
	      Author author2 = new Author("Author2", "author2@mail.com", 'F');

	      // book instance
	      Book book = new Book("Book", author, 100.00, 20);
	      System.out.println(book);

	      // Test Setters and Getters
	      book.setName("Book2");
	      book.setAuthor(author2);
	      book.setPrice(99.99);
	      book.setQty(19);
	      System.out.println(book); 
	      System.out.println("name: "+book.getName());
	      System.out.println("price: "+book.getPrice());
	      System.out.println("qty: "+book.getQty());
	      System.out.println("author: "+book.getAuthor());
	      

	}
}

