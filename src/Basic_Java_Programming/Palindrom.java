import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number for checking palindrom: ");
		int number = scanner.nextInt();
		int originalNumber = number;
		int reverseNumber = 0;
		while(number != 0) {
			int rem = number % 10;
			reverseNumber = reverseNumber * 10 + rem;
			number /= 10;
		}
		if(originalNumber == reverseNumber) {
			System.out.println("the Number "+ originalNumber +" is palindrom.");
		}else {
			System.out.println("the Number "+ originalNumber +" is not palindrom.");
		}
		scanner.close();
	}

}
