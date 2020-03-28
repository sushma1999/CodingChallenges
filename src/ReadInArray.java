import java.sql.Array;
import java.util.Scanner;

public class ReadInArray {
    public static void main(String[] args)
    {
        String[] myArray = new String[100];
        Scanner scan = new Scanner(System.in);
        int count =0;
        while (scan.hasNext()) {
            String input = scan.nextLine();
            if (input.equals("end"))
            {
                break;
            }
           myArray[count]= input;
           count++;
        }

        /*for (int i=0;i<count; i++) {
            System.out.print(myArray[i] + " ");
        }*/

        int i=0;
        while(i<count){
            System.out.print(myArray[i] + " ");
             i++;
        }
    }



}
