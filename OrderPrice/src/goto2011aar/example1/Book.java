package goto2011aar.example1;

public class Book {

	private final int id;
	private final String name;
	private final double price;

	public Book(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

}
