package Qspiders_Programming.Pattern;

public class pattern28 {
    public static void main(String[] args) {
        int n=10;
//        for(int i=n;i>=1;i--){
//            for(int j=5;j>i;j--){
//                System.out.print(" ");
//            }
//            for(int k=2*i-1;k>=1;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i=1;i<n;i++){
//            for(int j=1;j<n-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=2*i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        pattern28_if(n);
    }

    public static void pattern28_if(int n){
        int star = n;
        int space = 1;
        for(int i=1;i<=2*n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<2*star;k++){
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
