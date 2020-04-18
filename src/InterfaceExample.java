import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class DivisorCalculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int i=1,sum=0;
        while(i<=n)
        {
            if(n%i==0)
        {
            sum=sum+i;
        }
            i++;
        }
        return sum;

          }
}

public class InterfaceExample  {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new DivisorCalculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}

