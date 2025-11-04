import java.util.Scanner;

public class VowelsP {

   // How to count a number of vowels and consonants in given String ?
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int vowels = 0;
        int consonants = 0;

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowels++;
            else if (c >= 'a' && c <= 'z')
                consonants++;

        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);


    }
}
