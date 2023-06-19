package DSA_P;

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n<2){
            return 1;
        }

        return n*factorial(n-1);
    }
}
