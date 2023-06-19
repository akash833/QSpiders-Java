package Qspiders_OOPS.BOOK;

import java.util.Scanner;

public class Book {
    Scanner sc=new Scanner(System.in);
    String title;
    int price;
    int no_of_pages;
    Author author;

    public void intilizeBook(){
        System.out.println("Enter the title of Book");
        this.title=sc.next();
        System.out.println("Enter the price of Book");
        this.price=sc.nextInt();
        System.out.println("Enter the No of pages of book");
        this.no_of_pages=sc.nextInt();
    }

    Book(){
        author=new Author();
    }

    public void readBook(){
        System.out.println("Hello I am reading Book");
    }
    public void writeBook(){
        System.out.println("Hello I am writing Book");
    }
    public void bookDetails(){
        System.out.println(title+" "+price+" "+no_of_pages);
        author.authordetails();
        author.a.adress();
    }
}
