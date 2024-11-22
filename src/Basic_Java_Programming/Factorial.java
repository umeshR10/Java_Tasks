import java.util.Scanner;

public class Factorial {
	
	static int fact(int num) {
		if(num==0||num==1) {
			return 1;
		}else {
			return num * fact(num-1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the nuumber for which factorial need: ");
		int number = scanner.nextInt();
		int result = fact(number);
		System.out.println(result);
	}

}
