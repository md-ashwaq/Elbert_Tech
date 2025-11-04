import java.util.Scanner;

public class StringRotation {
    //How to check if two strings rotations of each other?
    public static boolean Rotation(String s1, String s2){
        //check the length and repeated test
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Word: ");
        String a = sc.nextLine();

        System.out.println("Enter Second Word: ");
        String b = sc.nextLine();

        if (Rotation(a, b))
            System.out.println("They are in rotation ");
            else
            System.out.println("They are not in rotation ");


    }
}
