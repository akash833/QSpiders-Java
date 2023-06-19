package Qspiders_OOPS.BOOK;

import java.util.Scanner;

public class Address {
    Scanner sc=new Scanner(System.in);
    int houseNo;
    int galiNo;
    String district;
    String country;

    public void intilizeAddress(){
        System.out.println("Enter your house No");
        int house_no = sc.nextInt();
        System.out.println("Enter author gali no ");
        int gali_no = sc.nextInt();
        System.out.println("Enter author district");
        String district = sc.next();
        System.out.println("Enter author country");
        String country = sc.next();
    }

    public void adress(){
        System.out.println(houseNo+" "+galiNo+" "+district+" "+country);
    }
}
