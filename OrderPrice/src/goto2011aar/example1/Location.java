package goto2011aar.example1;

public class Location {

	private final Double shippingCosts;
	private final int id;
	private final String name;

	public Location(int id, String name, Double shippingCosts) {
		this.id = id;
		this.name = name;
		this.shippingCosts = shippingCosts;

	}

	public Double getShippingCosts() {
		return shippingCosts;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
