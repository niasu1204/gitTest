package inheritance.day0111;

public class Address {

	String postcode;
	String area1;
	String area2;

	Address() {}

	Address(String postcode, String area1, String area2) {
		this.postcode = postcode;
		this.area1 = area1;
		this.area2 = area2;
	}

	@Override
	public String toString() {
		return "Address [postcode=" + postcode + ", area1=" + area1 + ", area2=" + area2 + "]";
	}
	
	

}
