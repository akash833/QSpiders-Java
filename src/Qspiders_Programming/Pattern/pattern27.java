package Qspiders_Programming.Pattern;

public class pattern27 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=2*i-1;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern27_if(int n){
        int space=n;
        int star=1;
        for(int i=1;i<2*n;i++){
            for(int j=1;j<space;j++){
                System.out.print(" ");
            }
            for (int k=1;k<2*star;k++){
                System.out.print("*");
            }
            if(i<n){
                space--;
                star++;
            }else{
                star--;
                space++;
            }
            System.out.println();
        }
    }
}
