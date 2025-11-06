import java.util.Scanner;

public class EvenNOdd {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        if(a%2==0)
            System.out.println("Its an Even Number");
        else
            System.out.println("Its an Odd Number");
    }
}
