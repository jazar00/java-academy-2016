package exercises.java.InheritanceComposition;

public class Book {
	//variables
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	//constructor
	public Book(String name, Author author, double price, int qty) {
	      this.setName(name);
	      this.setAuthor(author);
	      this.setPrice(price);
	      this.setQty(qty);
	   }

	//getters && setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	//puts author book in a string
		public String toString(){
			String data= name+" "+author+" "+price+" "+qty;
			return data;
		}
}
