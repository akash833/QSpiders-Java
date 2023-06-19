package Qspiders_OOPS;

public class shop_m {
    public static void main(String[] args) {
        shop_cls s1=new shop_cls();
        s1.set_name("Flipkart");
        s1.set_gst("53287AKSJ6597468");
        s1.set_address("Gali no 11 samta vihar mukundpur");
        s1.set_mob(967565645);

        System.out.println(s1.get_name());
        System.out.println(s1.get_gst());
        System.out.println(s1.get_mob());
        System.out.println(s1.get_address());
    }
}
