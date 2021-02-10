package oopsassignment3;

public class Address2 {
	private String addressLine;
	private	String city;
	public Address2(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	void getAddressDetails()
	{
		System.out.print(addressLine);
		System.out.println(city);

		
	}

}
