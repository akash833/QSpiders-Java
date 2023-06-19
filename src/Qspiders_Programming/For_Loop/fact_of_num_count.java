package Qspiders_Programming.For_Loop;

import java.util.Scanner;

public class fact_of_num_count {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int count=0;

        for(int i=1;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
