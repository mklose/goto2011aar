package goto2011aar.example2;

import java.util.ArrayList;
import java.util.List;

public class BookOrder {

	private CustomerStatus customerStatus;
	private boolean isGermany;
	private List<Book> books = new ArrayList<Book>();
	private double shippingCostWorld = 30;
	private double shippingCostGermany = 10;

	public double getShippingCostGermany() {
		return shippingCostGermany;
	}

	public double getShippingCostWorld() {
		return shippingCostWorld;
	}

	public void addBooks(int amount, Book book) {
		for (int i = 0; i < amount; i++)
			books.add(book);
	}

	public void setCustomerStatus(CustomerStatus customerStatus) {
		this.customerStatus =customerStatus;
	}

	public void setLocation(String location) {
		isGermany = (location.equals("Germany"));
	}

	public double getPrice() {
		double price = 0;
		for (Book book : books)
			price += book.getPrice();
		return price;
	}

	public double getShippingCost() {
		if (customerStatus.isVip() && isGermany)
			return 0;
		if (isGermany)
			return getShippingCostGermany();
		return getShippingCostWorld();
	}

}
