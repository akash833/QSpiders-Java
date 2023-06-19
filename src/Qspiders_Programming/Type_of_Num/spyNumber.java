package Qspiders_Programming.Type_of_Num;

import java.util.Scanner;

public class spyNumber {

    public static int sumOfDigits(int n){
        int num = n;
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static int productOfSum(int n){
        int num = n;
        int prod=1;
        while(num>0){
            prod*=(num%10);
            num/=10;
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        if(sumOfDigits(n)==productOfSum(n)){
            System.out.println(n+" is a spy number");
        }else{
            System.out.println(n+" is not a spy number");
        }
    }
}
