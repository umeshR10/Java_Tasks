package OOPs;

class Animals{
	void sound() {
		System.out.println("sounds");
	}
}

class Cat extends Animals{
	void sound() {
		super.sound();
		System.out.println("meow");
	}
}

class Lion extends Animals{
	void sound() {
		System.out.println("roar");
	}
}

public class Polimorphism {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.sound();
		
		Lion lion = new Lion();
		lion.sound();

	}

}
