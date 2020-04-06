import java.util.*;
        import java.io.*;

class MinimumNoOfJumpsToEnd {
    // Returns minimum number of
    // jumps to reach arr[h] from arr[l]
    static int minJumps(int arr[], int l, int h)
    {
        // Base case: when source
        // and destination are same
        if (h == l)
            return 0;

        // When nothing is reachable
        // from the given source
        if (arr[l] == 0)
            return Integer.MAX_VALUE;

        // Traverse through all the points
        // reachable from arr[l]. Recursively
        // get the minimum number of jumps
        // needed to reach arr[h] from these
        // reachable points.
        int min = Integer.MAX_VALUE;
        for (int i = l + 1; i <= h && i <= l + arr[l]; i++) {
            int jumps = minJumps(arr, i, h);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
                min = jumps + 1;
        }
        return min;
    }

    // Driver code
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print( minJumps(arr, 0, n ));
    }
}
