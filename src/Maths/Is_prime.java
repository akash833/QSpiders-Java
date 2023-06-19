package Maths;

import java.util.Scanner;

public class Is_prime {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int num= scr.nextInt();

        System.out.println(Prime(num));
    }
    public static String Prime(int n){
        if(n<=1){
            return "Not Prime";
        }

        for(int i=2;i*i<n;i++){
            if(n%i==0){
                return "Not Prime";
            }
        }
        return "Prime";
    }
}
