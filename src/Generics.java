import java.util.Scanner;

public class Generics {
    public static<T> void printArray(T[] array) {
        for (T item : array) {

            System.out.print(item + " ");
        }
    }
    public static void main(String[] args)
    {
        //
        Integer[] arr = {1,2,3,4,5};
        Character[] characterArray = {'A','B','C','D','E'};
        Double[] doubleArray = {12123413.00, 3213123.00 , 23131323.00,13231231.00 ,1231231.00};
        printArray(arr);
        printArray(characterArray);
        printArray(doubleArray);
    }
    }


