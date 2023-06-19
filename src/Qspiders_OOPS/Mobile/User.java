package Qspiders_OOPS.Mobile;

public class User {
    public static void main(String[] args) {
        mobile m1=new mobile();

        // Before installize the value
        // install memory card , sim1, sim2
        m1.installMemoryCard();
        m1.installSim1();
        m1.installSim2();

        // battery property
        System.out.println(m1.b.capacity);
        System.out.println(m1.b.brand);
        m1.b.charging();
        m1.b.discharging();

        // screen property
        System.out.println(m1.s.width);
        System.out.println(m1.s.type);
        m1.s.touch();
        m1.s.type();
        m1.s.scroll();

        // memory property
        System.out.println(m1.mc.name);
        System.out.println(m1.mc.size);
        System.out.println(m1.mc.price);
        m1.mc.storeMovie();
        m1.mc.storeMusic();

        // sim1
        System.out.println(m1.s1.operator);
        System.out.println(m1.s1.balance);
        m1.s1.dialedCall();
        m1.s1.recievedCall();
        m1.s1.missedCall();

        // sim2
        System.out.println(m1.s2.operator);
        System.out.println(m1.s2.balance);
        m1.s2.dialedCall();
        m1.s2.recievedCall();
        m1.s2.missedCall();

        m1.b.capacity=5000;
        m1.b.brand="One Plus";
        m1.s.width=1400;
        m1.s.type="Gorilla Glass";
        m1.mc.name="San Disk";
        m1.mc.size=32;
        m1.mc.price=999;
        m1.s1.operator="Airtel";
        m1.s1.balance=432;
        m1.s2.operator="Jio";
        m1.s2.balance=456;


        // After installize the value
        // install memory card , sim1, sim2
        m1.installMemoryCard();
        m1.installSim1();
        m1.installSim2();

        // battery property
        System.out.println(m1.b.capacity);
        System.out.println(m1.b.brand);
        m1.b.charging();
        m1.b.discharging();

        // screen property
        System.out.println(m1.s.width);
        System.out.println(m1.s.type);
        m1.s.touch();
        m1.s.type();
        m1.s.scroll();

        // memory property
        System.out.println(m1.mc.name);
        System.out.println(m1.mc.size);
        System.out.println(m1.mc.price);
        m1.mc.storeMovie();
        m1.mc.storeMusic();

        // sim1
        System.out.println(m1.s1.operator);
        System.out.println(m1.s1.balance);
        m1.s1.dialedCall();
        m1.s1.recievedCall();
        m1.s1.missedCall();

        // sim2
        System.out.println(m1.s2.operator);
        System.out.println(m1.s2.balance);
        m1.s2.dialedCall();
        m1.s2.recievedCall();
        m1.s2.missedCall();
    }
}
