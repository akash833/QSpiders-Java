package Qspiders_Programming.Type_of_Num;

import java.util.Scanner;

public class sunnyNumber {

    public static boolean perfect_square(int n){
        for(int i=1;i*i<=n;i++){
            if(i*i==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();

        if(perfect_square(n+1)){
            System.out.println(n+" is a sunny number");
        }else{
            System.out.println(n+" is not a sunny number");
        }
    }
}
