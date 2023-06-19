package Qspiders_OOPS;

public class Laptop {
    private String model;
    private int price;
    private String OS;
    private int Ram;


    Laptop(String model, int price,String OS,int Ram){
        this.model=model;
        this.price=price;
        this.OS=OS;
        this.Ram=Ram;
    }

    public void setModel(String model){
        this.model=model;
    }

    public String getModel(){
        return this.model;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public int getPrice(){
        return this.price;
    }

    public void setOS(String OS){
        this.OS=OS;
    }

    public String getOS(){
        return this.OS;
    }

    public void set_Ram(int Ram){
        this.Ram=Ram;
    }

    public int get_Ram(){
        return this.Ram;
    }
}
