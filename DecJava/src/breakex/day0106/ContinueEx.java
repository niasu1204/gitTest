package breakex.day0106;

public class ContinueEx {

	public static void main(String[] args) {
		//for문의 증감식으로 이동(다음 회차 실행)
		for(int i = 1; i<= 10; i++) {
			if(i % 4 != 0) { continue; }
			System.out.println(i);
		}
	}
}
