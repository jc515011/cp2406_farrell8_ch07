/**
 *Wrote by Yating Lei who is sick again on19/04/2020.
 */
import java.util.Scanner;
public class BabyNameComparison {
    public static void main(String[] args) {
        // Call Scanner library for input function
        Scanner in = new Scanner(System.in);
        // Declare variables
        String bName1, bName2, bName3;

        // Input function
        System.out.print("Enter First baby name ");
        bName1 = in.nextLine();
        System.out.print("Enter Second baby name ");
        bName2 = in.nextLine();
        System.out.print("Enter Third baby name ");
        bName3 = in.nextLine();

        // 12 13 21 23 31 32
        System.out.println("Baby Name 1: " + bName1 + "-" + bName2);
        System.out.println("Baby Name 2: " + bName1 + "-" + bName3);
        System.out.println("Baby Name 3: " + bName2 + "-" + bName1);
        System.out.println("Baby Name 4: " + bName2 + "-" + bName3);
        System.out.println("Baby Name 5: " + bName3 + "-" + bName1);
        System.out.println("Baby Name 6: " + bName3 + "-" + bName2);
    }
}