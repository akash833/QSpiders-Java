package Qspiders_OOPS.Inheritance;

public class Car extends Vehicle {
    public void ac(int temp){
        System.out.println("The temperature of the ac is "+temp);
    }
    public void playMusic(){
        System.out.println("The music is played");
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.seats = 4;
        c.cc = 1000;
        System.out.println(c.seats);
        System.out.println(c.cc);
        c.accelerate();
        c.breaks();
        c.ac(16);
        c.playMusic();

        // static variable of parent class access by child class
        Vehicle.seats=6;
        System.out.println(Vehicle.seats);
        Vehicle.accelerate();
    }
}
