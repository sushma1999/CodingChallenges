import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Arrays {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] =scanner.nextInt();
        }
        for(int j=n-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
        scanner.close();
    }
}
