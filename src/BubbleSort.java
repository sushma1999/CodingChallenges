import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSort {
    public static int BubbleSort(int[] unSorted){
        int swap=0;
        for(int i=0;i<unSorted.length-1;i++){
            for(int j=0;j<unSorted.length-1;j++){
                if(unSorted[j]>unSorted[j+1])
                {
                    int tmp=unSorted[j];
                    unSorted[j]=unSorted[j+1];
                    unSorted[j+1]=tmp;
                    swap++;
                }
            }
        }
        return swap;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] inputArray = new int[n];

        for(int i=0;i < n; i++){
            inputArray[i] = in.nextInt();

        }

        int swaps =BubbleSort(inputArray);
        int first=inputArray[0];
        int last= inputArray[n-1];
        System.out.println("Array is sorted in "+swaps+" swaps." );
        System.out.println("First Element: "+first);
        System.out.println("Last Element: "+last);
    }
}
