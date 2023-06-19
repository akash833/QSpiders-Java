package Qspiders_OOPS.BOOK;

import java.util.Scanner;

public class user {
    public static void main(String[] args) {
//        Book b1=new Book();
//        b1.title="Hello Mini";
//        b1.price=5783;
//        b1.no_of_pages=43244;
//        b1.author.name="Akash Gupta";
//        b1.author.age=32;
//        b1.author.gender="male";
//        b1.author.a.houseNo=32;
//        b1.author.a.galiNo=11;
//        b1.author.a.district="south delhi";
//        b1.author.a.country="India";
//        b1.readBook();
//        b1.writeBook();
//        b1.bookDetails();
//        b1.author.authordetails();
//        b1.author.a.adress();
        Book b2=new Book();

        b2.intilizeBook();
        b2.author.intilizeAuthor();
        b2.author.a.intilizeAddress();

        b2.bookDetails();
        b2.author.authordetails();
        b2.author.a.adress();
    }
}
