package Qspiders_Programming.Pattern;

public class pattern26 {
    public static void main(String[] args) {
        int n=5;
        int sp=n;
        int star=1;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(i<n){
                sp--;
                star++;
            }else{
                sp++;
                star--;
            }
            System.out.println();
        }
    }
}
