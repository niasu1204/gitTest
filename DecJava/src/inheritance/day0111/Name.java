package inheritance.day0111;

public class Name {
	String family;
	String name;
	
	Name(){}

	Name(String family, String name) {
		this.family = family;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Name [family=" + family + ", name=" + name + "]";
	}
}
