package Qspiders_OOPS;

public class Laptop_m {
    public static void main(String[] args) {
        Laptop L1=new Laptop("Dell Insprion",2334,"Window 11",2);
        System.out.println(L1.getModel()+" "+L1.getPrice()+" "+L1.getOS()+" "+L1.get_Ram());
        L1.setPrice(3443);
        System.out.println(L1.getPrice());
    }
}