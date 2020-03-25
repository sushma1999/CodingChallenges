import java.util.*;
public class Loops{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int result;
        for(int i=1;i<=10;i++){
            result=n*i;
            System.out.println(n +" x "+i +" = "+ result);
        }

        scanner.close();
    }
}
