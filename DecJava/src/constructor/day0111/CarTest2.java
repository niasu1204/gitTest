package constructor.day0111;

class Car2{
	String color;
	String gearType;
	int door;

	Car2(){
//		color = "white";
//		gearType = "auto";
//		door = 4;
		this("white","auto",4);
	}
	Car2(String c){
//		color = c;
//		gearType = "auto";
//		door = 4;
		this(c,"auto", 4);
	}
	
	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	void printCar() {
		System.out.printf("색상 : %s, 기어타입 : %s, 문 : %d\n"
				,color, gearType, door);
	}
}

public class CarTest2 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("red");
		Car2 c3 = new Car2("black","auto",4);
		c1.printCar();
		c2.printCar();
		c3.printCar();
		
	}

}
