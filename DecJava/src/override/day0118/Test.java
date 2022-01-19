package override.day0118;

class Parent{
	private void method1() {
		System.out.println("parent method 1");
	} // 오버라이딩 할 수 없다.
	public void method2() {
		method1();
	}
}
class Child extends Parent{
//	private void method1() {
//		System.out.println("parent method 1");
//	} 감춰진 상태로 물려받음.
	public void method1() {
		System.out.println("Child method 1");
	}	
//	public void method2() {
//		method1();
//	}
}
public class Test {
	public static void main(String[] args) {
		Child c = new Child();
		c.method2();
		c.method1();
	}
}
