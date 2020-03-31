import java.util.Scanner;

public class ReverseArray {

public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int noOfItems = scan.nextInt();
    int[] items =new int[noOfItems];
    for(int i=0;i<noOfItems;i++){
        items[i]=scan.nextInt();
            }
for (int i=noOfItems-1;i>=0;i--){
    System.out.print(items[i]+" ");
}
}
}
