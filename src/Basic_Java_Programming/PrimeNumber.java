import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scanner.nextInt();

        boolean res = isPrime(number);
        if (res){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }
    }

    public static boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}