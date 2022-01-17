package inheritance.day0111;

public class Person extends Object{

	Name names;
	int age;
	Address addr;
	
	Person() {}

	Person(Name names, int age, Address addr) {
	
		this.names = names;
		this.age = age;
		this.addr = addr;
	}

	@Override // Object클래스로부터 물려받은 toString() 오버라이딩
	public String toString() {
		return "Person [names=" + names.toString() + ", age=" + age + ", addr=" + addr.toString() + "]";
	}

	
}






