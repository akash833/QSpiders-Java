package Qspiders_Programming.Pattern;

public class pattern24 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=2*i-1;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
