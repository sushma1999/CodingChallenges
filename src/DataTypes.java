import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args){
        int i,j;
        double d;
        String s;
        String a="Hackerrank";

        Scanner myScan = new Scanner(System.in);
        i=myScan.nextInt();
        d=myScan.nextDouble();
        j= (int) d;
        s=myScan.nextLine();
        System.out.println(i+j);
        System.out.println(d+d);
        System.out.println(a+s);
    }
}
