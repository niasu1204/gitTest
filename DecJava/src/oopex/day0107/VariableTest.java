package oopex.day0107;

class Variable{
	//멤버변수는 값을 저장하지 않으면 기본값을 저장하고 있다.
	static int cv = 1; // 클래스 변수
	int iv = 2; //인스턴스 변수
	void method() {
		int lv = 3; //지역변수
		System.out.println(lv); 
	}	
}
public class VariableTest {
	public static void main(String[] args) {
		System.out.println(Variable.cv);
		
		Variable v = new Variable();
		System.out.println(v.iv);
		
		v.method();
	} 
}



