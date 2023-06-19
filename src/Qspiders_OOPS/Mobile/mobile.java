package Qspiders_OOPS.Mobile;

public class mobile {
    battery b;
    screen s;
    memoryCard mc;
    sim1 s1;
    sim2 s2;

    mobile(){
        b=new battery();
        s=new screen();
    }

    public void installMemoryCard(){
        mc=new memoryCard();
    }

    public void installSim1(){
        s1=new sim1();
    }

    public void installSim2(){
        s2=new sim2();
    }
}
