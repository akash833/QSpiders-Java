package Qspiders_Programming.Pattern;

public class pattern25 {
    public static void main(String[] args) {
        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i=n-1;i>=1;i--){
//            for(int j=i;j>=1;j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        pattern25_if(n);
    }

    public static void pattern25_if(int n){
        int star=1;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(i<n){
                star++;
            }else{
                star--;
            }
            System.out.println();
        }
    }
}
