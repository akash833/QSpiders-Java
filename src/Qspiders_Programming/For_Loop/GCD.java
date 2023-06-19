package Qspiders_Programming.For_Loop;

import java.util.Scanner;

public class GCD {

    public static void GCD_by_iteration(int a,int b){
        int x=a,y=b;
        int min = x<y ? x : y ;
        int gcd=1;
        for(int i=min;i>=1;i--){
            if(x%i==0 && y%i==0){
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);
    }
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int divisor=scr.nextInt();
        int divident=scr.nextInt();

        while(divisor!=0){
            int rem= divident%divisor;
            divident=divisor;
            divisor=rem;
        }
        System.out.println(divident);
    }
}
