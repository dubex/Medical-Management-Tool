import org.mmt.model.catalog.entity;

public class Company {
	private String companyID;
	private String name;
	private Address address;
	private ContactInformation contactInfo;
	
	
	public Company(String companyID, String name, Address address,
			ContactInformation contactInfo) {
		super();
		this.companyID = companyID;
		this.name = name;
		this.address = address;
		this.contactInfo = contactInfo;
	}
	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
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
	public ContactInformation getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(ContactInformation contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	
}
