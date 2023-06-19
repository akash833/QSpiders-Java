package Maths;

import java.util.Scanner;

public class All_Prime_No {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();

        for(int i=2;i<n;i++){
            if(Prime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean Prime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
