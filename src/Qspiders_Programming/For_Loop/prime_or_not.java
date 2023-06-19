package Qspiders_Programming.For_Loop;

import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();

        boolean check=true;
        for(int j=2;j<n;j++){
            if(n%j==0){
                check=false;
                break;
            }
        }
        if(check){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n +" is not a prime number");
        }
    }
}
