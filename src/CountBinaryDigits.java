import java.util.Scanner;

public class CountBinaryDigits {
    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        String str=Integer.toBinaryString(n);
        char[] cArray=str.toCharArray();
        int num=0;
        int max=0;
        int i=0;
        while(i<cArray.length){
            if(cArray[i]=='1'){
                num++;
            }else
            {
                num=0;
            }
            if(max<num){
                max=num;
            }
            i++;
          }
           System.out.println(max);
    }
}
