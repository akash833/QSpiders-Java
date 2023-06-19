package Qspiders_Programming.Type_of_Num;

import java.util.Scanner;

public class StrongNum {

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int num = n ;
        int sum = 0;

        while(n>0){
            int r = n%10;
            sum+=fact(r);
            n/=10;
        }
        if(sum==num){
            System.out.println(num +" is a strong num");
        }else{
            System.out.println(num +" is not a strong number");
        }
    }
}
