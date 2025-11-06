import java.util.Scanner;

public class Fibonacci {
    public static void  main (String[] args){
        int first = 0;
        int second = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.print("The terms are: ");
        for ( int i = 0; i <= num; i++) {
            System.out.print(first + " ");
            int next = second + first;
            first = second;
            second = next;
        }
    }
}
