package OOPs;

class Rupees{
	int rupees = 5000;
}

class Money extends Rupees{
	int rupees = 10000;
	
	void show() {
		System.out.println(super.rupees);
		System.out.println(rupees);
	}
}

public class Super {

	public static void main(String[] args) {
		
		Money money = new Money();
		money.show();

	}
}
