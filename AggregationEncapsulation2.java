package oopsassignment3;


public class AggregationEncapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address2 as = new Address2("Kalyan Nagar,","Banglore");
		
		Address2 aa = new Address2("Keshav Nagar,","Banglore");

				Customer2 cs = new Customer2("jimmy",as,aa);
				cs.getCustomerDetails();

	}

}
