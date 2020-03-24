import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Operator {

        public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        int tip, tp, tc;
        double mc, tmp = 0.0;

        mc = scan.nextDouble();
        tip = scan.nextInt();
        tp = scan.nextInt();

       /* tmp += mc;
        tmp += mc * tip / 100;
        tmp += mc * tp / 100;*/
       AddClass myClass =new AddClass();
      tmp= myClass.Add(tmp,mc);
      tmp=myClass.Add(tmp,mc * tip / 100);
      tmp=myClass.Add(tmp,mc * tp / 100);
        tc = (int) Math.round(tmp);
        System.out.println(tc);

    }


    }
  class AddClass{

        public double Add(double a,double b){
                return a+b;
        }

  }
