package Qspiders_Programming.Pattern;

public class pattern31 {
    public static void main(String[] args) {
        int n=5;
        int star=1;
        int space=n-1;

        for(int i=1;i<2*n;i++){
            System.out.print(i+".");
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*space;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                if(i==n && j==n){
                    break;
                }
                System.out.print("*");
            }
            if(i<n){
                star++;
                space--;
            }else{
                star--;
                space++;
            }
            System.out.println();
        }
    }
}
