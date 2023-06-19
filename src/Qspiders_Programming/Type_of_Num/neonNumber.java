package Qspiders_Programming.Type_of_Num;

import java.util.*;

public class neonNumber {

    public static int sumOfDigits(int n){
        int num = n;
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int sqaure = n*n;
        if(n==sumOfDigits(sqaure)){
            System.out.println(n+" is a neon number");
        }else{
            System.out.println(n+" is not a neon number");
        }

    }
}
