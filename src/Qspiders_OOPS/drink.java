package Qspiders_OOPS;

public class drink {
    String name;
    int quantity;
    int price;
    public static void main(String[] args) {
        drink d1=new drink();
        d1.name="Jal Jira";
        d1.quantity=100;
        d1.price=10;
        System.out.println(d1.name +" "+d1.quantity+" "+d1.price);


        drink d2=new drink();
        d2.name="String";
        d2.quantity=100;
        d2.price=10;
        System.out.println(d2.name +" "+d2.quantity+" "+d2.price);


        drink d3=new drink();
        d3.name="Jal Jira";
        d3.quantity=100;
        d3.price=10;
        System.out.println(d3.name +" "+d3.quantity+" "+d3.price);
    }
}
