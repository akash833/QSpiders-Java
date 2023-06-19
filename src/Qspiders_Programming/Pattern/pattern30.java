package Qspiders_Programming.Pattern;

public class pattern30 {
    public static void main(String[] args) {
        int n=5;
        int star=n;
        int space=1;
        for(int i=1;i<2*n;i++){
            for(int j=1;j<space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            if(i<n){
                star--;
                space++;
            }else{
                star++;
                space--;
            }
            System.out.println();
        }
    }
}
