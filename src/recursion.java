import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class recursion {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int res;
        res=Factorial(n);
        System.out.print(res);
    }
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        else {
            return n*Factorial(n-1);
        }
    }
}
