import java.util.Scanner;

public class StringToInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        try {
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException ex) {
            System.out.println("Bad String");

        }

    }
}