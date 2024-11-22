package OOPs;

class Vehicle{
	void sound() {
		System.out.println("sounds");
	}
}

class Car extends Vehicle{
	void sound() {
		super.sound();
		System.out.println("wroom");
	}
}

class Bike extends Vehicle{
	void sound() {
		System.out.println("dhuk...dhuk");
	}
}

public class Polimorphism {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.sound();
		
		Bike bike = new Bike();
		bike.sound();

	}

}
