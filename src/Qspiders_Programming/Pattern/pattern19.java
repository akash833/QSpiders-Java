package Qspiders_Programming.Pattern;

public class pattern19 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(n-k+1);
            }
            System.out.println();
        }
        pattern19_2(n);
    }
    public static void pattern19_2(int n){
        System.out.println("Second Method");

        for(int i=n;i>=1;i--){
            for(int j=i;j>1;j--){
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
