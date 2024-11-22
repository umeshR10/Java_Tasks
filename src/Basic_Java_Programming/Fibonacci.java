import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms for which fibonacci series runs: ");
		int terms = scanner.nextInt();
		System.out.println("The fibonacci series are upto " + terms + " terms are: ");
		int firstTerm = 0, secondTerm = 1;
		int nextTerm;
		for(int i=1;i<=terms;i++) {
			System.out.print(firstTerm + ", ");
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		scanner.close();
	}
}