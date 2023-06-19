package Qspiders_OOPS;

public class area_cls {
    private int length;
    private int breadth;

    public void area_cls(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public void area_cls(){}

    public void setLength(int length){
        this.length=length;
    }
    public void setBreadth(int breadth){
        this.breadth=breadth;
    }
    public int getLength(){
        return this.length;
    }
    public int getBreadth(){
        return this.breadth;
    }
    public void setArea(int length,int breadth){
        setLength(length);
        setBreadth(breadth);
    }
    public int getArea(){
        return getLength()*getBreadth();
    }
}
