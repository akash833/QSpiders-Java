package Qspiders_Programming.For_Loop;

import java.util.Scanner;

public class perfect_sq_or_not {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n= scr.nextInt();
        boolean flag = false;
        for(int i=1;i*i<=n;i++){
            if(i*i==n){
                flag= true;
            }
        }
        if(flag){
            System.out.println(n + " is a perfect square");
        }else{
            System.out.println(n+ " is not a perfect square");
        }

    }
}
