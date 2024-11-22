
class Animal{
	void lion() {
		System.out.println("I am king.");
	}
	void lion(int number) {
		System.out.println("My numbers are "+number+" in maharaj bagh.");
	}
}

public class Overloding {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.lion();
		animal.lion(5);

	}

}
