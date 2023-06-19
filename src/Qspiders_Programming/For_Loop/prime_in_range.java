package Qspiders_Programming.For_Loop;

import java.util.Scanner;

public class prime_in_range {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int a=scr.nextInt();
        int b=scr.nextInt();

        for(int i=a;i<=b;i++) {
            boolean check=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    check=false;
                    break;
                }
            }
            if(check){
                System.out.println(i);
            }
        }
    }
}
