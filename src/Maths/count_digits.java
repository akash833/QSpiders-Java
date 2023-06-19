package Maths;

import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int num=scr.nextInt();
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }

        System.out.println(count);
    }
}
