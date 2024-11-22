
class Lion{
	void sound() {
		System.out.println("I have loudest sound");
	}
}

class Tiger extends Lion{
	void sound() {
		System.out.println("I Roar.");
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		tiger.sound();
		
	}

}
