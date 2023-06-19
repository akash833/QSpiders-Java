package Qspiders_Programming.For_Loop;

import java.util.Scanner;

public class fact_of_num {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
