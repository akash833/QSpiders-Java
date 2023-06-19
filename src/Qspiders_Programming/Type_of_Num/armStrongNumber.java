package Qspiders_Programming.Type_of_Num;

import java.util.Scanner;

public class armStrongNumber {

    public static int count(int n){
        int num=n;
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }

    public static int pow(int n,int p){
        int ans=1;
        for(int i=1;i<=p;i++){
            ans*=n;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int num = n;
        int p = count(n);
        int sum = 0;

        while(n>0){
            int r = n%10;
            sum += pow(r,p);
            n/=10;
        }
        if(sum==num){
            System.out.println(num + " is a armstrong number");
        }else{
            System.out.println(num +" is a not a armstrong number");
        }
    }
}
