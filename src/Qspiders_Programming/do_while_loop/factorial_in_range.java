package Qspiders_Programming.do_while_loop;

import java.util.Scanner;

public class factorial_in_range {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int a=scr.nextInt();
        int b=scr.nextInt();
        int fact=1;
        do {
            fact = fact * a;
            System.out.println("factorail of"+a+" is "+fact);
            a++;
        } while(a<=b);
    }
}
