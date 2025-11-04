import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(int num){
            int original = num;
            int reversed = 0;

            //reverse
            while (num > 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            return original == reversed;

        }


    public static void main (String[] args){
        //palindrome check
    Scanner x = new Scanner(System.in);
    System.out.println("Enter number to check Palindrome!: ");
    int num = x.nextInt();

    if (isPalindrome(num))
        System.out.println("is Palindrome");
    else
        System.out.println("Not Palindrome");
return ;

    }
}
