package Maths;

import java.util.Scanner;

public class Digits_of_no {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();

        while(n>0){
            int r=n%10;
            System.out.println(r);
            n=n/10;
        }
    }
}
