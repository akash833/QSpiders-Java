package Qspiders_Programming.For_Loop;

import java.util.Scanner;

public class table_11_20 {
    public static void main(String[] args) {

        for(int i=11;i<=20;i++){
            System.out.println("****** Table of "+i+" ********");
            for (int j=1;j<=10;j++){
                System.out.println( i +" X "+ j +" = "+i*j);
            }
        }
    }
}
