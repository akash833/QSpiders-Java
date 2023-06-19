package Qspiders_Programming.do_while_loop;

import java.util.Scanner;

public class check_no_start_with_even {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        do{
            n/=10;
        }while(n>9);

        if(n%2==0){
            System.out.println("Starting number is even");
        }else{
            System.out.println("Starting number is odd");
        }
    }
}
