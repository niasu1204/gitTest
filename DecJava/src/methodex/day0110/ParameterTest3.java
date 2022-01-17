package methodex.day0110;

class ParameterTest3 {
	static void change(int[] x) { // 배열도 참조형 변수
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);//1000
	}
	public static void main(String[] args) {
		int[] x = {10};  // 
		System.out.println("main() : x = " + x[0]);//10

		change(x);//메서드 호출
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);//1000
	}
	
}


