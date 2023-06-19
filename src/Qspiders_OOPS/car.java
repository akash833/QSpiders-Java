package Qspiders_OOPS;

public class car {
    String brand;
    String name;
    int cost;
    int mileage;

    public static void main(String[] args) {
        car c1=new car();
        c1.brand="TATA";
        c1.name="nano";
        c1.cost=1500000;
        c1.mileage=12;
        System.out.println(c1.brand + " "+c1.name+" "+c1.cost+" "+c1.mileage);

        car c2=new car();
        c2.brand="TATA";
        c2.name="ford";
        c2.cost=1200000;
        c2.mileage=15;
        System.out.println(c2.brand + " "+c2.name+" "+c2.cost+" "+c2.mileage);

        car c3=new car();
        c3.brand="Manindra";
        c3.name="Thar";
        c3.cost=2000000;
        c3.mileage=10;
        System.out.println(c3.brand + " "+c3.name+" "+c3.cost+" "+c3.mileage);
    }
}
