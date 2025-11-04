public class StringP {
    public static void main(String[] args){
        String str = "Hello World";

        // Length
        System.out.println("Length: " + str.length());

        // upper and lower case
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // Substring
        System.out.println("Substring(0,5): " + str.substring(0,5));

        // Replace
        System.out.println("Replace: " + str.replace('l', 'w'));

        // Trim
        String spacedString = "  Trimmed String  ";
        System.out.println("Trimmed: '" + spacedString.trim() + "'");

        // Split string
        String[] words = str.split(" ");
        System.out.println("First word: " + words[0]);

        // Check if string starts/ends with
        System.out.println("Starts with 'He': " + str.startsWith("He"));
        System.out.println("Ends with 'ld': " + str.endsWith("ld"));
    }
}

