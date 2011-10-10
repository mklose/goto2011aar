package goto2011aar.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private final int id;
	private Customer customer;
	private List<OrderPosition> positions = new ArrayList<OrderPosition>();
	
	public Order (int id){
		this.id = id;	
	}
	
	public void setCustomer(Customer customer){
		this.customer = customer;
	}
	public Integer getId() {
		return id;
	}

	public void addPosition(OrderPosition position) {
		positions.add(position);
	}

	public double getPrice() {
		double price = 0;
		for(OrderPosition pos:positions)
			price+= pos.getPrice();
		return price;
	}

	public double getShippingCost() {
		return customer.getShippingCost();
	}

}
