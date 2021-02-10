package oopsassignment3;

public class Customer2 {
	private String customerName;
	private Address2 residentialAddress;
	private Address2 officialAddress;
	public Customer2(String customerName, Address2 residentialAddress, Address2 officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
		
	}
	public Address2 getOfficialAddress() {
		return officialAddress;
	}
	public void setOfficialAddress(Address2 officialAddress) {
		this.officialAddress = officialAddress;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address2 getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address2 residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	void getCustomerDetails()
	{
		System.out.println("Customer name : "+customerName);
		System.out.print("Residential address : "+residentialAddress.getAddressLine());
		System.out.println(residentialAddress.getCity());
		System.out.print("Office address : "+officialAddress.getAddressLine());
		System.out.print(officialAddress.getCity());
		

		
	}
	

}
