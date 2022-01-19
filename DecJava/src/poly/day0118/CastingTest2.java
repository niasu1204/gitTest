package poly.day0118;

class CastingTest2 {
	public static void main(String args[]) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;

		car.drive();
		if (car instanceof FireEngine) {
			System.out.println("(FireEngine)실행");
			fe = (FireEngine) car;// error FireEngine fe = new Car();
		}else {
			fe = new FireEngine();
		}
		 fe.drive();
		if(fe instanceof Car) {
			System.out.println("(Car)fe 실행");
			car2 = fe;
		}
		car2.drive();
	}
}