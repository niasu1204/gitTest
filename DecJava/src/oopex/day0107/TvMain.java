package oopex.day0107;

public class TvMain {

	public static void main(String[] args) {
		
		Tv t; // Tv타입의 변수 t 선언 - Tv클래스로 만든 객체의 주소값
		t = new Tv(); 
		// new : 객체 생성. 메모리의 공간을 할당받고 주소값 지정
		//		클래스에 선언된 변수와 메서드를 인스턴스화 한다.		
		// .  : 객체안에 있는 멤버를 사용
		//티비 켜고
		t.power();
		//채널 7번에 맞추고
		t.channel = 7;
		//채널 한번 올리고
		t.chUp();
		//현재 채널 출력
		System.out.println(t.channel);
		
		Tv t2 = new Tv();
		t2.inch = 100;
		
		System.out.println("t.inch : "+t.inch);
		System.out.println("t2.inch : "+t2.inch);
		
		t = t2;
		System.out.println("after t = t2");
		System.out.println("t.inch : "+t.inch);
		System.out.println("t2.inch : "+t2.inch);
		
	} 

}







