import org.mmt.model.catalog.entity;

public class ContactInformation {
	String phoneNumber;
	String emailID;
	public ContactInformation(String phoneNumber, String emailID) {
		super();
		this.phoneNumber = phoneNumber;
		this.emailID = emailID;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
}
