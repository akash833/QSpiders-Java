package Qspiders_Programming.For_Loop;

public class n_to_power_p {
    public static void main(String[] args) {
        int n=3, p=5;
        int prod=1;
        for(int i=1;i<=p;i++){
            prod*=n;
        }
        System.out.println(prod);
    }
}
