package Qspiders_Programming.For_Loop;

import java.util.Scanner;

public class perfect_num {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println(n + " is a perfect number");
        }else{
            System.out.println(n + " is not a perfect number");
        }
    }
}
