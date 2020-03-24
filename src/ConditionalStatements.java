import java.util.*;

public class ConditionalStatements {

    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int no=scan.nextInt();
        if(no%2==0)
        {
            if(no>=2 && no<=5)
            {
                System.out.println("Not Weird");
            }
            else if(no>=6&& no<=20)
            {
                System.out.println("Weird");
            }
            else
            {
                System.out.println("Not Weird");
            }
        }
        else
        {
            System.out.println("Weird");
        }
    }
}
