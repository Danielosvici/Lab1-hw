package main;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // prime numbers
        List<Integer> p = new ArrayList<Integer>();
        for (String str : args) {
            int a = Integer.parseInt(str);
            boolean flag = false;
            if(a == 1 || a == 0)
                flag = true;
            for (int i=2; i<a; i++)
            {
                if (a%i == 0)
                    flag = true;
            }
            if (!flag)
                p.add(a);
        }
        System.out.println("The list of prime numbers is: " + p);
        // max value
        Double max = -9999.0;
        for(String str : args)
        {
            Double a = Double.parseDouble(str);
            if (max < a)
                max = a;
        }
        System.out.println("The maximum value is: " + max);
        // min value
        double min = 9999.0;
        for(String str : args)
        {
            double a = Double.parseDouble(str);
            if (min > a)
                min = a;
        }
        System.out.println("The minimum value is: " + min);
        // gcd and scm
        if(args.length <= 2)
        {

            int gcd = 1;
            int scm = -1; // exception
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
            if (a == 0 || b== 0)
                scm = 0;
            else {
                scm = Math.abs(a * b) / gcd;
            }
            System.out.println("The gcd is: " + gcd);
            System.out.println("The scm is: " + scm);
        }
        }
    }