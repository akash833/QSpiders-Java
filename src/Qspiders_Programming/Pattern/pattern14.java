package Qspiders_Programming.Pattern;

public class pattern14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=n-i;k++){
                System.out.print(n-k-i+1);
            }
            System.out.println();
        }
    }
}
