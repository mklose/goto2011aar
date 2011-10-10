package goto2011aar.example1;

public class Customer {

	private final int id;
	private final String name;
	private final CustomerStatus customerStatus;
	private Location location;
	
	public Customer(int id, String name, CustomerStatus customerStatus){
		this.id = id;
		this.name = name;
		this.customerStatus = customerStatus;
		
	}
	
	public int getId() {
		return id;
	}

	public CustomerStatus getCustomerStatus() {
		return customerStatus;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	
	public boolean shippingInEurop(){
		return location.getName().equals("Germany");
	}
	
	public double getShippingCost() {
		if (customerStatus.isVip() && shippingInEurop()) return 0;
		return location.getShippingCosts();
	}
}
