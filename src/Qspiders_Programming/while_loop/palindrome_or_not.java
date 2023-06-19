package Qspiders_Programming.while_loop;

import java.util.Scanner;

public class palindrome_or_not {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int r_num=0;
        int num=n;
        while(num>0){
            int r=num%10;
            r_num = r_num*10 + r;
            num/=10;
        }
        if(r_num==n){
            System.out.println(n+" is a Palindrome number");
        }else{
            System.out.println(n+" is not a Palindrome number");
        }
    }
}
