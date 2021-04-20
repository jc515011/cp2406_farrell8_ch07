/**
 *Wrote by Yating Lei who is sick again on 19/04/2020.
 */
import java.util.Scanner;
public class InputCharacterInfo {
    public static void main(String[] args) {
        // Call Scanner library for input function
        Scanner in = new Scanner(System.in);
        // Declare variables
        char aChar = 'C';
        String temp = "";
        // Input function
        System.out.print("Enter a Character to check ");
        temp = in.nextLine();
        // Convert input string to char
        aChar = temp.charAt(0);

        if (Character.isUpperCase(aChar))
            System.out.println(aChar + " is uppercase");
        else
            System.out.println(aChar + " is not uppercase");

        if (Character.isLowerCase(aChar))
            System.out.println(aChar + " is lowercase");
        else
            System.out.println(aChar + " is not lowercase");
        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar);

        if (Character.isLetterOrDigit(aChar))
            System.out.println(aChar + " is a letter or digit");
        else
            System.out.println(aChar + " is neither a letter nor a digit");

        if (Character.isWhitespace(aChar))
            System.out.println(aChar + " is whitespace");
        else
            System.out.println(aChar + " is not whitespace");
    }
}