package goto2011aar.example1;

public class OrderPosition {

	private final Book book;
	private final int amout;

	public OrderPosition(Book book, int amout) {
		this.book = book;
		this.amout = amout;
	}

	public Book getBook() {
		return book;
	}

	public int getAmout() {
		return amout;
	}

	public double getPrice() {
		return book.getPrice() * amout;
	}
}
