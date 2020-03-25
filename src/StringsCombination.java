import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class StringsCombination {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int t=scan.nextInt();
        String[] s=new String[t];
        String e="", o="";
        for(int i=0;i<t;i++)
        {
            s[i]=scan.next();
            int l=s[i].length();
            char c[]=s[i].toCharArray();
            for(int j=0;j<l;j++)
            {
                if(j%2==0)
                {
                    e+=c[j];
                }
                else{
                    o+=c[j];
                }
            }
            System.out.println(e+" "+o);
            e="";
            o="";
        }
    }
}