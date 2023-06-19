package Qspiders_OOPS;

import java.util.Scanner;

public class area_m {
    public static void main(String[] args) {
//        area_cls a1=new area_cls(12,21);
        Scanner scr=new Scanner(System.in);
        int l1=scr.nextInt();
        int b1=scr.nextInt();

        area_cls a2=new area_cls();
        a2.setLength(l1);
        a2.setBreadth(b1);

        System.out.println(a2.getArea());

        int l2=scr.nextInt();
        int b2=scr.nextInt();
        a2.setArea(l2,b2);
        System.out.println(a2.getArea());
    }
}
