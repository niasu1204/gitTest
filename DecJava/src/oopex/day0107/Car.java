package oopex.day0107;

public class Car {

	int speed;
	String carNumber;
	String model;
	String color;
	
	Car(){}//기본 생성자 자동 추가
	
	void drive(int s) {
		if(speed + s > 230) {
			speed = 230;
		}else {
			speed += s;
		}
	}
	void slow(int s) {
		if(speed - s < 0) {
			speed = 0;
		}else {
			speed -= s;
		} 	}
	void stop() { speed = 0; }

}
