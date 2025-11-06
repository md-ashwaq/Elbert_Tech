import java.util.Scanner;

public class PrimeNum {
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
            return true;
    }


    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(isPrime(num))
            System.out.println("The number is Prime");
        else
            System.out.println("The number is NOT Prime");



    }
}
