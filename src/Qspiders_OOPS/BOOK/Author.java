package Qspiders_OOPS.BOOK;

import java.util.Scanner;

public class Author {
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    String gender;
    Address a;

    public void intilizeAuthor(){
        System.out.println("Enter the name of Author");
        this.name=sc.next();
        System.out.println("Enter the age of Author Age");
        this.age=sc.nextInt();
        System.out.println("Enter the gender of Author");
        this.gender=sc.next();
    }

    Author(){
        a=new Address();
    }
    public void authordetails(){
        System.out.println(name+" "+age+" "+gender);
    }
}
