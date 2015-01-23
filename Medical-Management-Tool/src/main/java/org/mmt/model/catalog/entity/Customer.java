import org.mmt.model.catalog.entity;

public class Customer {
	private String customerID;
	private String name;
	private Address address;
	
	
	public Customer(String customerID, String name, Address address) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.address = address;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}