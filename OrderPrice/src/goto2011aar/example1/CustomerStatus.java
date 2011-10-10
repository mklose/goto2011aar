package goto2011aar.example1;

public enum CustomerStatus {
	VIP("vip"), REGULAR("regular");

	private final String description;

	private CustomerStatus(String description) {
		this.description = description;
	}

	public static CustomerStatus fromString(String string) {
		if (CustomerStatus.VIP.toString().equals(string))
			return CustomerStatus.VIP;
		if (CustomerStatus.REGULAR.toString().equals(string))
			return CustomerStatus.REGULAR;
		throw new IllegalArgumentException();
	}

	@Override
	public String toString() {
		return description;
	}

	public boolean isVip() {
		return this == CustomerStatus.VIP;
	}

}
