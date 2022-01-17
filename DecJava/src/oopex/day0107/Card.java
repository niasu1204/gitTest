package oopex.day0107;

public class Card {

	static int width;
	static int height;
	String kind;
	int number;
	
	
	Card(){}//매개변수가 없는 생성자- 기본 생성자
	Card(String k){
		kind = k;
	}
	Card(String k, int n){
		kind = k; // 인스턴스 변수 초기화
		number = n;
	}
	
}
