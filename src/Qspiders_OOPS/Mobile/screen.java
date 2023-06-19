package Qspiders_OOPS.Mobile;

public class screen {
    int width;
    String type;

    public void touch(){
        System.out.println("Touch the screen");
    }
    public void type(){
        System.out.println("The type is" + type);
    }
    public void scroll(){
        System.out.println("You can scroll the screen");
    }
}
