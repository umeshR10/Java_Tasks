import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string which has to be reverse: ");
		String string = scanner.nextLine();
        String str = "";
        
        for (int i = string.length() - 1; i >= 0; i--) {
            str = str + string.charAt(i); 
        }

        System.out.println("Reversed string: " + str);
        scanner.close();
	}

}
